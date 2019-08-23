package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ShrinkwrapModifierData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=184, size64=208)
public class ShrinkwrapModifierData extends CFacade {

	/**
	 * This is the sdna index of the struct ShrinkwrapModifierData.
	 * <p>
	 * It is required when allocating a new block to store data for ShrinkwrapModifierData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 122;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__modifier);
	 * CPointer&lt;ModifierData&gt; p_modifier = p.cast(new Class[]{ModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'ModifierData'</li>
	 * <li>Actual Size (32bit/64bit): 96/112</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'target'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__target);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_target = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'target'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__target = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'auxTarget'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__auxTarget);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_auxTarget = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'auxTarget'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__auxTarget = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_name'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__vgroup_name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_vgroup_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup_name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup_name = new long[]{104, 128};

	/**
	 * Field descriptor (offset) for struct member 'keepDist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__keepDist);
	 * CPointer&lt;Float&gt; p_keepDist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'keepDist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__keepDist = new long[]{168, 192};

	/**
	 * Field descriptor (offset) for struct member 'shrinkType'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__shrinkType);
	 * CPointer&lt;Short&gt; p_shrinkType = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shrinkType'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shrinkType = new long[]{172, 196};

	/**
	 * Field descriptor (offset) for struct member 'shrinkOpts'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__shrinkOpts);
	 * CPointer&lt;Byte&gt; p_shrinkOpts = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shrinkOpts'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shrinkOpts = new long[]{174, 198};

	/**
	 * Field descriptor (offset) for struct member 'pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__pad1);
	 * CPointer&lt;Byte&gt; p_pad1 = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad1'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad1 = new long[]{175, 199};

	/**
	 * Field descriptor (offset) for struct member 'projLimit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__projLimit);
	 * CPointer&lt;Float&gt; p_projLimit = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'projLimit'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__projLimit = new long[]{176, 200};

	/**
	 * Field descriptor (offset) for struct member 'projAxis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__projAxis);
	 * CPointer&lt;Byte&gt; p_projAxis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'projAxis'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__projAxis = new long[]{180, 204};

	/**
	 * Field descriptor (offset) for struct member 'subsurfLevels'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__subsurfLevels);
	 * CPointer&lt;Byte&gt; p_subsurfLevels = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subsurfLevels'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subsurfLevels = new long[]{181, 205};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ShrinkwrapModifierData shrinkwrapmodifierdata = ...;
	 * CPointer&lt;Object&gt; p = shrinkwrapmodifierdata.__dna__addressof(ShrinkwrapModifierData.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{182, 206};

	public ShrinkwrapModifierData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ShrinkwrapModifierData(ShrinkwrapModifierData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public ModifierData getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ModifierData(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(ModifierData modifier) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(modifier, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modifier)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modifier);
		} else {
			__io__generic__copy( getModifier(), modifier);
		}
	}

	/**
	 * Get method for struct member 'target'.
	 * @see #__DNA__FIELD__target
	 */
	
	public CPointer<BlenderObject> getTarget() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'target'.
	 * @see #__DNA__FIELD__target
	 */
	
