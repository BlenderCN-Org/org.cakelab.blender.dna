package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FileGlobal'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1064, size64=1072)
public class FileGlobal extends CFacade {

	/**
	 * This is the sdna index of the struct FileGlobal.
	 * <p>
	 * It is required when allocating a new block to store data for FileGlobal.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 227;

	/**
	 * Field descriptor (offset) for struct member 'subvstr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__subvstr);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_subvstr = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subvstr'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subvstr = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'subversion'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__subversion);
	 * CPointer&lt;Short&gt; p_subversion = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subversion'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subversion = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'pads'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__pads);
	 * CPointer&lt;Short&gt; p_pads = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pads'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pads = new long[]{6, 6};

	/**
	 * Field descriptor (offset) for struct member 'minversion'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__minversion);
	 * CPointer&lt;Short&gt; p_minversion = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minversion'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minversion = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'minsubversion'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__minsubversion);
	 * CPointer&lt;Short&gt; p_minsubversion = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'minsubversion'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__minsubversion = new long[]{10, 10};

	/**
	 * Field descriptor (offset) for struct member 'displaymode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__displaymode);
	 * CPointer&lt;Short&gt; p_displaymode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'displaymode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__displaymode = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'winpos'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__winpos);
	 * CPointer&lt;Short&gt; p_winpos = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'winpos'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__winpos = new long[]{14, 14};

	/**
	 * Field descriptor (offset) for struct member 'curscreen'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__curscreen);
	 * CPointer&lt;CPointer&lt;bScreen&gt;&gt; p_curscreen = p.cast(new Class[]{CPointer.class, bScreen.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curscreen'</li>
	 * <li>Signature: 'bScreen*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curscreen = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'curscene'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__curscene);
	 * CPointer&lt;CPointer&lt;Scene&gt;&gt; p_curscene = p.cast(new Class[]{CPointer.class, Scene.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curscene'</li>
	 * <li>Signature: 'Scene*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curscene = new long[]{20, 24};

	/**
	 * Field descriptor (offset) for struct member 'fileflags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__fileflags);
	 * CPointer&lt;Integer&gt; p_fileflags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fileflags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fileflags = new long[]{24, 32};

	/**
	 * Field descriptor (offset) for struct member 'globalf'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__globalf);
	 * CPointer&lt;Integer&gt; p_globalf = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'globalf'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__globalf = new long[]{28, 36};

	/**
	 * Field descriptor (offset) for struct member 'revision'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__revision);
	 * CPointer&lt;Integer&gt; p_revision = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'revision'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__revision = new long[]{32, 40};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{36, 44};

	/**
	 * Field descriptor (offset) for struct member 'filename'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FileGlobal fileglobal = ...;
	 * CPointer&lt;Object&gt; p = fileglobal.__dna__addressof(FileGlobal.__DNA__FIELD__filename);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_filename = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'filename'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__filename = new long[]{40, 48};

	public FileGlobal(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FileGlobal(FileGlobal that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'subvstr'.
	 * @see #__DNA__FIELD__subvstr
	 */
	
	public CArrayFacade<Byte> getSubvstr() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'subvstr'.
	 * @see #__DNA__FIELD__subvstr
	 */
	
