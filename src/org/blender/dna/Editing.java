package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Editing'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=2104, size64=2128)
public class Editing extends CFacade {

	/**
	 * This is the sdna index of the struct Editing.
	 * <p>
	 * It is required when allocating a new block to store data for Editing.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 236;

	/**
	 * Field descriptor (offset) for struct member 'seqbasep'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__seqbasep);
	 * CPointer&lt;CPointer&lt;ListBase&gt;&gt; p_seqbasep = p.cast(new Class[]{CPointer.class, ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seqbasep'</li>
	 * <li>Signature: 'ListBase*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seqbasep = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'seqbase'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__seqbase);
	 * CPointer&lt;ListBase&gt; p_seqbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seqbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seqbase = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'metastack'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__metastack);
	 * CPointer&lt;ListBase&gt; p_metastack = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'metastack'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__metastack = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'act_seq'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__act_seq);
	 * CPointer&lt;CPointer&lt;Sequence&gt;&gt; p_act_seq = p.cast(new Class[]{CPointer.class, Sequence.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_seq'</li>
	 * <li>Signature: 'Sequence*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_seq = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'act_imagedir'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__act_imagedir);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_act_imagedir = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_imagedir'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_imagedir = new long[]{24, 48};

	/**
	 * Field descriptor (offset) for struct member 'act_sounddir'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__act_sounddir);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_act_sounddir = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'act_sounddir'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__act_sounddir = new long[]{1048, 1072};

	/**
	 * Field descriptor (offset) for struct member 'over_ofs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__over_ofs);
	 * CPointer&lt;Integer&gt; p_over_ofs = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'over_ofs'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__over_ofs = new long[]{2072, 2096};

	/**
	 * Field descriptor (offset) for struct member 'over_cfra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__over_cfra);
	 * CPointer&lt;Integer&gt; p_over_cfra = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'over_cfra'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__over_cfra = new long[]{2076, 2100};

	/**
	 * Field descriptor (offset) for struct member 'over_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__over_flag);
	 * CPointer&lt;Integer&gt; p_over_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'over_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__over_flag = new long[]{2080, 2104};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{2084, 2108};

	/**
	 * Field descriptor (offset) for struct member 'over_border'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Editing editing = ...;
	 * CPointer&lt;Object&gt; p = editing.__dna__addressof(Editing.__DNA__FIELD__over_border);
	 * CPointer&lt;rctf&gt; p_over_border = p.cast(new Class[]{rctf.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'over_border'</li>
	 * <li>Signature: 'rctf'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__over_border = new long[]{2088, 2112};

	public Editing(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Editing(Editing that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'seqbasep'.
	 * @see #__DNA__FIELD__seqbasep
	 */
	
