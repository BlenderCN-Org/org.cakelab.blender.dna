package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SpaceNla'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=200, size64=232)
public class SpaceNla extends CFacade {

	/**
	 * This is the sdna index of the struct SpaceNla.
	 * <p>
	 * It is required when allocating a new block to store data for SpaceNla.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 187;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceNla spacenla = ...;
	 * CPointer&lt;Object&gt; p = spacenla.__dna__addressof(SpaceNla.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;SpaceLink&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, SpaceLink.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'SpaceLink*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceNla spacenla = ...;
	 * CPointer&lt;Object&gt; p = spacenla.__dna__addressof(SpaceNla.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;SpaceLink&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, SpaceLink.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'SpaceLink*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'regionbase'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceNla spacenla = ...;
	 * CPointer&lt;Object&gt; p = spacenla.__dna__addressof(SpaceNla.__DNA__FIELD__regionbase);
	 * CPointer&lt;ListBase&gt; p_regionbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'regionbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__regionbase = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'spacetype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceNla spacenla = ...;
	 * CPointer&lt;Object&gt; p = spacenla.__dna__addressof(SpaceNla.__DNA__FIELD__spacetype);
	 * CPointer&lt;Integer&gt; p_spacetype = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spacetype'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spacetype = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'blockscale'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceNla spacenla = ...;
	 * CPointer&lt;Object&gt; p = spacenla.__dna__addressof(SpaceNla.__DNA__FIELD__blockscale);
	 * CPointer&lt;Float&gt; p_blockscale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blockscale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blockscale = new long[]{20, 36};

	/**
	 * Field descriptor (offset) for struct member 'blockhandler'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceNla spacenla = ...;
	 * CPointer&lt;Object&gt; p = spacenla.__dna__addressof(SpaceNla.__DNA__FIELD__blockhandler);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_blockhandler = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'blockhandler'</li>
	 * <li>Signature: 'short[8]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__blockhandler = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'autosnap'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceNla spacenla = ...;
	 * CPointer&lt;Object&gt; p = spacenla.__dna__addressof(SpaceNla.__DNA__FIELD__autosnap);
	 * CPointer&lt;Short&gt; p_autosnap = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'autosnap'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__autosnap = new long[]{40, 56};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceNla spacenla = ...;
	 * CPointer&lt;Object&gt; p = spacenla.__dna__addressof(SpaceNla.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{42, 58};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceNla spacenla = ...;
	 * CPointer&lt;Object&gt; p = spacenla.__dna__addressof(SpaceNla.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{44, 60};

	/**
	 * Field descriptor (offset) for struct member 'ads'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceNla spacenla = ...;
	 * CPointer&lt;Object&gt; p = spacenla.__dna__addressof(SpaceNla.__DNA__FIELD__ads);
	 * CPointer&lt;CPointer&lt;bDopeSheet&gt;&gt; p_ads = p.cast(new Class[]{CPointer.class, bDopeSheet.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ads'</li>
	 * <li>Signature: 'bDopeSheet*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ads = new long[]{48, 64};

	/**
	 * Field descriptor (offset) for struct member 'v2d'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceNla spacenla = ...;
	 * CPointer&lt;Object&gt; p = spacenla.__dna__addressof(SpaceNla.__DNA__FIELD__v2d);
	 * CPointer&lt;View2D&gt; p_v2d = p.cast(new Class[]{View2D.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v2d'</li>
	 * <li>Signature: 'View2D'</li>
	 * <li>Actual Size (32bit/64bit): 148/160</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v2d = new long[]{52, 72};

	public SpaceNla(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SpaceNla(SpaceNla that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<SpaceLink> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SpaceLink.class};
		return new CPointer<SpaceLink>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SpaceLink.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<SpaceLink> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<SpaceLink> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SpaceLink.class};
		return new CPointer<SpaceLink>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SpaceLink.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<SpaceLink> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'regionbase'.
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public ListBase getRegionbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'regionbase'.
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public void setRegionbase(ListBase regionbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(regionbase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, regionbase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, regionbase);
		} else {
			__io__generic__copy( getRegionbase(), regionbase);
		}
	}

	/**
	 * Get method for struct member 'spacetype'.
	 * @see #__DNA__FIELD__spacetype
	 */
	
	public int getSpacetype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'spacetype'.
	 * @see #__DNA__FIELD__spacetype
	 */
	
	public void setSpacetype(int spacetype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, spacetype);
		} else {
			__io__block.writeInt(__io__address + 16, spacetype);
		}
	}

	/**
	 * Get method for struct member 'blockscale'.
	 * @see #__DNA__FIELD__blockscale
	 */
	
	public float getBlockscale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 36);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'blockscale'.
	 * @see #__DNA__FIELD__blockscale
	 */
	
	public void setBlockscale(float blockscale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 36, blockscale);
		} else {
			__io__block.writeFloat(__io__address + 20, blockscale);
		}
	}

	/**
	 * Get method for struct member 'blockhandler'.
	 * @see #__DNA__FIELD__blockhandler
	 */
	
	public CArrayFacade<Short> getBlockhandler() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			8
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'blockhandler'.
	 * @see #__DNA__FIELD__blockhandler
	 */
	
	public void setBlockhandler(CArrayFacade<Short> blockhandler) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(blockhandler, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, blockhandler)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, blockhandler);
		} else {
			__io__generic__copy( getBlockhandler(), blockhandler);
		}
	}

	/**
	 * Get method for struct member 'autosnap'.
	 * @see #__DNA__FIELD__autosnap
	 */
	
	public short getAutosnap() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 56);
		} else {
			return __io__block.readShort(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'autosnap'.
	 * @see #__DNA__FIELD__autosnap
	 */
	
	public void setAutosnap(short autosnap) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 56, autosnap);
		} else {
			__io__block.writeShort(__io__address + 40, autosnap);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 58);
		} else {
			return __io__block.readShort(__io__address + 42);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 58, flag);
		} else {
			__io__block.writeShort(__io__address + 42, flag);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 60);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 60, pad);
		} else {
			__io__block.writeInt(__io__address + 44, pad);
		}
	}

	/**
	 * Get method for struct member 'ads'.
	 * @see #__DNA__FIELD__ads
	 */
	
	public CPointer<bDopeSheet> getAds() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bDopeSheet.class};
		return new CPointer<bDopeSheet>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bDopeSheet.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ads'.
	 * @see #__DNA__FIELD__ads
	 */
	
	public void setAds(CPointer<bDopeSheet> ads) throws IOException
	{
		long __address = ((ads == null) ? 0 : ads.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 48, __address);
		}
	}

	/**
	 * Get method for struct member 'v2d'.
	 * @see #__DNA__FIELD__v2d
	 */
	
	public View2D getV2d() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new View2D(__io__address + 72, __io__block, __io__blockTable);
		} else {
			return new View2D(__io__address + 52, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'v2d'.
	 * @see #__DNA__FIELD__v2d
	 */
	
	public void setV2d(View2D v2d) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 52;
		}
		if (__io__equals(v2d, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, v2d)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, v2d);
		} else {
			__io__generic__copy( getV2d(), v2d);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SpaceNla> __io__addressof() {
		return new CPointer<SpaceNla>(__io__address, new Class[]{SpaceNla.class}, __io__block, __io__blockTable);
	}

}