	public void setSubvstr(CArrayFacade<Byte> subvstr) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(subvstr, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, subvstr)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, subvstr);
		} else {
			__io__generic__copy( getSubvstr(), subvstr);
		}
	}

	/**
	 * Get method for struct member 'subversion'.
	 * @see #__DNA__FIELD__subversion
	 */
	
	public short getSubversion() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 4);
		} else {
			return __io__block.readShort(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'subversion'.
	 * @see #__DNA__FIELD__subversion
	 */
	
	public void setSubversion(short subversion) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 4, subversion);
		} else {
			__io__block.writeShort(__io__address + 4, subversion);
		}
	}

	/**
	 * Get method for struct member 'pads'.
	 * @see #__DNA__FIELD__pads
	 */
	
	public short getPads() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 6);
		} else {
			return __io__block.readShort(__io__address + 6);
		}
	}

	/**
	 * Set method for struct member 'pads'.
	 * @see #__DNA__FIELD__pads
	 */
	
	public void setPads(short pads) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 6, pads);
		} else {
			__io__block.writeShort(__io__address + 6, pads);
		}
	}

	/**
	 * Get method for struct member 'minversion'.
	 * @see #__DNA__FIELD__minversion
	 */
	
	public short getMinversion() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 8);
		} else {
			return __io__block.readShort(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'minversion'.
	 * @see #__DNA__FIELD__minversion
	 */
	
	public void setMinversion(short minversion) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 8, minversion);
		} else {
			__io__block.writeShort(__io__address + 8, minversion);
		}
	}

	/**
	 * Get method for struct member 'minsubversion'.
	 * @see #__DNA__FIELD__minsubversion
	 */
	
	public short getMinsubversion() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 10);
		} else {
			return __io__block.readShort(__io__address + 10);
		}
	}

	/**
	 * Set method for struct member 'minsubversion'.
	 * @see #__DNA__FIELD__minsubversion
	 */
	
	public void setMinsubversion(short minsubversion) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 10, minsubversion);
		} else {
			__io__block.writeShort(__io__address + 10, minsubversion);
		}
	}

	/**
	 * Get method for struct member 'displaymode'.
	 * @see #__DNA__FIELD__displaymode
	 */
	
	public short getDisplaymode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 12);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'displaymode'.
	 * @see #__DNA__FIELD__displaymode
	 */
	
	public void setDisplaymode(short displaymode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 12, displaymode);
		} else {
			__io__block.writeShort(__io__address + 12, displaymode);
		}
	}

	/**
	 * Get method for struct member 'winpos'.
	 * @see #__DNA__FIELD__winpos
	 */
	
	public short getWinpos() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 14);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'winpos'.
	 * @see #__DNA__FIELD__winpos
	 */
	
	public void setWinpos(short winpos) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 14, winpos);
		} else {
			__io__block.writeShort(__io__address + 14, winpos);
		}
	}

	/**
	 * Get method for struct member 'curscreen'.
	 * @see #__DNA__FIELD__curscreen
	 */
	
	public CPointer<bScreen> getCurscreen() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bScreen.class};
		return new CPointer<bScreen>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bScreen.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curscreen'.
	 * @see #__DNA__FIELD__curscreen
	 */
	
	public void setCurscreen(CPointer<bScreen> curscreen) throws IOException
	{
		long __address = ((curscreen == null) ? 0 : curscreen.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'curscene'.
	 * @see #__DNA__FIELD__curscene
	 */
	
	public CPointer<Scene> getCurscene() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Scene.class};
		return new CPointer<Scene>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Scene.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curscene'.
	 * @see #__DNA__FIELD__curscene
	 */
	
	public void setCurscene(CPointer<Scene> curscene) throws IOException
	{
		long __address = ((curscene == null) ? 0 : curscene.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Get method for struct member 'fileflags'.
	 * @see #__DNA__FIELD__fileflags
	 */
	
	public int getFileflags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'fileflags'.
	 * @see #__DNA__FIELD__fileflags
	 */
	
	public void setFileflags(int fileflags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, fileflags);
		} else {
			__io__block.writeInt(__io__address + 24, fileflags);
		}
	}

	/**
	 * Get method for struct member 'globalf'.
	 * @see #__DNA__FIELD__globalf
	 */
	
	public int getGlobalf() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'globalf'.
	 * @see #__DNA__FIELD__globalf
	 */
	
	public void setGlobalf(int globalf) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, globalf);
		} else {
			__io__block.writeInt(__io__address + 28, globalf);
		}
	}

	/**
	 * Get method for struct member 'revision'.
	 * @see #__DNA__FIELD__revision
	 */
	
	public int getRevision() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'revision'.
	 * @see #__DNA__FIELD__revision
	 */
	
	public void setRevision(int revision) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, revision);
		} else {
			__io__block.writeInt(__io__address + 32, revision);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, pad);
		} else {
			__io__block.writeInt(__io__address + 36, pad);
		}
	}

	/**
	 * Get method for struct member 'filename'.
	 * @see #__DNA__FIELD__filename
	 */
	
	public CArrayFacade<Byte> getFilename() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 48, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'filename'.
	 * @see #__DNA__FIELD__filename
	 */
	
	public void setFilename(CArrayFacade<Byte> filename) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 40;
		}
		if (__io__equals(filename, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, filename)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, filename);
		} else {
			__io__generic__copy( getFilename(), filename);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FileGlobal> __io__addressof() {
		return new CPointer<FileGlobal>(__io__address, new Class[]{FileGlobal.class}, __io__block, __io__blockTable);
	}

}