	public CPointer<ListBase> getSeqbasep() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ListBase.class};
		return new CPointer<ListBase>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ListBase.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'seqbasep'.
	 * @see #__DNA__FIELD__seqbasep
	 */
	
	public void setSeqbasep(CPointer<ListBase> seqbasep) throws IOException
	{
		long __address = ((seqbasep == null) ? 0 : seqbasep.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'seqbase'.
	 * @see #__DNA__FIELD__seqbase
	 */
	
	public ListBase getSeqbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 4, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'seqbase'.
	 * @see #__DNA__FIELD__seqbase
	 */
	
	public void setSeqbase(ListBase seqbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 8;
		} else {
			__dna__offset = 4;
		}
		if (__io__equals(seqbase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, seqbase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, seqbase);
		} else {
			__io__generic__copy( getSeqbase(), seqbase);
		}
	}

	/**
	 * Get method for struct member 'metastack'.
	 * @see #__DNA__FIELD__metastack
	 */
	
	public ListBase getMetastack() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 24, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 12, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'metastack'.
	 * @see #__DNA__FIELD__metastack
	 */
	
	public void setMetastack(ListBase metastack) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(metastack, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, metastack)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, metastack);
		} else {
			__io__generic__copy( getMetastack(), metastack);
		}
	}

	/**
	 * Get method for struct member 'act_seq'.
	 * @see #__DNA__FIELD__act_seq
	 */
	
	public CPointer<Sequence> getAct_seq() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Sequence.class};
		return new CPointer<Sequence>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Sequence.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'act_seq'.
	 * @see #__DNA__FIELD__act_seq
	 */
	
	public void setAct_seq(CPointer<Sequence> act_seq) throws IOException
	{
		long __address = ((act_seq == null) ? 0 : act_seq.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Get method for struct member 'act_imagedir'.
	 * @see #__DNA__FIELD__act_imagedir
	 */
	
	public CArrayFacade<Byte> getAct_imagedir() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'act_imagedir'.
	 * @see #__DNA__FIELD__act_imagedir
	 */
	
	public void setAct_imagedir(CArrayFacade<Byte> act_imagedir) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 24;
		}
		if (__io__equals(act_imagedir, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, act_imagedir)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, act_imagedir);
		} else {
			__io__generic__copy( getAct_imagedir(), act_imagedir);
		}
	}

	/**
	 * Get method for struct member 'act_sounddir'.
	 * @see #__DNA__FIELD__act_sounddir
	 */
	
	public CArrayFacade<Byte> getAct_sounddir() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1072, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1048, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'act_sounddir'.
	 * @see #__DNA__FIELD__act_sounddir
	 */
	
	public void setAct_sounddir(CArrayFacade<Byte> act_sounddir) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1072;
		} else {
			__dna__offset = 1048;
		}
		if (__io__equals(act_sounddir, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, act_sounddir)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, act_sounddir);
		} else {
			__io__generic__copy( getAct_sounddir(), act_sounddir);
		}
	}

	/**
	 * Get method for struct member 'over_ofs'.
	 * @see #__DNA__FIELD__over_ofs
	 */
	
	public int getOver_ofs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2096);
		} else {
			return __io__block.readInt(__io__address + 2072);
		}
	}

	/**
	 * Set method for struct member 'over_ofs'.
	 * @see #__DNA__FIELD__over_ofs
	 */
	
	public void setOver_ofs(int over_ofs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2096, over_ofs);
		} else {
			__io__block.writeInt(__io__address + 2072, over_ofs);
		}
	}

	/**
	 * Get method for struct member 'over_cfra'.
	 * @see #__DNA__FIELD__over_cfra
	 */
	
	public int getOver_cfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2100);
		} else {
			return __io__block.readInt(__io__address + 2076);
		}
	}

	/**
	 * Set method for struct member 'over_cfra'.
	 * @see #__DNA__FIELD__over_cfra
	 */
	
	public void setOver_cfra(int over_cfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2100, over_cfra);
		} else {
			__io__block.writeInt(__io__address + 2076, over_cfra);
		}
	}

	/**
	 * Get method for struct member 'over_flag'.
	 * @see #__DNA__FIELD__over_flag
	 */
	
	public int getOver_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2104);
		} else {
			return __io__block.readInt(__io__address + 2080);
		}
	}

	/**
	 * Set method for struct member 'over_flag'.
	 * @see #__DNA__FIELD__over_flag
	 */
	
	public void setOver_flag(int over_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2104, over_flag);
		} else {
			__io__block.writeInt(__io__address + 2080, over_flag);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2108);
		} else {
			return __io__block.readInt(__io__address + 2084);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2108, pad);
		} else {
			__io__block.writeInt(__io__address + 2084, pad);
		}
	}

	/**
	 * Get method for struct member 'over_border'.
	 * @see #__DNA__FIELD__over_border
	 */
	
	public rctf getOver_border() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new rctf(__io__address + 2112, __io__block, __io__blockTable);
		} else {
			return new rctf(__io__address + 2088, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'over_border'.
	 * @see #__DNA__FIELD__over_border
	 */
	
	public void setOver_border(rctf over_border) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2112;
		} else {
			__dna__offset = 2088;
		}
		if (__io__equals(over_border, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, over_border)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, over_border);
		} else {
			__io__generic__copy( getOver_border(), over_border);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Editing> __io__addressof() {
		return new CPointer<Editing>(__io__address, new Class[]{Editing.class}, __io__block, __io__blockTable);
	}

}
