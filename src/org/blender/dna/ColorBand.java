package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ColorBand'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=776, size64=776)
public class ColorBand extends CFacade {

	/**
	 * This is the sdna index of the struct ColorBand.
	 * <p>
	 * It is required when allocating a new block to store data for ColorBand.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 26;

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorBand colorband = ...;
	 * CPointer&lt;Object&gt; p = colorband.__dna__addressof(ColorBand.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'tot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorBand colorband = ...;
	 * CPointer&lt;Object&gt; p = colorband.__dna__addressof(ColorBand.__DNA__FIELD__tot);
	 * CPointer&lt;Short&gt; p_tot = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tot'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tot = new long[]{2, 2};

	/**
	 * Field descriptor (offset) for struct member 'cur'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorBand colorband = ...;
	 * CPointer&lt;Object&gt; p = colorband.__dna__addressof(ColorBand.__DNA__FIELD__cur);
	 * CPointer&lt;Short&gt; p_cur = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cur'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cur = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'ipotype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorBand colorband = ...;
	 * CPointer&lt;Object&gt; p = colorband.__dna__addressof(ColorBand.__DNA__FIELD__ipotype);
	 * CPointer&lt;Short&gt; p_ipotype = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipotype'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipotype = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'data'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ColorBand colorband = ...;
	 * CPointer&lt;Object&gt; p = colorband.__dna__addressof(ColorBand.__DNA__FIELD__data);
	 * CPointer&lt;CArrayFacade&lt;CBData&gt;&gt; p_data = p.cast(new Class[]{CArrayFacade.class, CBData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data'</li>
	 * <li>Signature: 'CBData[32]'</li>
	 * <li>Actual Size (32bit/64bit): 768/768</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data = new long[]{8, 8};

	public ColorBand(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ColorBand(ColorBand that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 0);
		} else {
			return __io__block.readShort(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 0, flag);
		} else {
			__io__block.writeShort(__io__address + 0, flag);
		}
	}

	/**
	 * Get method for struct member 'tot'.
	 * @see #__DNA__FIELD__tot
	 */
	
	public short getTot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2);
		} else {
			return __io__block.readShort(__io__address + 2);
		}
	}

	/**
	 * Set method for struct member 'tot'.
	 * @see #__DNA__FIELD__tot
	 */
	
	public void setTot(short tot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2, tot);
		} else {
			__io__block.writeShort(__io__address + 2, tot);
		}
	}

	/**
	 * Get method for struct member 'cur'.
	 * @see #__DNA__FIELD__cur
	 */
	
	public short getCur() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'cur'.
	 * @see #__DNA__FIELD__cur
	 */
	
	public void setCur(short cur) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, cur);
		} else {
			__io__block.writeShort(__io__address + 4, cur);
		}
	}

	/**
	 * Get method for struct member 'ipotype'.
	 * @see #__DNA__FIELD__ipotype
	 */
	
	public short getIpotype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'ipotype'.
	 * @see #__DNA__FIELD__ipotype
	 */
	
	public void setIpotype(short ipotype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, ipotype);
		} else {
			__io__block.writeShort(__io__address + 6, ipotype);
		}
	}

	/**
	 * Get method for struct member 'data'.
	 * @see #__DNA__FIELD__data
	 */
	
	public CArrayFacade<CBData> getData() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CBData.class};
		int[] __dna__dimensions = new int[]{
			32
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CBData>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CBData>(__io__address + 8, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'data'.
	 * @see #__DNA__FIELD__data
	 */
	
	public void setData(CArrayFacade<CBData> data) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(data, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, data)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, data);
		} else {
			__io__generic__copy( getData(), data);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ColorBand> __io__addressof() {
		return new CPointer<ColorBand>(__io__address, new Class[]{ColorBand.class}, __io__block, __io__blockTable);
	}

}
