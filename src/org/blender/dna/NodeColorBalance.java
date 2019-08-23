package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeColorBalance'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=96, size64=96)
public class NodeColorBalance extends CFacade {

	/**
	 * This is the sdna index of the struct NodeColorBalance.
	 * <p>
	 * It is required when allocating a new block to store data for NodeColorBalance.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 385;

	/**
	 * Field descriptor (offset) for struct member 'slope'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorBalance nodecolorbalance = ...;
	 * CPointer&lt;Object&gt; p = nodecolorbalance.__dna__addressof(NodeColorBalance.__DNA__FIELD__slope);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_slope = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slope'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slope = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'offset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorBalance nodecolorbalance = ...;
	 * CPointer&lt;Object&gt; p = nodecolorbalance.__dna__addressof(NodeColorBalance.__DNA__FIELD__offset);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_offset = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'offset'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__offset = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'power'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorBalance nodecolorbalance = ...;
	 * CPointer&lt;Object&gt; p = nodecolorbalance.__dna__addressof(NodeColorBalance.__DNA__FIELD__power);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_power = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'power'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__power = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'lift'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorBalance nodecolorbalance = ...;
	 * CPointer&lt;Object&gt; p = nodecolorbalance.__dna__addressof(NodeColorBalance.__DNA__FIELD__lift);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_lift = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lift'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lift = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'gamma'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorBalance nodecolorbalance = ...;
	 * CPointer&lt;Object&gt; p = nodecolorbalance.__dna__addressof(NodeColorBalance.__DNA__FIELD__gamma);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gamma = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gamma'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gamma = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'gain'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorBalance nodecolorbalance = ...;
	 * CPointer&lt;Object&gt; p = nodecolorbalance.__dna__addressof(NodeColorBalance.__DNA__FIELD__gain);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gain = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gain'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gain = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'lift_lgg'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorBalance nodecolorbalance = ...;
	 * CPointer&lt;Object&gt; p = nodecolorbalance.__dna__addressof(NodeColorBalance.__DNA__FIELD__lift_lgg);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_lift_lgg = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lift_lgg'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lift_lgg = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'gamma_inv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeColorBalance nodecolorbalance = ...;
	 * CPointer&lt;Object&gt; p = nodecolorbalance.__dna__addressof(NodeColorBalance.__DNA__FIELD__gamma_inv);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gamma_inv = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gamma_inv'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gamma_inv = new long[]{84, 84};

	public NodeColorBalance(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeColorBalance(NodeColorBalance that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'slope'.
	 * @see #__DNA__FIELD__slope
	 */
	
	public CArrayFacade<Float> getSlope() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'slope'.
	 * @see #__DNA__FIELD__slope
	 */
	
	public void setSlope(CArrayFacade<Float> slope) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(slope, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, slope)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, slope);
		} else {
			__io__generic__copy( getSlope(), slope);
		}
	}

	/**
	 * Get method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public CArrayFacade<Float> getOffset() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'offset'.
	 * @see #__DNA__FIELD__offset
	 */
	
	public void setOffset(CArrayFacade<Float> offset) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 12;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(offset, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, offset)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, offset);
		} else {
			__io__generic__copy( getOffset(), offset);
		}
	}

	/**
	 * Get method for struct member 'power'.
	 * @see #__DNA__FIELD__power
	 */
	
	public CArrayFacade<Float> getPower() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'power'.
	 * @see #__DNA__FIELD__power
	 */
	
	public void setPower(CArrayFacade<Float> power) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(power, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, power)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, power);
		} else {
			__io__generic__copy( getPower(), power);
		}
	}

	/**
	 * Get method for struct member 'lift'.
	 * @see #__DNA__FIELD__lift
	 */
	
	public CArrayFacade<Float> getLift() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'lift'.
	 * @see #__DNA__FIELD__lift
	 */
	
	public void setLift(CArrayFacade<Float> lift) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 36;
		} else {
			__dna__offset = 36;
		}
		if (__io__equals(lift, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, lift)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, lift);
		} else {
			__io__generic__copy( getLift(), lift);
		}
	}

	/**
	 * Get method for struct member 'gamma'.
	 * @see #__DNA__FIELD__gamma
	 */
	
	public CArrayFacade<Float> getGamma() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gamma'.
	 * @see #__DNA__FIELD__gamma
	 */
	
	public void setGamma(CArrayFacade<Float> gamma) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 48;
		}
		if (__io__equals(gamma, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gamma)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gamma);
		} else {
			__io__generic__copy( getGamma(), gamma);
		}
	}

	/**
	 * Get method for struct member 'gain'.
	 * @see #__DNA__FIELD__gain
	 */
	
	public CArrayFacade<Float> getGain() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 60, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gain'.
	 * @see #__DNA__FIELD__gain
	 */
	
	public void setGain(CArrayFacade<Float> gain) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 60;
		} else {
			__dna__offset = 60;
		}
		if (__io__equals(gain, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gain)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gain);
		} else {
			__io__generic__copy( getGain(), gain);
		}
	}

	/**
	 * Get method for struct member 'lift_lgg'.
	 * @see #__DNA__FIELD__lift_lgg
	 */
	
	public CArrayFacade<Float> getLift_lgg() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 72, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'lift_lgg'.
	 * @see #__DNA__FIELD__lift_lgg
	 */
	
	public void setLift_lgg(CArrayFacade<Float> lift_lgg) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 72;
		}
		if (__io__equals(lift_lgg, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, lift_lgg)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, lift_lgg);
		} else {
			__io__generic__copy( getLift_lgg(), lift_lgg);
		}
	}

	/**
	 * Get method for struct member 'gamma_inv'.
	 * @see #__DNA__FIELD__gamma_inv
	 */
	
	public CArrayFacade<Float> getGamma_inv() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 84, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 84, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gamma_inv'.
	 * @see #__DNA__FIELD__gamma_inv
	 */
	
	public void setGamma_inv(CArrayFacade<Float> gamma_inv) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 84;
		} else {
			__dna__offset = 84;
		}
		if (__io__equals(gamma_inv, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gamma_inv)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gamma_inv);
		} else {
			__io__generic__copy( getGamma_inv(), gamma_inv);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeColorBalance> __io__addressof() {
		return new CPointer<NodeColorBalance>(__io__address, new Class[]{NodeColorBalance.class}, __io__block, __io__blockTable);
	}

}