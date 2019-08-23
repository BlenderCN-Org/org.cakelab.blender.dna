package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Paint'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=24, size64=32)
public class Paint extends CFacade {

	/**
	 * This is the sdna index of the struct Paint.
	 * <p>
	 * It is required when allocating a new block to store data for Paint.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 163;

	/**
	 * Field descriptor (offset) for struct member 'brush'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active Brush
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Paint paint = ...;
	 * CPointer&lt;Object&gt; p = paint.__dna__addressof(Paint.__DNA__FIELD__brush);
	 * CPointer&lt;CPointer&lt;Brush&gt;&gt; p_brush = p.cast(new Class[]{CPointer.class, Brush.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'brush'</li>
	 * <li>Signature: 'Brush*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__brush = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'paint_cursor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Paint paint = ...;
	 * CPointer&lt;Object&gt; p = paint.__dna__addressof(Paint.__DNA__FIELD__paint_cursor);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_paint_cursor = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paint_cursor'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paint_cursor = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'paint_cursor_col'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Paint paint = ...;
	 * CPointer&lt;Object&gt; p = paint.__dna__addressof(Paint.__DNA__FIELD__paint_cursor_col);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_paint_cursor_col = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'paint_cursor_col'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__paint_cursor_col = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Paint paint = ...;
	 * CPointer&lt;Object&gt; p = paint.__dna__addressof(Paint.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'num_input_samples'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Paint paint = ...;
	 * CPointer&lt;Object&gt; p = paint.__dna__addressof(Paint.__DNA__FIELD__num_input_samples);
	 * CPointer&lt;Integer&gt; p_num_input_samples = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'num_input_samples'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__num_input_samples = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Paint paint = ...;
	 * CPointer&lt;Object&gt; p = paint.__dna__addressof(Paint.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{20, 28};

	public Paint(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Paint(Paint that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'brush'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active Brush
	 * @see #__DNA__FIELD__brush
	 */
	
	public CPointer<Brush> getBrush() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Brush.class};
		return new CPointer<Brush>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Brush.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'brush'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Active Brush
	 * @see #__DNA__FIELD__brush
	 */
	
	public void setBrush(CPointer<Brush> brush) throws IOException
	{
		long __address = ((brush == null) ? 0 : brush.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'paint_cursor'.
	 * @see #__DNA__FIELD__paint_cursor
	 */
	
	public CPointer<Object> getPaint_cursor() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'paint_cursor'.
	 * @see #__DNA__FIELD__paint_cursor
	 */
	
	public void setPaint_cursor(CPointer<Object> paint_cursor) throws IOException
	{
		long __address = ((paint_cursor == null) ? 0 : paint_cursor.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'paint_cursor_col'.
	 * @see #__DNA__FIELD__paint_cursor_col
	 */
	
	public CArrayFacade<Byte> getPaint_cursor_col() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 16, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'paint_cursor_col'.
	 * @see #__DNA__FIELD__paint_cursor_col
	 */
	
	public void setPaint_cursor_col(CArrayFacade<Byte> paint_cursor_col) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(paint_cursor_col, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, paint_cursor_col)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, paint_cursor_col);
		} else {
			__io__generic__copy( getPaint_cursor_col(), paint_cursor_col);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, flags);
		} else {
			__io__block.writeInt(__io__address + 12, flags);
		}
	}

	/**
	 * Get method for struct member 'num_input_samples'.
	 * @see #__DNA__FIELD__num_input_samples
	 */
	
	public int getNum_input_samples() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'num_input_samples'.
	 * @see #__DNA__FIELD__num_input_samples
	 */
	
	public void setNum_input_samples(int num_input_samples) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, num_input_samples);
		} else {
			__io__block.writeInt(__io__address + 16, num_input_samples);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, pad);
		} else {
			__io__block.writeInt(__io__address + 20, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Paint> __io__addressof() {
		return new CPointer<Paint>(__io__address, new Class[]{Paint.class}, __io__block, __io__blockTable);
	}

}
