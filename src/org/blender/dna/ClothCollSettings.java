package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ClothCollSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=48, size64=56)
public class ClothCollSettings extends CFacade {

	/**
	 * This is the sdna index of the struct ClothCollSettings.
	 * <p>
	 * It is required when allocating a new block to store data for ClothCollSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 437;

	/**
	 * Field descriptor (offset) for struct member 'collision_list'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__collision_list);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_collision_list = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'collision_list'</li>
	 * <li>Signature: 'LinkNode*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__collision_list = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'epsilon'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__epsilon);
	 * CPointer&lt;Float&gt; p_epsilon = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'epsilon'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__epsilon = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'self_friction'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__self_friction);
	 * CPointer&lt;Float&gt; p_self_friction = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'self_friction'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__self_friction = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'friction'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__friction);
	 * CPointer&lt;Float&gt; p_friction = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'friction'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__friction = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'selfepsilon'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__selfepsilon);
	 * CPointer&lt;Float&gt; p_selfepsilon = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'selfepsilon'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__selfepsilon = new long[]{16, 20};

	/**
	 * Field descriptor (offset) for struct member 'repel_force'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__repel_force);
	 * CPointer&lt;Float&gt; p_repel_force = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'repel_force'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__repel_force = new long[]{20, 24};

	/**
	 * Field descriptor (offset) for struct member 'distance_repel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__distance_repel);
	 * CPointer&lt;Float&gt; p_distance_repel = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'distance_repel'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__distance_repel = new long[]{24, 28};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{28, 32};

	/**
	 * Field descriptor (offset) for struct member 'self_loop_count'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__self_loop_count);
	 * CPointer&lt;Short&gt; p_self_loop_count = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'self_loop_count'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__self_loop_count = new long[]{32, 36};

	/**
	 * Field descriptor (offset) for struct member 'loop_count'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__loop_count);
	 * CPointer&lt;Short&gt; p_loop_count = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'loop_count'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__loop_count = new long[]{34, 38};

	/**
	 * Field descriptor (offset) for struct member 'group'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__group);
	 * CPointer&lt;CPointer&lt;Group&gt;&gt; p_group = p.cast(new Class[]{CPointer.class, Group.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'group'</li>
	 * <li>Signature: 'Group*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__group = new long[]{36, 40};

	/**
	 * Field descriptor (offset) for struct member 'vgroup_selfcol'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__vgroup_selfcol);
	 * CPointer&lt;Short&gt; p_vgroup_selfcol = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup_selfcol'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup_selfcol = new long[]{40, 48};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__pad);
	 * CPointer&lt;Short&gt; p_pad = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{42, 50};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ClothCollSettings clothcollsettings = ...;
	 * CPointer&lt;Object&gt; p = clothcollsettings.__dna__addressof(ClothCollSettings.__DNA__FIELD__pad2);
	 * CPointer&lt;Integer&gt; p_pad2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{44, 52};

	public ClothCollSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ClothCollSettings(ClothCollSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'collision_list'.
	 * @see #__DNA__FIELD__collision_list
	 */
	
	public CPointer<Object> getCollision_list() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'collision_list'.
	 * @see #__DNA__FIELD__collision_list
	 */
	
