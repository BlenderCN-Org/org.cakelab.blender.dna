package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'LineStyleThicknessModifier_DistanceFromObject'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=120, size64=136)
public class LineStyleThicknessModifier_DistanceFromObject extends CFacade {

	/**
	 * This is the sdna index of the struct LineStyleThicknessModifier_DistanceFromObject.
	 * <p>
	 * It is required when allocating a new block to store data for LineStyleThicknessModifier_DistanceFromObject.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 532;

	/**
	 * Field descriptor (offset) for struct member 'modifier'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_DistanceFromObject linestylethicknessmodifier_distancefromobject = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_distancefromobject.__dna__addressof(LineStyleThicknessModifier_DistanceFromObject.__DNA__FIELD__modifier);
	 * CPointer&lt;LineStyleModifier&gt; p_modifier = p.cast(new Class[]{LineStyleModifier.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modifier'</li>
	 * <li>Signature: 'LineStyleModifier'</li>
	 * <li>Actual Size (32bit/64bit): 88/96</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modifier = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Target object from which the distance is measured
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_DistanceFromObject linestylethicknessmodifier_distancefromobject = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_distancefromobject.__dna__addressof(LineStyleThicknessModifier_DistanceFromObject.__DNA__FIELD__target);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_target = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'target'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__target = new long[]{88, 96};

	/**
	 * Field descriptor (offset) for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Curve used for the curve mapping
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_DistanceFromObject linestylethicknessmodifier_distancefromobject = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_distancefromobject.__dna__addressof(LineStyleThicknessModifier_DistanceFromObject.__DNA__FIELD__curve);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_curve = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curve'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curve = new long[]{92, 104};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_DistanceFromObject linestylethicknessmodifier_distancefromobject = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_distancefromobject.__dna__addressof(LineStyleThicknessModifier_DistanceFromObject.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{96, 112};

	/**
	 * Field descriptor (offset) for struct member 'range_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower bound of the input range the mapping is applied
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_DistanceFromObject linestylethicknessmodifier_distancefromobject = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_distancefromobject.__dna__addressof(LineStyleThicknessModifier_DistanceFromObject.__DNA__FIELD__range_min);
	 * CPointer&lt;Float&gt; p_range_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'range_min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__range_min = new long[]{100, 116};

	/**
	 * Field descriptor (offset) for struct member 'range_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper bound of the input range the mapping is applied
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_DistanceFromObject linestylethicknessmodifier_distancefromobject = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_distancefromobject.__dna__addressof(LineStyleThicknessModifier_DistanceFromObject.__DNA__FIELD__range_max);
	 * CPointer&lt;Float&gt; p_range_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'range_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__range_max = new long[]{104, 120};

	/**
	 * Field descriptor (offset) for struct member 'value_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum output value of the mapping
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_DistanceFromObject linestylethicknessmodifier_distancefromobject = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_distancefromobject.__dna__addressof(LineStyleThicknessModifier_DistanceFromObject.__DNA__FIELD__value_min);
	 * CPointer&lt;Float&gt; p_value_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value_min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__value_min = new long[]{108, 124};

	/**
	 * Field descriptor (offset) for struct member 'value_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum output value of the mapping
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_DistanceFromObject linestylethicknessmodifier_distancefromobject = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_distancefromobject.__dna__addressof(LineStyleThicknessModifier_DistanceFromObject.__DNA__FIELD__value_max);
	 * CPointer&lt;Float&gt; p_value_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'value_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__value_max = new long[]{112, 128};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * LineStyleThicknessModifier_DistanceFromObject linestylethicknessmodifier_distancefromobject = ...;
	 * CPointer&lt;Object&gt; p = linestylethicknessmodifier_distancefromobject.__dna__addressof(LineStyleThicknessModifier_DistanceFromObject.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{116, 132};

	public LineStyleThicknessModifier_DistanceFromObject(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected LineStyleThicknessModifier_DistanceFromObject(LineStyleThicknessModifier_DistanceFromObject that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public LineStyleModifier getModifier() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new LineStyleModifier(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new LineStyleModifier(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modifier'.
	 * @see #__DNA__FIELD__modifier
	 */
	
	public void setModifier(LineStyleModifier modifier) throws IOException
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
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Target object from which the distance is measured
	 * @see #__DNA__FIELD__target
	 */
	
	public CPointer<BlenderObject> getTarget() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'target'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Target object from which the distance is measured
	 * @see #__DNA__FIELD__target
	 */
	
	public void setTarget(CPointer<BlenderObject> target) throws IOException
	{
		long __address = ((target == null) ? 0 : target.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 88, __address);
		}
	}

	/**
	 * Get method for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Curve used for the curve mapping
	 * @see #__DNA__FIELD__curve
	 */
	
	public CPointer<CurveMapping> getCurve() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 92);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curve'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Curve used for the curve mapping
	 * @see #__DNA__FIELD__curve
	 */
	
	public void setCurve(CPointer<CurveMapping> curve) throws IOException
	{
		long __address = ((curve == null) ? 0 : curve.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 92, __address);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 112);
		} else {
			return __io__block.readInt(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 112, flags);
		} else {
			__io__block.writeInt(__io__address + 96, flags);
		}
	}

	/**
	 * Get method for struct member 'range_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower bound of the input range the mapping is applied
	 * @see #__DNA__FIELD__range_min
	 */
	
	public float getRange_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 116);
		} else {
			return __io__block.readFloat(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'range_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower bound of the input range the mapping is applied
	 * @see #__DNA__FIELD__range_min
	 */
	
	public void setRange_min(float range_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 116, range_min);
		} else {
			__io__block.writeFloat(__io__address + 100, range_min);
		}
	}

	/**
	 * Get method for struct member 'range_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper bound of the input range the mapping is applied
	 * @see #__DNA__FIELD__range_max
	 */
	
	public float getRange_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 120);
		} else {
			return __io__block.readFloat(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'range_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper bound of the input range the mapping is applied
	 * @see #__DNA__FIELD__range_max
	 */
	
	public void setRange_max(float range_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 120, range_max);
		} else {
			__io__block.writeFloat(__io__address + 104, range_max);
		}
	}

	/**
	 * Get method for struct member 'value_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum output value of the mapping
	 * @see #__DNA__FIELD__value_min
	 */
	
	public float getValue_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 124);
		} else {
			return __io__block.readFloat(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'value_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum output value of the mapping
	 * @see #__DNA__FIELD__value_min
	 */
	
	public void setValue_min(float value_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 124, value_min);
		} else {
			__io__block.writeFloat(__io__address + 108, value_min);
		}
	}

	/**
	 * Get method for struct member 'value_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum output value of the mapping
	 * @see #__DNA__FIELD__value_max
	 */
	
	public float getValue_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 128);
		} else {
			return __io__block.readFloat(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'value_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum output value of the mapping
	 * @see #__DNA__FIELD__value_max
	 */
	
	public void setValue_max(float value_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 128, value_max);
		} else {
			__io__block.writeFloat(__io__address + 112, value_max);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 132);
		} else {
			return __io__block.readInt(__io__address + 116);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 132, pad);
		} else {
			__io__block.writeInt(__io__address + 116, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<LineStyleThicknessModifier_DistanceFromObject> __io__addressof() {
		return new CPointer<LineStyleThicknessModifier_DistanceFromObject>(__io__address, new Class[]{LineStyleThicknessModifier_DistanceFromObject.class}, __io__block, __io__blockTable);
	}

}
