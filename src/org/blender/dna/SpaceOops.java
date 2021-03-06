package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SpaceOops'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=288, size64=336)
public class SpaceOops extends CFacade {

	/**
	 * This is the sdna index of the struct SpaceOops.
	 * <p>
	 * It is required when allocating a new block to store data for SpaceOops.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 220;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__next);
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
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__prev);
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
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__regionbase);
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
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__spacetype);
	 * CPointer&lt;Byte&gt; p_spacetype = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spacetype'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spacetype = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'link_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__link_flag);
	 * CPointer&lt;Byte&gt; p_link_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'link_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__link_flag = new long[]{17, 33};

	/**
	 * Field descriptor (offset) for struct member '_pad0'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD___pad0);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad0 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad0'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad0 = new long[]{18, 34};

	/**
	 * Field descriptor (offset) for struct member 'v2d'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__v2d);
	 * CPointer&lt;View2D&gt; p_v2d = p.cast(new Class[]{View2D.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'v2d'</li>
	 * <li>Signature: 'View2D'</li>
	 * <li>Actual Size (32bit/64bit): 156/168</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__v2d = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'tree'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__tree);
	 * CPointer&lt;ListBase&gt; p_tree = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tree'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tree = new long[]{180, 208};

	/**
	 * Field descriptor (offset) for struct member 'treestore'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__treestore);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_treestore = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'treestore'</li>
	 * <li>Signature: 'BLI_mempool*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__treestore = new long[]{188, 224};

	/**
	 * Field descriptor (offset) for struct member 'search_string'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__search_string);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_search_string = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'search_string'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__search_string = new long[]{192, 232};

	/**
	 * Field descriptor (offset) for struct member 'search_tse'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__search_tse);
	 * CPointer&lt;TreeStoreElem&gt; p_search_tse = p.cast(new Class[]{TreeStoreElem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'search_tse'</li>
	 * <li>Signature: 'TreeStoreElem'</li>
	 * <li>Actual Size (32bit/64bit): 12/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__search_tse = new long[]{256, 296};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{268, 312};

	/**
	 * Field descriptor (offset) for struct member 'outlinevis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__outlinevis);
	 * CPointer&lt;Short&gt; p_outlinevis = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'outlinevis'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__outlinevis = new long[]{270, 314};

	/**
	 * Field descriptor (offset) for struct member 'storeflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__storeflag);
	 * CPointer&lt;Short&gt; p_storeflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'storeflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__storeflag = new long[]{272, 316};

	/**
	 * Field descriptor (offset) for struct member 'search_flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__search_flags);
	 * CPointer&lt;Byte&gt; p_search_flags = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'search_flags'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__search_flags = new long[]{274, 318};

	/**
	 * Field descriptor (offset) for struct member 'sync_select_dirty'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__sync_select_dirty);
	 * CPointer&lt;Byte&gt; p_sync_select_dirty = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sync_select_dirty'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sync_select_dirty = new long[]{275, 319};

	/**
	 * Field descriptor (offset) for struct member 'filter'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__filter);
	 * CPointer&lt;Integer&gt; p_filter = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filter'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filter = new long[]{276, 320};

	/**
	 * Field descriptor (offset) for struct member 'filter_state'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__filter_state);
	 * CPointer&lt;Byte&gt; p_filter_state = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filter_state'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filter_state = new long[]{280, 324};

	/**
	 * Field descriptor (offset) for struct member 'show_restrict_flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__show_restrict_flags);
	 * CPointer&lt;Byte&gt; p_show_restrict_flags = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'show_restrict_flags'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__show_restrict_flags = new long[]{281, 325};

	/**
	 * Field descriptor (offset) for struct member 'filter_id_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__filter_id_type);
	 * CPointer&lt;Short&gt; p_filter_id_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filter_id_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filter_id_type = new long[]{282, 326};

	/**
	 * Field descriptor (offset) for struct member 'treehash'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceOops spaceoops = ...;
	 * CPointer&lt;Object&gt; p = spaceoops.__dna__addressof(SpaceOops.__DNA__FIELD__treehash);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_treehash = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'treehash'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__treehash = new long[]{284, 328};

	public SpaceOops(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SpaceOops(SpaceOops that) {
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
	
	public byte getSpacetype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 32);
		} else {
			return __io__block.readByte(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'spacetype'.
	 * @see #__DNA__FIELD__spacetype
	 */
	
