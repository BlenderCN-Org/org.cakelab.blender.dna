package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeTexMagic'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=972, size64=976)
public class NodeTexMagic extends CFacade {

	/**
	 * This is the sdna index of the struct NodeTexMagic.
	 * <p>
	 * It is required when allocating a new block to store data for NodeTexMagic.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 433;

	/**
	 * Field descriptor (offset) for struct member 'base'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexMagic nodetexmagic = ...;
	 * CPointer&lt;Object&gt; p = nodetexmagic.__dna__addressof(NodeTexMagic.__DNA__FIELD__base);
	 * CPointer&lt;NodeTexBase&gt; p_base = p.cast(new Class[]{NodeTexBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base'</li>
	 * <li>Signature: 'NodeTexBase'</li>
	 * <li>Actual Size (32bit/64bit): 964/968</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'depth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexMagic nodetexmagic = ...;
	 * CPointer&lt;Object&gt; p = nodetexmagic.__dna__addressof(NodeTexMagic.__DNA__FIELD__depth);
	 * CPointer&lt;Integer&gt; p_depth = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'depth'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__depth = new long[]{964, 968};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeTexMagic nodetexmagic = ...;
	 * CPointer&lt;Object&gt; p = nodetexmagic.__dna__addressof(NodeTexMagic.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{968, 972};

	public NodeTexMagic(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeTexMagic(NodeTexMagic that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public NodeTexBase getBase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new NodeTexBase(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new NodeTexBase(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public void setBase(NodeTexBase base) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(base, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, base)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, base);
		} else {
			__io__generic__copy( getBase(), base);
		}
	}

	/**
	 * Get method for struct member 'depth'.
	 * @see #__DNA__FIELD__depth
	 */
	
	public int getDepth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 968);
		} else {
			return __io__block.readInt(__io__address + 964);
		}
	}

	/**
	 * Set method for struct member 'depth'.
	 * @see #__DNA__FIELD__depth
	 */
	
	public void setDepth(int depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 968, depth);
		} else {
			__io__block.writeInt(__io__address + 964, depth);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 972);
		} else {
			return __io__block.readInt(__io__address + 968);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 972, pad);
		} else {
			__io__block.writeInt(__io__address + 968, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeTexMagic> __io__addressof() {
		return new CPointer<NodeTexMagic>(__io__address, new Class[]{NodeTexMagic.class}, __io__block, __io__blockTable);
	}

}