	public void setTarget(CPointer<BlenderObject> target) throws IOException
	{
		long __address = ((target == null) ? 0 : target.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 96, __address);
		}
	}

	/**
	 * Get method for struct member 'auxTarget'.
	 * @see #__DNA__FIELD__auxTarget
	 */
	
	public CPointer<BlenderObject> getAuxTarget() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 100);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'auxTarget'.
	 * @see #__DNA__FIELD__auxTarget
	 */
	
	public void setAuxTarget(CPointer<BlenderObject> auxTarget) throws IOException
	{
		long __address = ((auxTarget == null) ? 0 : auxTarget.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 100, __address);
		}
	}

	/**
	 * Get method for struct member 'vgroup_name'.
	 * @see #__DNA__FIELD__vgroup_name
	 */
	
	public CArrayFacade<Byte> getVgroup_name() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vgroup_name'.
	 * @see #__DNA__FIELD__vgroup_name
	 */
	
	public void setVgroup_name(CArrayFacade<Byte> vgroup_name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 128;
		} else {
			__dna__offset = 104;
		}
		if (__io__equals(vgroup_name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vgroup_name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vgroup_name);
		} else {
			__io__generic__copy( getVgroup_name(), vgroup_name);
		}
	}

	/**
	 * Get method for struct member 'keepDist'.
	 * @see #__DNA__FIELD__keepDist
	 */
	
	public float getKeepDist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 192);
		} else {
			return __io__block.readFloat(__io__address + 168);
		}
	}

	/**
	 * Set method for struct member 'keepDist'.
	 * @see #__DNA__FIELD__keepDist
	 */
	
	public void setKeepDist(float keepDist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 192, keepDist);
		} else {
			__io__block.writeFloat(__io__address + 168, keepDist);
		}
	}

	/**
	 * Get method for struct member 'shrinkType'.
	 * @see #__DNA__FIELD__shrinkType
	 */
	
	public short getShrinkType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 196);
		} else {
			return __io__block.readShort(__io__address + 172);
		}
	}

	/**
	 * Set method for struct member 'shrinkType'.
	 * @see #__DNA__FIELD__shrinkType
	 */
	
	public void setShrinkType(short shrinkType) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 196, shrinkType);
		} else {
			__io__block.writeShort(__io__address + 172, shrinkType);
		}
	}

	/**
	 * Get method for struct member 'shrinkOpts'.
	 * @see #__DNA__FIELD__shrinkOpts
	 */
	
	public byte getShrinkOpts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 198);
		} else {
			return __io__block.readByte(__io__address + 174);
		}
	}

	/**
	 * Set method for struct member 'shrinkOpts'.
	 * @see #__DNA__FIELD__shrinkOpts
	 */
	
	public void setShrinkOpts(byte shrinkOpts) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 198, shrinkOpts);
		} else {
			__io__block.writeByte(__io__address + 174, shrinkOpts);
		}
	}

	/**
	 * Get method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public byte getPad1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 199);
		} else {
			return __io__block.readByte(__io__address + 175);
		}
	}

	/**
	 * Set method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public void setPad1(byte pad1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 199, pad1);
		} else {
			__io__block.writeByte(__io__address + 175, pad1);
		}
	}

	/**
	 * Get method for struct member 'projLimit'.
	 * @see #__DNA__FIELD__projLimit
	 */
	
	public float getProjLimit() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 200);
		} else {
			return __io__block.readFloat(__io__address + 176);
		}
	}

	/**
	 * Set method for struct member 'projLimit'.
	 * @see #__DNA__FIELD__projLimit
	 */
	
	public void setProjLimit(float projLimit) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 200, projLimit);
		} else {
			__io__block.writeFloat(__io__address + 176, projLimit);
		}
	}

	/**
	 * Get method for struct member 'projAxis'.
	 * @see #__DNA__FIELD__projAxis
	 */
	
	public byte getProjAxis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 204);
		} else {
			return __io__block.readByte(__io__address + 180);
		}
	}

	/**
	 * Set method for struct member 'projAxis'.
	 * @see #__DNA__FIELD__projAxis
	 */
	
	public void setProjAxis(byte projAxis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 204, projAxis);
		} else {
			__io__block.writeByte(__io__address + 180, projAxis);
		}
	}

	/**
	 * Get method for struct member 'subsurfLevels'.
	 * @see #__DNA__FIELD__subsurfLevels
	 */
	
	public byte getSubsurfLevels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 205);
		} else {
			return __io__block.readByte(__io__address + 181);
		}
	}

	/**
	 * Set method for struct member 'subsurfLevels'.
	 * @see #__DNA__FIELD__subsurfLevels
	 */
	
	public void setSubsurfLevels(byte subsurfLevels) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 205, subsurfLevels);
		} else {
			__io__block.writeByte(__io__address + 181, subsurfLevels);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Byte> getPad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 206, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 182, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Byte> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 206;
		} else {
			__dna__offset = 182;
		}
		if (__io__equals(pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad);
		} else {
			__io__generic__copy( getPad(), pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ShrinkwrapModifierData> __io__addressof() {
		return new CPointer<ShrinkwrapModifierData>(__io__address, new Class[]{ShrinkwrapModifierData.class}, __io__block, __io__blockTable);
	}

}