	public void setCollision_list(CPointer<Object> collision_list) throws IOException
	{
		long __address = ((collision_list == null) ? 0 : collision_list.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'epsilon'.
	 * @see #__DNA__FIELD__epsilon
	 */
	
	public float getEpsilon() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 8);
		} else {
			return __io__block.readFloat(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'epsilon'.
	 * @see #__DNA__FIELD__epsilon
	 */
	
	public void setEpsilon(float epsilon) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 8, epsilon);
		} else {
			__io__block.writeFloat(__io__address + 4, epsilon);
		}
	}

	/**
	 * Get method for struct member 'self_friction'.
	 * @see #__DNA__FIELD__self_friction
	 */
	
	public float getSelf_friction() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 12);
		} else {
			return __io__block.readFloat(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'self_friction'.
	 * @see #__DNA__FIELD__self_friction
	 */
	
	public void setSelf_friction(float self_friction) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 12, self_friction);
		} else {
			__io__block.writeFloat(__io__address + 8, self_friction);
		}
	}

	/**
	 * Get method for struct member 'friction'.
	 * @see #__DNA__FIELD__friction
	 */
	
	public float getFriction() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 16);
		} else {
			return __io__block.readFloat(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'friction'.
	 * @see #__DNA__FIELD__friction
	 */
	
	public void setFriction(float friction) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 16, friction);
		} else {
			__io__block.writeFloat(__io__address + 12, friction);
		}
	}

	/**
	 * Get method for struct member 'selfepsilon'.
	 * @see #__DNA__FIELD__selfepsilon
	 */
	
	public float getSelfepsilon() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 20);
		} else {
			return __io__block.readFloat(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'selfepsilon'.
	 * @see #__DNA__FIELD__selfepsilon
	 */
	
	public void setSelfepsilon(float selfepsilon) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 20, selfepsilon);
		} else {
			__io__block.writeFloat(__io__address + 16, selfepsilon);
		}
	}

	/**
	 * Get method for struct member 'repel_force'.
	 * @see #__DNA__FIELD__repel_force
	 */
	
	public float getRepel_force() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'repel_force'.
	 * @see #__DNA__FIELD__repel_force
	 */
	
	public void setRepel_force(float repel_force) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, repel_force);
		} else {
			__io__block.writeFloat(__io__address + 20, repel_force);
		}
	}

	/**
	 * Get method for struct member 'distance_repel'.
	 * @see #__DNA__FIELD__distance_repel
	 */
	
	public float getDistance_repel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 28);
		} else {
			return __io__block.readFloat(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'distance_repel'.
	 * @see #__DNA__FIELD__distance_repel
	 */
	
	public void setDistance_repel(float distance_repel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 28, distance_repel);
		} else {
			__io__block.writeFloat(__io__address + 24, distance_repel);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, flags);
		} else {
			__io__block.writeInt(__io__address + 28, flags);
		}
	}

	/**
	 * Get method for struct member 'self_loop_count'.
	 * @see #__DNA__FIELD__self_loop_count
	 */
	
	public short getSelf_loop_count() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 36);
		} else {
			return __io__block.readShort(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'self_loop_count'.
	 * @see #__DNA__FIELD__self_loop_count
	 */
	
	public void setSelf_loop_count(short self_loop_count) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 36, self_loop_count);
		} else {
			__io__block.writeShort(__io__address + 32, self_loop_count);
		}
	}

	/**
	 * Get method for struct member 'loop_count'.
	 * @see #__DNA__FIELD__loop_count
	 */
	
	public short getLoop_count() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 38);
		} else {
			return __io__block.readShort(__io__address + 34);
		}
	}

	/**
	 * Set method for struct member 'loop_count'.
	 * @see #__DNA__FIELD__loop_count
	 */
	
	public void setLoop_count(short loop_count) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 38, loop_count);
		} else {
			__io__block.writeShort(__io__address + 34, loop_count);
		}
	}

	/**
	 * Get method for struct member 'group'.
	 * @see #__DNA__FIELD__group
	 */
	
	public CPointer<Group> getGroup() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 36);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Group.class};
		return new CPointer<Group>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Group.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'group'.
	 * @see #__DNA__FIELD__group
	 */
	
	public void setGroup(CPointer<Group> group) throws IOException
	{
		long __address = ((group == null) ? 0 : group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 36, __address);
		}
	}

	/**
	 * Get method for struct member 'vgroup_selfcol'.
	 * @see #__DNA__FIELD__vgroup_selfcol
	 */
	
	public short getVgroup_selfcol() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 48);
		} else {
			return __io__block.readShort(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'vgroup_selfcol'.
	 * @see #__DNA__FIELD__vgroup_selfcol
	 */
	
	public void setVgroup_selfcol(short vgroup_selfcol) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 48, vgroup_selfcol);
		} else {
			__io__block.writeShort(__io__address + 40, vgroup_selfcol);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public short getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 50);
		} else {
			return __io__block.readShort(__io__address + 42);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(short pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 50, pad);
		} else {
			__io__block.writeShort(__io__address + 42, pad);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public int getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 52);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(int pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 52, pad2);
		} else {
			__io__block.writeInt(__io__address + 44, pad2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ClothCollSettings> __io__addressof() {
		return new CPointer<ClothCollSettings>(__io__address, new Class[]{ClothCollSettings.class}, __io__block, __io__blockTable);
	}

}