	public void setSpacetype(byte spacetype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 32, spacetype);
		} else {
			__io__block.writeByte(__io__address + 16, spacetype);
		}
	}

	/**
	 * Get method for struct member 'link_flag'.
	 * @see #__DNA__FIELD__link_flag
	 */
	
	public byte getLink_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 33);
		} else {
			return __io__block.readByte(__io__address + 17);
		}
	}

	/**
	 * Set method for struct member 'link_flag'.
	 * @see #__DNA__FIELD__link_flag
	 */
	
	public void setLink_flag(byte link_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 33, link_flag);
		} else {
			__io__block.writeByte(__io__address + 17, link_flag);
		}
	}

	/**
	 * Get method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public CArrayFacade<Byte> get_pad0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 34, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 18, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad0'.
	 * @see #__DNA__FIELD___pad0
	 */
	
	public void set_pad0(CArrayFacade<Byte> _pad0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 34;
		} else {
			__dna__offset = 18;
		}
		if (__io__equals(_pad0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad0);
		} else {
			__io__generic__copy( get_pad0(), _pad0);
		}
	}

	/**
	 * Get method for struct member 'v2d'.
	 * @see #__DNA__FIELD__v2d
	 */
	
	public View2D getV2d() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new View2D(__io__address + 40, __io__block, __io__blockTable);
		} else {
			return new View2D(__io__address + 24, __io__block, __io__blockTable);
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
			__dna__offset = 40;
		} else {
			__dna__offset = 24;
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
	 * Get method for struct member 'tree'.
	 * @see #__DNA__FIELD__tree
	 */
	
	public ListBase getTree() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 208, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 180, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'tree'.
	 * @see #__DNA__FIELD__tree
	 */
	
	public void setTree(ListBase tree) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 208;
		} else {
			__dna__offset = 180;
		}
		if (__io__equals(tree, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, tree)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, tree);
		} else {
			__io__generic__copy( getTree(), tree);
		}
	}

	/**
	 * Get method for struct member 'treestore'.
	 * @see #__DNA__FIELD__treestore
	 */
	
	public CPointer<Object> getTreestore() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 224);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 188);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'treestore'.
	 * @see #__DNA__FIELD__treestore
	 */
	
	public void setTreestore(CPointer<Object> treestore) throws IOException
	{
		long __address = ((treestore == null) ? 0 : treestore.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 224, __address);
		} else {
			__io__block.writeLong(__io__address + 188, __address);
		}
	}

	/**
	 * Get method for struct member 'search_string'.
	 * @see #__DNA__FIELD__search_string
	 */
	
	public CArrayFacade<Byte> getSearch_string() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 232, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 192, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'search_string'.
	 * @see #__DNA__FIELD__search_string
	 */
	
	public void setSearch_string(CArrayFacade<Byte> search_string) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 232;
		} else {
			__dna__offset = 192;
		}
		if (__io__equals(search_string, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, search_string)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, search_string);
		} else {
			__io__generic__copy( getSearch_string(), search_string);
		}
	}

	/**
	 * Get method for struct member 'search_tse'.
	 * @see #__DNA__FIELD__search_tse
	 */
	
	public TreeStoreElem getSearch_tse() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new TreeStoreElem(__io__address + 296, __io__block, __io__blockTable);
		} else {
			return new TreeStoreElem(__io__address + 256, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'search_tse'.
	 * @see #__DNA__FIELD__search_tse
	 */
	
	public void setSearch_tse(TreeStoreElem search_tse) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 296;
		} else {
			__dna__offset = 256;
		}
		if (__io__equals(search_tse, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, search_tse)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, search_tse);
		} else {
			__io__generic__copy( getSearch_tse(), search_tse);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 312);
		} else {
			return __io__block.readShort(__io__address + 268);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 312, flag);
		} else {
			__io__block.writeShort(__io__address + 268, flag);
		}
	}

	/**
	 * Get method for struct member 'outlinevis'.
	 * @see #__DNA__FIELD__outlinevis
	 */
	
	public short getOutlinevis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 314);
		} else {
			return __io__block.readShort(__io__address + 270);
		}
	}

	/**
	 * Set method for struct member 'outlinevis'.
	 * @see #__DNA__FIELD__outlinevis
	 */
	
	public void setOutlinevis(short outlinevis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 314, outlinevis);
		} else {
			__io__block.writeShort(__io__address + 270, outlinevis);
		}
	}

	/**
	 * Get method for struct member 'storeflag'.
	 * @see #__DNA__FIELD__storeflag
	 */
	
	public short getStoreflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 316);
		} else {
			return __io__block.readShort(__io__address + 272);
		}
	}

	/**
	 * Set method for struct member 'storeflag'.
	 * @see #__DNA__FIELD__storeflag
	 */
	
	public void setStoreflag(short storeflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 316, storeflag);
		} else {
			__io__block.writeShort(__io__address + 272, storeflag);
		}
	}

	/**
	 * Get method for struct member 'search_flags'.
	 * @see #__DNA__FIELD__search_flags
	 */
	
	public byte getSearch_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 318);
		} else {
			return __io__block.readByte(__io__address + 274);
		}
	}

	/**
	 * Set method for struct member 'search_flags'.
	 * @see #__DNA__FIELD__search_flags
	 */
	
	public void setSearch_flags(byte search_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 318, search_flags);
		} else {
			__io__block.writeByte(__io__address + 274, search_flags);
		}
	}

	/**
	 * Get method for struct member 'sync_select_dirty'.
	 * @see #__DNA__FIELD__sync_select_dirty
	 */
	
	public byte getSync_select_dirty() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 319);
		} else {
			return __io__block.readByte(__io__address + 275);
		}
	}

	/**
	 * Set method for struct member 'sync_select_dirty'.
	 * @see #__DNA__FIELD__sync_select_dirty
	 */
	
	public void setSync_select_dirty(byte sync_select_dirty) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 319, sync_select_dirty);
		} else {
			__io__block.writeByte(__io__address + 275, sync_select_dirty);
		}
	}

	/**
	 * Get method for struct member 'filter'.
	 * @see #__DNA__FIELD__filter
	 */
	
	public int getFilter() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 320);
		} else {
			return __io__block.readInt(__io__address + 276);
		}
	}

	/**
	 * Set method for struct member 'filter'.
	 * @see #__DNA__FIELD__filter
	 */
	
	public void setFilter(int filter) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 320, filter);
		} else {
			__io__block.writeInt(__io__address + 276, filter);
		}
	}

	/**
	 * Get method for struct member 'filter_state'.
	 * @see #__DNA__FIELD__filter_state
	 */
	
	public byte getFilter_state() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 324);
		} else {
			return __io__block.readByte(__io__address + 280);
		}
	}

	/**
	 * Set method for struct member 'filter_state'.
	 * @see #__DNA__FIELD__filter_state
	 */
	
	public void setFilter_state(byte filter_state) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 324, filter_state);
		} else {
			__io__block.writeByte(__io__address + 280, filter_state);
		}
	}

	/**
	 * Get method for struct member 'show_restrict_flags'.
	 * @see #__DNA__FIELD__show_restrict_flags
	 */
	
	public byte getShow_restrict_flags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 325);
		} else {
			return __io__block.readByte(__io__address + 281);
		}
	}

	/**
	 * Set method for struct member 'show_restrict_flags'.
	 * @see #__DNA__FIELD__show_restrict_flags
	 */
	
	public void setShow_restrict_flags(byte show_restrict_flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 325, show_restrict_flags);
		} else {
			__io__block.writeByte(__io__address + 281, show_restrict_flags);
		}
	}

	/**
	 * Get method for struct member 'filter_id_type'.
	 * @see #__DNA__FIELD__filter_id_type
	 */
	
	public short getFilter_id_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 326);
		} else {
			return __io__block.readShort(__io__address + 282);
		}
	}

	/**
	 * Set method for struct member 'filter_id_type'.
	 * @see #__DNA__FIELD__filter_id_type
	 */
	
	public void setFilter_id_type(short filter_id_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 326, filter_id_type);
		} else {
			__io__block.writeShort(__io__address + 282, filter_id_type);
		}
	}

	/**
	 * Get method for struct member 'treehash'.
	 * @see #__DNA__FIELD__treehash
	 */
	
	public CPointer<Object> getTreehash() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 328);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 284);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'treehash'.
	 * @see #__DNA__FIELD__treehash
	 */
	
	public void setTreehash(CPointer<Object> treehash) throws IOException
	{
		long __address = ((treehash == null) ? 0 : treehash.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 328, __address);
		} else {
			__io__block.writeLong(__io__address + 284, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SpaceOops> __io__addressof() {
		return new CPointer<SpaceOops>(__io__address, new Class[]{SpaceOops.class}, __io__block, __io__blockTable);
	}

}
