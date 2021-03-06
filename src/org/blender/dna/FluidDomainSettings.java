package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FluidDomainSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=2100, size64=2208)
public class FluidDomainSettings extends CFacade {

	/**
	 * This is the sdna index of the struct FluidDomainSettings.
	 * <p>
	 * It is required when allocating a new block to store data for FluidDomainSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 554;

	/**
	 * Field descriptor (offset) for struct member 'mmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><ndash/>  Runtime-only fields (from here on). <ndash/>  For fast RNA access. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__mmd);
	 * CPointer&lt;CPointer&lt;FluidModifierData&gt;&gt; p_mmd = p.cast(new Class[]{CPointer.class, FluidModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mmd'</li>
	 * <li>Signature: 'FluidModifierData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mmd = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'fluid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__fluid);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_fluid = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fluid'</li>
	 * <li>Signature: 'MANTA*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fluid = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'fluid_old'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Adaptive domain needs access to old fluid state. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__fluid_old);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_fluid_old = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fluid_old'</li>
	 * <li>Signature: 'MANTA*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fluid_old = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'fluid_mutex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__fluid_mutex);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_fluid_mutex = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fluid_mutex'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fluid_mutex = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'fluid_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit fluid objects to this collection
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__fluid_group);
	 * CPointer&lt;CPointer&lt;Collection&gt;&gt; p_fluid_group = p.cast(new Class[]{CPointer.class, Collection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fluid_group'</li>
	 * <li>Signature: 'Collection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fluid_group = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'force_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> UNUSED </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__force_group);
	 * CPointer&lt;CPointer&lt;Collection&gt;&gt; p_force_group = p.cast(new Class[]{CPointer.class, Collection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'force_group'</li>
	 * <li>Signature: 'Collection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__force_group = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'effector_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit effectors to this collection<h4>Blender Source Code:</h4>
	 * <p> Effector objects group. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__effector_group);
	 * CPointer&lt;CPointer&lt;Collection&gt;&gt; p_effector_group = p.cast(new Class[]{CPointer.class, Collection.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'effector_group'</li>
	 * <li>Signature: 'Collection*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__effector_group = new long[]{24, 48};

	/**
	 * Field descriptor (offset) for struct member 'tex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__tex);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex = new long[]{28, 56};

	/**
	 * Field descriptor (offset) for struct member 'tex_wt'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__tex_wt);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_wt = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_wt'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_wt = new long[]{32, 64};

	/**
	 * Field descriptor (offset) for struct member 'tex_shadow'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__tex_shadow);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_shadow = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_shadow'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_shadow = new long[]{36, 72};

	/**
	 * Field descriptor (offset) for struct member 'tex_flame'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__tex_flame);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_flame = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_flame'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_flame = new long[]{40, 80};

	/**
	 * Field descriptor (offset) for struct member 'tex_flame_coba'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__tex_flame_coba);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_flame_coba = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_flame_coba'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_flame_coba = new long[]{44, 88};

	/**
	 * Field descriptor (offset) for struct member 'tex_coba'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__tex_coba);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_coba = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_coba'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_coba = new long[]{48, 96};

	/**
	 * Field descriptor (offset) for struct member 'tex_field'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__tex_field);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_field = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_field'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_field = new long[]{52, 104};

	/**
	 * Field descriptor (offset) for struct member 'tex_velocity_x'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__tex_velocity_x);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_velocity_x = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_velocity_x'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_velocity_x = new long[]{56, 112};

	/**
	 * Field descriptor (offset) for struct member 'tex_velocity_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__tex_velocity_y);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_velocity_y = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_velocity_y'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_velocity_y = new long[]{60, 120};

	/**
	 * Field descriptor (offset) for struct member 'tex_velocity_z'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__tex_velocity_z);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tex_velocity_z = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tex_velocity_z'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tex_velocity_z = new long[]{64, 128};

	/**
	 * Field descriptor (offset) for struct member 'guiding_parent'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__guiding_parent);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_guiding_parent = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'guiding_parent'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__guiding_parent = new long[]{68, 136};

	/**
	 * Field descriptor (offset) for struct member 'mesh_velocities'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex velocities of simulated fluid mesh. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__mesh_velocities);
	 * CPointer&lt;CPointer&lt;FluidDomainVertexVelocity&gt;&gt; p_mesh_velocities = p.cast(new Class[]{CPointer.class, FluidDomainVertexVelocity.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mesh_velocities'</li>
	 * <li>Signature: 'FluidDomainVertexVelocity*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mesh_velocities = new long[]{72, 144};

	/**
	 * Field descriptor (offset) for struct member 'effector_weights'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__effector_weights);
	 * CPointer&lt;CPointer&lt;EffectorWeights&gt;&gt; p_effector_weights = p.cast(new Class[]{CPointer.class, EffectorWeights.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'effector_weights'</li>
	 * <li>Signature: 'EffectorWeights*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__effector_weights = new long[]{76, 152};

	/**
	 * Field descriptor (offset) for struct member 'p0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain object data. Start point of BB in local space (includes sub-cell shift for adaptive domain). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__p0);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_p0 = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'p0'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__p0 = new long[]{80, 160};

	/**
	 * Field descriptor (offset) for struct member 'p1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End point of BB in local space. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__p1);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_p1 = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'p1'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__p1 = new long[]{92, 172};

	/**
	 * Field descriptor (offset) for struct member 'dp0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Difference from object center to grid start point. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__dp0);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_dp0 = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dp0'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dp0 = new long[]{104, 184};

	/**
	 * Field descriptor (offset) for struct member 'cell_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Cell Size<h4>Blender Source Code:</h4>
	 * <p> Size of simulation cell in local space. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cell_size);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_cell_size = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cell_size'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cell_size = new long[]{116, 196};

	/**
	 * Field descriptor (offset) for struct member 'global_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Global size of domain axises. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__global_size);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_global_size = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'global_size'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__global_size = new long[]{128, 208};

	/**
	 * Field descriptor (offset) for struct member 'prev_loc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__prev_loc);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_prev_loc = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev_loc'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev_loc = new long[]{140, 220};

	/**
	 * Field descriptor (offset) for struct member 'shift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current domain shift in simulation cells. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__shift);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_shift = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shift'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shift = new long[]{152, 232};

	/**
	 * Field descriptor (offset) for struct member 'shift_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Exact domain shift. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__shift_f);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_shift_f = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'shift_f'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__shift_f = new long[]{164, 244};

	/**
	 * Field descriptor (offset) for struct member 'obj_shift_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How much object has shifted since previous smoke frame (used to "lock" domain while drawing). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__obj_shift_f);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_obj_shift_f = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'obj_shift_f'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__obj_shift_f = new long[]{176, 256};

	/**
	 * Field descriptor (offset) for struct member 'imat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain object imat. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__imat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_imat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'imat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__imat = new long[]{188, 268};

	/**
	 * Field descriptor (offset) for struct member 'obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain obmat. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__obmat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_obmat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'obmat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__obmat = new long[]{252, 332};

	/**
	 * Field descriptor (offset) for struct member 'fluidmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Low res fluid matrix. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__fluidmat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_fluidmat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fluidmat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fluidmat = new long[]{316, 396};

	/**
	 * Field descriptor (offset) for struct member 'fluidmat_wt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> High res fluid matrix. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__fluidmat_wt);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_fluidmat_wt = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fluidmat_wt'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fluidmat_wt = new long[]{380, 460};

	/**
	 * Field descriptor (offset) for struct member 'base_res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Initial "non-adapted" resolution. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__base_res);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_base_res = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base_res'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base_res = new long[]{444, 524};

	/**
	 * Field descriptor (offset) for struct member 'res_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cell min. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__res_min);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_res_min = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'res_min'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__res_min = new long[]{456, 536};

	/**
	 * Field descriptor (offset) for struct member 'res_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cell max. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__res_max);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_res_max = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'res_max'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__res_max = new long[]{468, 548};

	/**
	 * Field descriptor (offset) for struct member 'res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Data resolution (res_max-res_min). </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__res);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_res = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'res'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__res = new long[]{480, 560};

	/**
	 * Field descriptor (offset) for struct member 'total_cells'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__total_cells);
	 * CPointer&lt;Integer&gt; p_total_cells = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'total_cells'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__total_cells = new long[]{492, 572};

	/**
	 * Field descriptor (offset) for struct member 'dx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1.0f / res. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__dx);
	 * CPointer&lt;Float&gt; p_dx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dx = new long[]{496, 576};

	/**
	 * Field descriptor (offset) for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Largest domain size. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__scale);
	 * CPointer&lt;Float&gt; p_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scale = new long[]{500, 580};

	/**
	 * Field descriptor (offset) for struct member 'boundary_width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Usually this is just 1. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__boundary_width);
	 * CPointer&lt;Integer&gt; p_boundary_width = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'boundary_width'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__boundary_width = new long[]{504, 584};

	/**
	 * Field descriptor (offset) for struct member 'adapt_margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Margin added around fluid to minimize boundary interference<h4>Blender Source Code:</h4>
	 * <p><ndash/>  User-accesible fields (from here on). <ndash/>  Adaptive domain options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__adapt_margin);
	 * CPointer&lt;Integer&gt; p_adapt_margin = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adapt_margin'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adapt_margin = new long[]{508, 588};

	/**
	 * Field descriptor (offset) for struct member 'adapt_res'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__adapt_res);
	 * CPointer&lt;Integer&gt; p_adapt_res = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adapt_res'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adapt_res = new long[]{512, 592};

	/**
	 * Field descriptor (offset) for struct member 'adapt_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum amount of fluid cell can contain before it is considered empty
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__adapt_threshold);
	 * CPointer&lt;Float&gt; p_adapt_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'adapt_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__adapt_threshold = new long[]{516, 596};

	/**
	 * Field descriptor (offset) for struct member '_pad1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD___pad1);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad1 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad1'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad1 = new long[]{520, 600};

	/**
	 * Field descriptor (offset) for struct member 'maxres'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Fluid domain options Longest axis on the BB gets this resolution assigned. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__maxres);
	 * CPointer&lt;Integer&gt; p_maxres = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxres'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxres = new long[]{524, 604};

	/**
	 * Field descriptor (offset) for struct member 'solver_res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dimension of manta solver, 2d or 3d. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__solver_res);
	 * CPointer&lt;Integer&gt; p_solver_res = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'solver_res'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__solver_res = new long[]{528, 608};

	/**
	 * Field descriptor (offset) for struct member 'border_collisions'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How domain border collisions are handled. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__border_collisions);
	 * CPointer&lt;Integer&gt; p_border_collisions = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'border_collisions'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__border_collisions = new long[]{532, 612};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Use-mesh, use-noise, etc. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{536, 616};

	/**
	 * Field descriptor (offset) for struct member 'gravity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Gravity in X, Y and Z direction
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__gravity);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gravity = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gravity'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gravity = new long[]{540, 620};

	/**
	 * Field descriptor (offset) for struct member 'active_fields'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__active_fields);
	 * CPointer&lt;Integer&gt; p_active_fields = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_fields'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_fields = new long[]{552, 632};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gas, liquid. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{556, 636};

	/**
	 * Field descriptor (offset) for struct member '_pad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD___pad2);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad2 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad2'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad2 = new long[]{558, 638};

	/**
	 * Field descriptor (offset) for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Buoyant force based on smoke density (higher value results in faster rising smoke)<h4>Blender Source Code:</h4>
	 * <p> Smoke domain options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__alpha);
	 * CPointer&lt;Float&gt; p_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alpha = new long[]{564, 644};

	/**
	 * Field descriptor (offset) for struct member 'beta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Buoyant force based on smoke heat (higher value results in faster rising smoke)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__beta);
	 * CPointer&lt;Float&gt; p_beta = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'beta'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__beta = new long[]{568, 648};

	/**
	 * Field descriptor (offset) for struct member 'diss_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In frames. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__diss_speed);
	 * CPointer&lt;Integer&gt; p_diss_speed = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'diss_speed'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__diss_speed = new long[]{572, 652};

	/**
	 * Field descriptor (offset) for struct member 'vorticity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of turbulence and rotation in smoke
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__vorticity);
	 * CPointer&lt;Float&gt; p_vorticity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vorticity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vorticity = new long[]{576, 656};

	/**
	 * Field descriptor (offset) for struct member 'active_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Monitor smoke color. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__active_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_active_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active_color'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active_color = new long[]{580, 660};

	/**
	 * Field descriptor (offset) for struct member 'highres_sampling'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method for sampling the high resolution flow
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__highres_sampling);
	 * CPointer&lt;Integer&gt; p_highres_sampling = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'highres_sampling'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__highres_sampling = new long[]{592, 672};

	/**
	 * Field descriptor (offset) for struct member 'burning_rate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed of the burning reaction (higher value results in smaller flames)<h4>Blender Source Code:</h4>
	 * <p> Flame options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__burning_rate);
	 * CPointer&lt;Float&gt; p_burning_rate = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'burning_rate'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__burning_rate = new long[]{596, 676};

	/**
	 * Field descriptor (offset) for struct member 'flame_smoke'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of smoke created by burning fuel
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__flame_smoke);
	 * CPointer&lt;Float&gt; p_flame_smoke = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flame_smoke'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flame_smoke = new long[]{600, 680};

	/**
	 * Field descriptor (offset) for struct member 'flame_vorticity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Additional vorticity for the flames
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__flame_vorticity);
	 * CPointer&lt;Float&gt; p_flame_vorticity = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flame_vorticity'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flame_vorticity = new long[]{604, 684};

	/**
	 * Field descriptor (offset) for struct member 'flame_ignition'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum temperature of the flames (higher value results in faster rising flames)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__flame_ignition);
	 * CPointer&lt;Float&gt; p_flame_ignition = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flame_ignition'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flame_ignition = new long[]{608, 688};

	/**
	 * Field descriptor (offset) for struct member 'flame_max_temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum temperature of the flames (higher value results in faster rising flames)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__flame_max_temp);
	 * CPointer&lt;Float&gt; p_flame_max_temp = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flame_max_temp'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flame_max_temp = new long[]{612, 692};

	/**
	 * Field descriptor (offset) for struct member 'flame_smoke_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color of smoke emitted from burning fuel
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__flame_smoke_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_flame_smoke_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flame_smoke_color'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flame_smoke_color = new long[]{616, 696};

	/**
	 * Field descriptor (offset) for struct member 'noise_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Strength of noise<h4>Blender Source Code:</h4>
	 * <p> Noise options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__noise_strength);
	 * CPointer&lt;Float&gt; p_noise_strength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noise_strength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noise_strength = new long[]{628, 708};

	/**
	 * Field descriptor (offset) for struct member 'noise_pos_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale of noise (higher value results in larger vortices)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__noise_pos_scale);
	 * CPointer&lt;Float&gt; p_noise_pos_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noise_pos_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noise_pos_scale = new long[]{632, 712};

	/**
	 * Field descriptor (offset) for struct member 'noise_time_anim'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Animation time of noise
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__noise_time_anim);
	 * CPointer&lt;Float&gt; p_noise_time_anim = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noise_time_anim'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noise_time_anim = new long[]{636, 716};

	/**
	 * Field descriptor (offset) for struct member 'res_noise'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__res_noise);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_res_noise = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'res_noise'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__res_noise = new long[]{640, 720};

	/**
	 * Field descriptor (offset) for struct member 'noise_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The noise simulation is scaled up by this factor (compared to the base resolution of the domain)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__noise_scale);
	 * CPointer&lt;Integer&gt; p_noise_scale = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noise_scale'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noise_scale = new long[]{652, 732};

	/**
	 * Field descriptor (offset) for struct member 'noise_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Noise method which is used during the high-res simulation<h4>Blender Source Code:</h4>
	 * <p> Noise type: wave, curl, anisotropic. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__noise_type);
	 * CPointer&lt;Short&gt; p_noise_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'noise_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__noise_type = new long[]{656, 736};

	/**
	 * Field descriptor (offset) for struct member '_pad3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD___pad3);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad3 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad3'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad3 = new long[]{658, 738};

	/**
	 * Field descriptor (offset) for struct member 'particle_randomness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Randomness factor for particle sampling<h4>Blender Source Code:</h4>
	 * <p> Liquid domain options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__particle_randomness);
	 * CPointer&lt;Float&gt; p_particle_randomness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particle_randomness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particle_randomness = new long[]{660, 740};

	/**
	 * Field descriptor (offset) for struct member 'particle_number'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle number factor (higher value results in more particles)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__particle_number);
	 * CPointer&lt;Integer&gt; p_particle_number = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particle_number'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particle_number = new long[]{664, 744};

	/**
	 * Field descriptor (offset) for struct member 'particle_minimum'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__particle_minimum);
	 * CPointer&lt;Integer&gt; p_particle_minimum = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particle_minimum'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particle_minimum = new long[]{668, 748};

	/**
	 * Field descriptor (offset) for struct member 'particle_maximum'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__particle_maximum);
	 * CPointer&lt;Integer&gt; p_particle_maximum = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particle_maximum'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particle_maximum = new long[]{672, 752};

	/**
	 * Field descriptor (offset) for struct member 'particle_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle radius factor. Increase this value if the simulation appears to leak volume, decrease it if the simulation seems to gain volume
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__particle_radius);
	 * CPointer&lt;Float&gt; p_particle_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particle_radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particle_radius = new long[]{676, 756};

	/**
	 * Field descriptor (offset) for struct member 'particle_band_width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle (narrow) band width (higher value results in thicker band and more particles)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__particle_band_width);
	 * CPointer&lt;Float&gt; p_particle_band_width = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particle_band_width'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particle_band_width = new long[]{680, 760};

	/**
	 * Field descriptor (offset) for struct member 'fractions_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Determines how much fluid is allowed in an obstacle cell (higher values will tag a boundary cell as an obstacle easier and reduce the boundary smoothening effect)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__fractions_threshold);
	 * CPointer&lt;Float&gt; p_fractions_threshold = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fractions_threshold'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fractions_threshold = new long[]{684, 764};

	/**
	 * Field descriptor (offset) for struct member 'flip_ratio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * PIC/FLIP Ratio. A value of 1.0 will result in a completely FLIP based simulation. Use a lower value for simulations which should produce smaller splashes
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__flip_ratio);
	 * CPointer&lt;Float&gt; p_flip_ratio = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flip_ratio'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flip_ratio = new long[]{688, 768};

	/**
	 * Field descriptor (offset) for struct member 'simulation_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Change the underlying simulation method
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__simulation_method);
	 * CPointer&lt;Short&gt; p_simulation_method = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'simulation_method'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__simulation_method = new long[]{692, 772};

	/**
	 * Field descriptor (offset) for struct member '_pad4'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD___pad4);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad4 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad4'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad4 = new long[]{694, 774};

	/**
	 * Field descriptor (offset) for struct member 'surface_tension'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Surface tension of liquid (higher value results in greater hydrophobic behaviour)<h4>Blender Source Code:</h4>
	 * <p> Diffusion options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__surface_tension);
	 * CPointer&lt;Float&gt; p_surface_tension = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'surface_tension'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__surface_tension = new long[]{700, 780};

	/**
	 * Field descriptor (offset) for struct member 'viscosity_base'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Viscosity setting: value that is multiplied by 10 to the power of (exponent*-1)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__viscosity_base);
	 * CPointer&lt;Float&gt; p_viscosity_base = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viscosity_base'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viscosity_base = new long[]{704, 784};

	/**
	 * Field descriptor (offset) for struct member 'viscosity_exponent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Negative exponent for the viscosity value (to simplify entering small values e.g. 5*10^-6)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__viscosity_exponent);
	 * CPointer&lt;Integer&gt; p_viscosity_exponent = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viscosity_exponent'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viscosity_exponent = new long[]{708, 788};

	/**
	 * Field descriptor (offset) for struct member 'domain_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Domain size in meters (longest domain side)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__domain_size);
	 * CPointer&lt;Float&gt; p_domain_size = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'domain_size'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__domain_size = new long[]{712, 792};

	/**
	 * Field descriptor (offset) for struct member 'mesh_concave_upper'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper mesh concavity bound (high values tend to smoothen and fill out concave regions)<h4>Blender Source Code:</h4>
	 * <p>{@link Mesh}  options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__mesh_concave_upper);
	 * CPointer&lt;Float&gt; p_mesh_concave_upper = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mesh_concave_upper'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mesh_concave_upper = new long[]{716, 796};

	/**
	 * Field descriptor (offset) for struct member 'mesh_concave_lower'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower mesh concavity bound (high values tend to smoothen and fill out concave regions)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__mesh_concave_lower);
	 * CPointer&lt;Float&gt; p_mesh_concave_lower = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mesh_concave_lower'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mesh_concave_lower = new long[]{720, 800};

	/**
	 * Field descriptor (offset) for struct member 'mesh_particle_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle radius factor (higher value results in larger (meshed) particles). Needs to be adjusted after changing the mesh scale
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__mesh_particle_radius);
	 * CPointer&lt;Float&gt; p_mesh_particle_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mesh_particle_radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mesh_particle_radius = new long[]{724, 804};

	/**
	 * Field descriptor (offset) for struct member 'mesh_smoothen_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Positive mesh smoothening
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__mesh_smoothen_pos);
	 * CPointer&lt;Integer&gt; p_mesh_smoothen_pos = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mesh_smoothen_pos'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mesh_smoothen_pos = new long[]{728, 808};

	/**
	 * Field descriptor (offset) for struct member 'mesh_smoothen_neg'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Negative mesh smoothening
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__mesh_smoothen_neg);
	 * CPointer&lt;Integer&gt; p_mesh_smoothen_neg = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mesh_smoothen_neg'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mesh_smoothen_neg = new long[]{732, 812};

	/**
	 * Field descriptor (offset) for struct member 'mesh_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The mesh simulation is scaled up by this factor (compared to the base resolution of the domain). For best meshing, it is recommended to adjust the mesh particle radius alongside this value
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__mesh_scale);
	 * CPointer&lt;Integer&gt; p_mesh_scale = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mesh_scale'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mesh_scale = new long[]{736, 816};

	/**
	 * Field descriptor (offset) for struct member 'totvert'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__totvert);
	 * CPointer&lt;Integer&gt; p_totvert = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totvert'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totvert = new long[]{740, 820};

	/**
	 * Field descriptor (offset) for struct member 'mesh_generator'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Which particle levelset generator to use
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__mesh_generator);
	 * CPointer&lt;Short&gt; p_mesh_generator = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mesh_generator'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mesh_generator = new long[]{744, 824};

	/**
	 * Field descriptor (offset) for struct member '_pad5'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD___pad5);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad5 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad5'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad5 = new long[]{746, 826};

	/**
	 * Field descriptor (offset) for struct member 'particle_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Secondary particle options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__particle_type);
	 * CPointer&lt;Integer&gt; p_particle_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particle_type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particle_type = new long[]{748, 828};

	/**
	 * Field descriptor (offset) for struct member 'particle_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The particle simulation is scaled up by this factor (compared to the base resolution of the domain)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__particle_scale);
	 * CPointer&lt;Integer&gt; p_particle_scale = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particle_scale'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particle_scale = new long[]{752, 832};

	/**
	 * Field descriptor (offset) for struct member 'sndparticle_tau_min_wc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower clamping threshold for marking fluid cells as wave crests (lower value results in more marked cells)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__sndparticle_tau_min_wc);
	 * CPointer&lt;Float&gt; p_sndparticle_tau_min_wc = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sndparticle_tau_min_wc'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sndparticle_tau_min_wc = new long[]{756, 836};

	/**
	 * Field descriptor (offset) for struct member 'sndparticle_tau_max_wc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper clamping threshold for marking fluid cells as wave crests (higher value results in less marked cells)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__sndparticle_tau_max_wc);
	 * CPointer&lt;Float&gt; p_sndparticle_tau_max_wc = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sndparticle_tau_max_wc'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sndparticle_tau_max_wc = new long[]{760, 840};

	/**
	 * Field descriptor (offset) for struct member 'sndparticle_tau_min_ta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower clamping threshold for marking fluid cells where air is trapped (lower value results in more marked cells)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__sndparticle_tau_min_ta);
	 * CPointer&lt;Float&gt; p_sndparticle_tau_min_ta = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sndparticle_tau_min_ta'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sndparticle_tau_min_ta = new long[]{764, 844};

	/**
	 * Field descriptor (offset) for struct member 'sndparticle_tau_max_ta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper clamping threshold for marking fluid cells where air is trapped (highe value results in less marked cells)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__sndparticle_tau_max_ta);
	 * CPointer&lt;Float&gt; p_sndparticle_tau_max_ta = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sndparticle_tau_max_ta'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sndparticle_tau_max_ta = new long[]{768, 848};

	/**
	 * Field descriptor (offset) for struct member 'sndparticle_tau_min_k'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower clamping threshold that indicates the fluid speed where cells start to emit particles (lower values result in generally more particles)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__sndparticle_tau_min_k);
	 * CPointer&lt;Float&gt; p_sndparticle_tau_min_k = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sndparticle_tau_min_k'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sndparticle_tau_min_k = new long[]{772, 852};

	/**
	 * Field descriptor (offset) for struct member 'sndparticle_tau_max_k'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper clamping threshold that indicates the fluid speed where cells no longer emit more particles (higher value results in generally less particles)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__sndparticle_tau_max_k);
	 * CPointer&lt;Float&gt; p_sndparticle_tau_max_k = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sndparticle_tau_max_k'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sndparticle_tau_max_k = new long[]{776, 856};

	/**
	 * Field descriptor (offset) for struct member 'sndparticle_k_wc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum number of particles generated per wave crest cell per frame
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__sndparticle_k_wc);
	 * CPointer&lt;Integer&gt; p_sndparticle_k_wc = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sndparticle_k_wc'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sndparticle_k_wc = new long[]{780, 860};

	/**
	 * Field descriptor (offset) for struct member 'sndparticle_k_ta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum number of particles generated per trapped air cell per frame
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__sndparticle_k_ta);
	 * CPointer&lt;Integer&gt; p_sndparticle_k_ta = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sndparticle_k_ta'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sndparticle_k_ta = new long[]{784, 864};

	/**
	 * Field descriptor (offset) for struct member 'sndparticle_k_b'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of buoyancy force that rises bubbles (high value results in bubble movement mainly upwards)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__sndparticle_k_b);
	 * CPointer&lt;Float&gt; p_sndparticle_k_b = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sndparticle_k_b'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sndparticle_k_b = new long[]{788, 868};

	/**
	 * Field descriptor (offset) for struct member 'sndparticle_k_d'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of drag force that moves bubbles along with the fluid (high value results in bubble movement mainly along with the fluid)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__sndparticle_k_d);
	 * CPointer&lt;Float&gt; p_sndparticle_k_d = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sndparticle_k_d'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sndparticle_k_d = new long[]{792, 872};

	/**
	 * Field descriptor (offset) for struct member 'sndparticle_l_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lowest possible particle lifetime
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__sndparticle_l_min);
	 * CPointer&lt;Float&gt; p_sndparticle_l_min = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sndparticle_l_min'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sndparticle_l_min = new long[]{796, 876};

	/**
	 * Field descriptor (offset) for struct member 'sndparticle_l_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Highest possible particle lifetime
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__sndparticle_l_max);
	 * CPointer&lt;Float&gt; p_sndparticle_l_max = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sndparticle_l_max'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sndparticle_l_max = new long[]{800, 880};

	/**
	 * Field descriptor (offset) for struct member 'sndparticle_potential_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius to compute potential for each cell (higher values are slower but create smoother potential grids)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__sndparticle_potential_radius);
	 * CPointer&lt;Integer&gt; p_sndparticle_potential_radius = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sndparticle_potential_radius'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sndparticle_potential_radius = new long[]{804, 884};

	/**
	 * Field descriptor (offset) for struct member 'sndparticle_update_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius to compute position update for each particle (higher values are slower but particles move less chaotic)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__sndparticle_update_radius);
	 * CPointer&lt;Integer&gt; p_sndparticle_update_radius = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sndparticle_update_radius'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sndparticle_update_radius = new long[]{808, 888};

	/**
	 * Field descriptor (offset) for struct member 'sndparticle_boundary'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How particles that left the domain are treated
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__sndparticle_boundary);
	 * CPointer&lt;Byte&gt; p_sndparticle_boundary = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sndparticle_boundary'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sndparticle_boundary = new long[]{812, 892};

	/**
	 * Field descriptor (offset) for struct member 'sndparticle_combined_export'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Determines which particle systems are created from secondary particles
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__sndparticle_combined_export);
	 * CPointer&lt;Byte&gt; p_sndparticle_combined_export = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sndparticle_combined_export'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sndparticle_combined_export = new long[]{813, 893};

	/**
	 * Field descriptor (offset) for struct member '_pad6'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD___pad6);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad6 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad6'</li>
	 * <li>Signature: 'char[6]'</li>
	 * <li>Actual Size (32bit/64bit): 6/6</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad6 = new long[]{814, 894};

	/**
	 * Field descriptor (offset) for struct member 'guiding_alpha'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__guiding_alpha);
	 * CPointer&lt;Float&gt; p_guiding_alpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'guiding_alpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__guiding_alpha = new long[]{820, 900};

	/**
	 * Field descriptor (offset) for struct member 'guiding_beta'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__guiding_beta);
	 * CPointer&lt;Integer&gt; p_guiding_beta = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'guiding_beta'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__guiding_beta = new long[]{824, 904};

	/**
	 * Field descriptor (offset) for struct member 'guiding_vel_factor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__guiding_vel_factor);
	 * CPointer&lt;Float&gt; p_guiding_vel_factor = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'guiding_vel_factor'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__guiding_vel_factor = new long[]{828, 908};

	/**
	 * Field descriptor (offset) for struct member 'guide_res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Res for velocity guide grids - independent from base res. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__guide_res);
	 * CPointer&lt;CArrayFacade&lt;Integer&gt;&gt; p_guide_res = p.cast(new Class[]{CArrayFacade.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'guide_res'</li>
	 * <li>Signature: 'int[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__guide_res = new long[]{832, 912};

	/**
	 * Field descriptor (offset) for struct member 'guiding_source'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__guiding_source);
	 * CPointer&lt;Short&gt; p_guiding_source = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'guiding_source'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__guiding_source = new long[]{844, 924};

	/**
	 * Field descriptor (offset) for struct member '_pad7'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD___pad7);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad7 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad7'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad7 = new long[]{846, 926};

	/**
	 * Field descriptor (offset) for struct member 'cache_frame_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Frame on which the simulation starts<h4>Blender Source Code:</h4>
	 * <p> Cache options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cache_frame_start);
	 * CPointer&lt;Integer&gt; p_cache_frame_start = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_frame_start'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_frame_start = new long[]{848, 928};

	/**
	 * Field descriptor (offset) for struct member 'cache_frame_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Frame on which the simulation stops
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cache_frame_end);
	 * CPointer&lt;Integer&gt; p_cache_frame_end = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_frame_end'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_frame_end = new long[]{852, 932};

	/**
	 * Field descriptor (offset) for struct member 'cache_frame_pause_data'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cache_frame_pause_data);
	 * CPointer&lt;Integer&gt; p_cache_frame_pause_data = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_frame_pause_data'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_frame_pause_data = new long[]{856, 936};

	/**
	 * Field descriptor (offset) for struct member 'cache_frame_pause_noise'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cache_frame_pause_noise);
	 * CPointer&lt;Integer&gt; p_cache_frame_pause_noise = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_frame_pause_noise'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_frame_pause_noise = new long[]{860, 940};

	/**
	 * Field descriptor (offset) for struct member 'cache_frame_pause_mesh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cache_frame_pause_mesh);
	 * CPointer&lt;Integer&gt; p_cache_frame_pause_mesh = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_frame_pause_mesh'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_frame_pause_mesh = new long[]{864, 944};

	/**
	 * Field descriptor (offset) for struct member 'cache_frame_pause_particles'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cache_frame_pause_particles);
	 * CPointer&lt;Integer&gt; p_cache_frame_pause_particles = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_frame_pause_particles'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_frame_pause_particles = new long[]{868, 948};

	/**
	 * Field descriptor (offset) for struct member 'cache_frame_pause_guiding'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cache_frame_pause_guiding);
	 * CPointer&lt;Integer&gt; p_cache_frame_pause_guiding = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_frame_pause_guiding'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_frame_pause_guiding = new long[]{872, 952};

	/**
	 * Field descriptor (offset) for struct member 'cache_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cache_flag);
	 * CPointer&lt;Integer&gt; p_cache_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_flag = new long[]{876, 956};

	/**
	 * Field descriptor (offset) for struct member 'cache_mesh_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the file format to be used for caching surface data
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cache_mesh_format);
	 * CPointer&lt;Byte&gt; p_cache_mesh_format = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_mesh_format'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_mesh_format = new long[]{880, 960};

	/**
	 * Field descriptor (offset) for struct member 'cache_data_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the file format to be used for caching volumetric data
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cache_data_format);
	 * CPointer&lt;Byte&gt; p_cache_data_format = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_data_format'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_data_format = new long[]{881, 961};

	/**
	 * Field descriptor (offset) for struct member 'cache_particle_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the file format to be used for caching particle data
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cache_particle_format);
	 * CPointer&lt;Byte&gt; p_cache_particle_format = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_particle_format'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_particle_format = new long[]{882, 962};

	/**
	 * Field descriptor (offset) for struct member 'cache_noise_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the file format to be used for caching noise data
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cache_noise_format);
	 * CPointer&lt;Byte&gt; p_cache_noise_format = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_noise_format'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_noise_format = new long[]{883, 963};

	/**
	 * Field descriptor (offset) for struct member 'cache_directory'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Directory that contains fluid cache files
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cache_directory);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_cache_directory = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_directory'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_directory = new long[]{884, 964};

	/**
	 * Field descriptor (offset) for struct member 'error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bake error description. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__error);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_error = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'error'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__error = new long[]{1908, 1988};

	/**
	 * Field descriptor (offset) for struct member 'cache_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Change the cache type of the simulation
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cache_type);
	 * CPointer&lt;Short&gt; p_cache_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_type = new long[]{1972, 2052};

	/**
	 * Field descriptor (offset) for struct member '_pad8'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD___pad8);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad8 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad8'</li>
	 * <li>Signature: 'char[2]'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad8 = new long[]{1974, 2054};

	/**
	 * Field descriptor (offset) for struct member 'dt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Time options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__dt);
	 * CPointer&lt;Float&gt; p_dt = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dt'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dt = new long[]{1976, 2056};

	/**
	 * Field descriptor (offset) for struct member 'time_total'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__time_total);
	 * CPointer&lt;Float&gt; p_time_total = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_total'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_total = new long[]{1980, 2060};

	/**
	 * Field descriptor (offset) for struct member 'time_per_frame'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__time_per_frame);
	 * CPointer&lt;Float&gt; p_time_per_frame = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_per_frame'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_per_frame = new long[]{1984, 2064};

	/**
	 * Field descriptor (offset) for struct member 'frame_length'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__frame_length);
	 * CPointer&lt;Float&gt; p_frame_length = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frame_length'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frame_length = new long[]{1988, 2068};

	/**
	 * Field descriptor (offset) for struct member 'time_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust simulation speed
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__time_scale);
	 * CPointer&lt;Float&gt; p_time_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'time_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__time_scale = new long[]{1992, 2072};

	/**
	 * Field descriptor (offset) for struct member 'cfl_condition'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximal velocity per cell (higher value results in greater timesteps)
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cfl_condition);
	 * CPointer&lt;Float&gt; p_cfl_condition = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cfl_condition'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cfl_condition = new long[]{1996, 2076};

	/**
	 * Field descriptor (offset) for struct member 'timesteps_minimum'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__timesteps_minimum);
	 * CPointer&lt;Integer&gt; p_timesteps_minimum = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'timesteps_minimum'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__timesteps_minimum = new long[]{2000, 2080};

	/**
	 * Field descriptor (offset) for struct member 'timesteps_maximum'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__timesteps_maximum);
	 * CPointer&lt;Integer&gt; p_timesteps_maximum = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'timesteps_maximum'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__timesteps_maximum = new long[]{2004, 2084};

	/**
	 * Field descriptor (offset) for struct member 'slice_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How to slice the volume for viewport rendering<h4>Blender Source Code:</h4>
	 * <p> Display options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__slice_method);
	 * CPointer&lt;Byte&gt; p_slice_method = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slice_method'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slice_method = new long[]{2008, 2088};

	/**
	 * Field descriptor (offset) for struct member 'axis_slice_method'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__axis_slice_method);
	 * CPointer&lt;Byte&gt; p_axis_slice_method = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'axis_slice_method'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__axis_slice_method = new long[]{2009, 2089};

	/**
	 * Field descriptor (offset) for struct member 'slice_axis'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__slice_axis);
	 * CPointer&lt;Byte&gt; p_slice_axis = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slice_axis'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slice_axis = new long[]{2010, 2090};

	/**
	 * Field descriptor (offset) for struct member 'draw_velocity'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__draw_velocity);
	 * CPointer&lt;Byte&gt; p_draw_velocity = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'draw_velocity'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__draw_velocity = new long[]{2011, 2091};

	/**
	 * Field descriptor (offset) for struct member 'slice_per_voxel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How many slices per voxel should be generated
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__slice_per_voxel);
	 * CPointer&lt;Float&gt; p_slice_per_voxel = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slice_per_voxel'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slice_per_voxel = new long[]{2012, 2092};

	/**
	 * Field descriptor (offset) for struct member 'slice_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Position of the slice
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__slice_depth);
	 * CPointer&lt;Float&gt; p_slice_depth = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'slice_depth'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__slice_depth = new long[]{2016, 2096};

	/**
	 * Field descriptor (offset) for struct member 'display_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Thickness of smoke drawing in the viewport
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__display_thickness);
	 * CPointer&lt;Float&gt; p_display_thickness = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'display_thickness'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__display_thickness = new long[]{2020, 2100};

	/**
	 * Field descriptor (offset) for struct member 'coba'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__coba);
	 * CPointer&lt;CPointer&lt;ColorBand&gt;&gt; p_coba = p.cast(new Class[]{CPointer.class, ColorBand.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coba'</li>
	 * <li>Signature: 'ColorBand*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coba = new long[]{2024, 2104};

	/**
	 * Field descriptor (offset) for struct member 'vector_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier for scaling the vectors
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__vector_scale);
	 * CPointer&lt;Float&gt; p_vector_scale = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vector_scale'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vector_scale = new long[]{2028, 2112};

	/**
	 * Field descriptor (offset) for struct member 'vector_draw_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__vector_draw_type);
	 * CPointer&lt;Byte&gt; p_vector_draw_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vector_draw_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vector_draw_type = new long[]{2032, 2116};

	/**
	 * Field descriptor (offset) for struct member 'use_coba'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__use_coba);
	 * CPointer&lt;Byte&gt; p_use_coba = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'use_coba'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__use_coba = new long[]{2033, 2117};

	/**
	 * Field descriptor (offset) for struct member 'coba_field'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Simulation field to color map<h4>Blender Source Code:</h4>
	 * <p> Simulation field used for the color mapping. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__coba_field);
	 * CPointer&lt;Byte&gt; p_coba_field = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'coba_field'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__coba_field = new long[]{2034, 2118};

	/**
	 * Field descriptor (offset) for struct member 'interp_method'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__interp_method);
	 * CPointer&lt;Byte&gt; p_interp_method = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'interp_method'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__interp_method = new long[]{2035, 2119};

	/**
	 * Field descriptor (offset) for struct member 'viewsettings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><ndash/>  Deprecated / unsed options (below). <ndash/>  View options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__viewsettings);
	 * CPointer&lt;Integer&gt; p_viewsettings = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viewsettings'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viewsettings = new long[]{2036, 2120};

	/**
	 * Field descriptor (offset) for struct member '_pad9'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD___pad9);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad9 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad9'</li>
	 * <li>Signature: 'char[4]'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad9 = new long[]{2040, 2124};

	/**
	 * Field descriptor (offset) for struct member 'openvdb_comp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> OpenVDB cache options. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__openvdb_comp);
	 * CPointer&lt;Integer&gt; p_openvdb_comp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'openvdb_comp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__openvdb_comp = new long[]{2044, 2128};

	/**
	 * Field descriptor (offset) for struct member 'clipping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Value under which voxels are considered empty space to optimize caching and rendering
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__clipping);
	 * CPointer&lt;Float&gt; p_clipping = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clipping'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clipping = new long[]{2048, 2132};

	/**
	 * Field descriptor (offset) for struct member 'data_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Bit depth for writing all scalar (including vector) lower values reduce file size
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__data_depth);
	 * CPointer&lt;Byte&gt; p_data_depth = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'data_depth'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__data_depth = new long[]{2052, 2136};

	/**
	 * Field descriptor (offset) for struct member '_pad10'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD___pad10);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad10 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad10'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad10 = new long[]{2053, 2137};

	/**
	 * Field descriptor (offset) for struct member 'point_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Pointcache options. Smoke uses only one cache from now on (index [0]), but keeping the array for now for reading old files. Definition is in {@link DNA_object_force_types.h} . </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__point_cache);
	 * CPointer&lt;CArrayFacade&lt;CPointer&lt;PointCache&gt;&gt;&gt; p_point_cache = p.cast(new Class[]{CArrayFacade.class, CPointer.class, PointCache.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'point_cache'</li>
	 * <li>Signature: 'PointCache*[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__point_cache = new long[]{2060, 2144};

	/**
	 * Field descriptor (offset) for struct member 'ptcaches'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__ptcaches);
	 * CPointer&lt;CArrayFacade&lt;ListBase&gt;&gt; p_ptcaches = p.cast(new Class[]{CArrayFacade.class, ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ptcaches'</li>
	 * <li>Signature: 'ListBase[2]'</li>
	 * <li>Actual Size (32bit/64bit): 16/32</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ptcaches = new long[]{2068, 2160};

	/**
	 * Field descriptor (offset) for struct member 'cache_comp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cache_comp);
	 * CPointer&lt;Integer&gt; p_cache_comp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_comp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_comp = new long[]{2084, 2192};

	/**
	 * Field descriptor (offset) for struct member 'cache_high_comp'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cache_high_comp);
	 * CPointer&lt;Integer&gt; p_cache_high_comp = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_high_comp'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_high_comp = new long[]{2088, 2196};

	/**
	 * Field descriptor (offset) for struct member 'cache_file_format'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD__cache_file_format);
	 * CPointer&lt;Byte&gt; p_cache_file_format = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache_file_format'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache_file_format = new long[]{2092, 2200};

	/**
	 * Field descriptor (offset) for struct member '_pad11'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidDomainSettings fluiddomainsettings = ...;
	 * CPointer&lt;Object&gt; p = fluiddomainsettings.__dna__addressof(FluidDomainSettings.__DNA__FIELD___pad11);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p__pad11 = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad11'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad11 = new long[]{2093, 2201};

	public FluidDomainSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FluidDomainSettings(FluidDomainSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'mmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><ndash/>  Runtime-only fields (from here on). <ndash/>  For fast RNA access. </p>
	 * @see #__DNA__FIELD__mmd
	 */
	
	public CPointer<FluidModifierData> getMmd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FluidModifierData.class};
		return new CPointer<FluidModifierData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FluidModifierData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mmd'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><ndash/>  Runtime-only fields (from here on). <ndash/>  For fast RNA access. </p>
	 * @see #__DNA__FIELD__mmd
	 */
	
	public void setMmd(CPointer<FluidModifierData> mmd) throws IOException
	{
		long __address = ((mmd == null) ? 0 : mmd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'fluid'.
	 * @see #__DNA__FIELD__fluid
	 */
	
	public CPointer<Object> getFluid() throws IOException
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
	 * Set method for struct member 'fluid'.
	 * @see #__DNA__FIELD__fluid
	 */
	
	public void setFluid(CPointer<Object> fluid) throws IOException
	{
		long __address = ((fluid == null) ? 0 : fluid.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'fluid_old'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Adaptive domain needs access to old fluid state. </p>
	 * @see #__DNA__FIELD__fluid_old
	 */
	
	public CPointer<Object> getFluid_old() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'fluid_old'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Adaptive domain needs access to old fluid state. </p>
	 * @see #__DNA__FIELD__fluid_old
	 */
	
	public void setFluid_old(CPointer<Object> fluid_old) throws IOException
	{
		long __address = ((fluid_old == null) ? 0 : fluid_old.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'fluid_mutex'.
	 * @see #__DNA__FIELD__fluid_mutex
	 */
	
	public CPointer<Object> getFluid_mutex() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'fluid_mutex'.
	 * @see #__DNA__FIELD__fluid_mutex
	 */
	
	public void setFluid_mutex(CPointer<Object> fluid_mutex) throws IOException
	{
		long __address = ((fluid_mutex == null) ? 0 : fluid_mutex.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'fluid_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit fluid objects to this collection
	 * @see #__DNA__FIELD__fluid_group
	 */
	
	public CPointer<Collection> getFluid_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'fluid_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit fluid objects to this collection
	 * @see #__DNA__FIELD__fluid_group
	 */
	
	public void setFluid_group(CPointer<Collection> fluid_group) throws IOException
	{
		long __address = ((fluid_group == null) ? 0 : fluid_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'force_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> UNUSED </p>
	 * @see #__DNA__FIELD__force_group
	 */
	
	public CPointer<Collection> getForce_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'force_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> UNUSED </p>
	 * @see #__DNA__FIELD__force_group
	 */
	
	public void setForce_group(CPointer<Collection> force_group) throws IOException
	{
		long __address = ((force_group == null) ? 0 : force_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Get method for struct member 'effector_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit effectors to this collection<h4>Blender Source Code:</h4>
	 * <p> Effector objects group. </p>
	 * @see #__DNA__FIELD__effector_group
	 */
	
	public CPointer<Collection> getEffector_group() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Collection.class};
		return new CPointer<Collection>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Collection.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'effector_group'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Limit effectors to this collection<h4>Blender Source Code:</h4>
	 * <p> Effector objects group. </p>
	 * @see #__DNA__FIELD__effector_group
	 */
	
	public void setEffector_group(CPointer<Collection> effector_group) throws IOException
	{
		long __address = ((effector_group == null) ? 0 : effector_group.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 48, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'tex'.
	 * @see #__DNA__FIELD__tex
	 */
	
	public CPointer<Object> getTex() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 28);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex'.
	 * @see #__DNA__FIELD__tex
	 */
	
	public void setTex(CPointer<Object> tex) throws IOException
	{
		long __address = ((tex == null) ? 0 : tex.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 56, __address);
		} else {
			__io__block.writeLong(__io__address + 28, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_wt'.
	 * @see #__DNA__FIELD__tex_wt
	 */
	
	public CPointer<Object> getTex_wt() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_wt'.
	 * @see #__DNA__FIELD__tex_wt
	 */
	
	public void setTex_wt(CPointer<Object> tex_wt) throws IOException
	{
		long __address = ((tex_wt == null) ? 0 : tex_wt.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 32, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_shadow'.
	 * @see #__DNA__FIELD__tex_shadow
	 */
	
	public CPointer<Object> getTex_shadow() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 36);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_shadow'.
	 * @see #__DNA__FIELD__tex_shadow
	 */
	
	public void setTex_shadow(CPointer<Object> tex_shadow) throws IOException
	{
		long __address = ((tex_shadow == null) ? 0 : tex_shadow.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 72, __address);
		} else {
			__io__block.writeLong(__io__address + 36, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_flame'.
	 * @see #__DNA__FIELD__tex_flame
	 */
	
	public CPointer<Object> getTex_flame() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 80);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_flame'.
	 * @see #__DNA__FIELD__tex_flame
	 */
	
	public void setTex_flame(CPointer<Object> tex_flame) throws IOException
	{
		long __address = ((tex_flame == null) ? 0 : tex_flame.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 80, __address);
		} else {
			__io__block.writeLong(__io__address + 40, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_flame_coba'.
	 * @see #__DNA__FIELD__tex_flame_coba
	 */
	
	public CPointer<Object> getTex_flame_coba() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 44);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_flame_coba'.
	 * @see #__DNA__FIELD__tex_flame_coba
	 */
	
	public void setTex_flame_coba(CPointer<Object> tex_flame_coba) throws IOException
	{
		long __address = ((tex_flame_coba == null) ? 0 : tex_flame_coba.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 44, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_coba'.
	 * @see #__DNA__FIELD__tex_coba
	 */
	
	public CPointer<Object> getTex_coba() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 48);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_coba'.
	 * @see #__DNA__FIELD__tex_coba
	 */
	
	public void setTex_coba(CPointer<Object> tex_coba) throws IOException
	{
		long __address = ((tex_coba == null) ? 0 : tex_coba.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 48, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_field'.
	 * @see #__DNA__FIELD__tex_field
	 */
	
	public CPointer<Object> getTex_field() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 52);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_field'.
	 * @see #__DNA__FIELD__tex_field
	 */
	
	public void setTex_field(CPointer<Object> tex_field) throws IOException
	{
		long __address = ((tex_field == null) ? 0 : tex_field.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 52, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_velocity_x'.
	 * @see #__DNA__FIELD__tex_velocity_x
	 */
	
	public CPointer<Object> getTex_velocity_x() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_velocity_x'.
	 * @see #__DNA__FIELD__tex_velocity_x
	 */
	
	public void setTex_velocity_x(CPointer<Object> tex_velocity_x) throws IOException
	{
		long __address = ((tex_velocity_x == null) ? 0 : tex_velocity_x.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 56, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_velocity_y'.
	 * @see #__DNA__FIELD__tex_velocity_y
	 */
	
	public CPointer<Object> getTex_velocity_y() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 60);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_velocity_y'.
	 * @see #__DNA__FIELD__tex_velocity_y
	 */
	
	public void setTex_velocity_y(CPointer<Object> tex_velocity_y) throws IOException
	{
		long __address = ((tex_velocity_y == null) ? 0 : tex_velocity_y.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 60, __address);
		}
	}

	/**
	 * Get method for struct member 'tex_velocity_z'.
	 * @see #__DNA__FIELD__tex_velocity_z
	 */
	
	public CPointer<Object> getTex_velocity_z() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tex_velocity_z'.
	 * @see #__DNA__FIELD__tex_velocity_z
	 */
	
	public void setTex_velocity_z(CPointer<Object> tex_velocity_z) throws IOException
	{
		long __address = ((tex_velocity_z == null) ? 0 : tex_velocity_z.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 64, __address);
		}
	}

	/**
	 * Get method for struct member 'guiding_parent'.
	 * @see #__DNA__FIELD__guiding_parent
	 */
	
	public CPointer<BlenderObject> getGuiding_parent() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 68);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'guiding_parent'.
	 * @see #__DNA__FIELD__guiding_parent
	 */
	
	public void setGuiding_parent(CPointer<BlenderObject> guiding_parent) throws IOException
	{
		long __address = ((guiding_parent == null) ? 0 : guiding_parent.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 68, __address);
		}
	}

	/**
	 * Get method for struct member 'mesh_velocities'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex velocities of simulated fluid mesh. </p>
	 * @see #__DNA__FIELD__mesh_velocities
	 */
	
	public CPointer<FluidDomainVertexVelocity> getMesh_velocities() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FluidDomainVertexVelocity.class};
		return new CPointer<FluidDomainVertexVelocity>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FluidDomainVertexVelocity.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'mesh_velocities'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Vertex velocities of simulated fluid mesh. </p>
	 * @see #__DNA__FIELD__mesh_velocities
	 */
	
	public void setMesh_velocities(CPointer<FluidDomainVertexVelocity> mesh_velocities) throws IOException
	{
		long __address = ((mesh_velocities == null) ? 0 : mesh_velocities.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 72, __address);
		}
	}

	/**
	 * Get method for struct member 'effector_weights'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__effector_weights
	 */
	
	public CPointer<EffectorWeights> getEffector_weights() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 76);
		}
		Class<?>[] __dna__targetTypes = new Class[]{EffectorWeights.class};
		return new CPointer<EffectorWeights>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, EffectorWeights.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'effector_weights'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)
	 * @see #__DNA__FIELD__effector_weights
	 */
	
	public void setEffector_weights(CPointer<EffectorWeights> effector_weights) throws IOException
	{
		long __address = ((effector_weights == null) ? 0 : effector_weights.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 76, __address);
		}
	}

	/**
	 * Get method for struct member 'p0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain object data. Start point of BB in local space (includes sub-cell shift for adaptive domain). </p>
	 * @see #__DNA__FIELD__p0
	 */
	
	public CArrayFacade<Float> getP0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 80, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'p0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain object data. Start point of BB in local space (includes sub-cell shift for adaptive domain). </p>
	 * @see #__DNA__FIELD__p0
	 */
	
	public void setP0(CArrayFacade<Float> p0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 160;
		} else {
			__dna__offset = 80;
		}
		if (__io__equals(p0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, p0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, p0);
		} else {
			__io__generic__copy( getP0(), p0);
		}
	}

	/**
	 * Get method for struct member 'p1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End point of BB in local space. </p>
	 * @see #__DNA__FIELD__p1
	 */
	
	public CArrayFacade<Float> getP1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 172, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 92, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'p1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> End point of BB in local space. </p>
	 * @see #__DNA__FIELD__p1
	 */
	
	public void setP1(CArrayFacade<Float> p1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 172;
		} else {
			__dna__offset = 92;
		}
		if (__io__equals(p1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, p1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, p1);
		} else {
			__io__generic__copy( getP1(), p1);
		}
	}

	/**
	 * Get method for struct member 'dp0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Difference from object center to grid start point. </p>
	 * @see #__DNA__FIELD__dp0
	 */
	
	public CArrayFacade<Float> getDp0() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 184, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 104, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'dp0'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Difference from object center to grid start point. </p>
	 * @see #__DNA__FIELD__dp0
	 */
	
	public void setDp0(CArrayFacade<Float> dp0) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 184;
		} else {
			__dna__offset = 104;
		}
		if (__io__equals(dp0, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, dp0)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, dp0);
		} else {
			__io__generic__copy( getDp0(), dp0);
		}
	}

	/**
	 * Get method for struct member 'cell_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Cell Size<h4>Blender Source Code:</h4>
	 * <p> Size of simulation cell in local space. </p>
	 * @see #__DNA__FIELD__cell_size
	 */
	
	public CArrayFacade<Float> getCell_size() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 196, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 116, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cell_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)    Cell Size<h4>Blender Source Code:</h4>
	 * <p> Size of simulation cell in local space. </p>
	 * @see #__DNA__FIELD__cell_size
	 */
	
	public void setCell_size(CArrayFacade<Float> cell_size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 196;
		} else {
			__dna__offset = 116;
		}
		if (__io__equals(cell_size, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cell_size)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cell_size);
		} else {
			__io__generic__copy( getCell_size(), cell_size);
		}
	}

	/**
	 * Get method for struct member 'global_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Global size of domain axises. </p>
	 * @see #__DNA__FIELD__global_size
	 */
	
	public CArrayFacade<Float> getGlobal_size() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 208, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 128, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'global_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Global size of domain axises. </p>
	 * @see #__DNA__FIELD__global_size
	 */
	
	public void setGlobal_size(CArrayFacade<Float> global_size) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 208;
		} else {
			__dna__offset = 128;
		}
		if (__io__equals(global_size, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, global_size)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, global_size);
		} else {
			__io__generic__copy( getGlobal_size(), global_size);
		}
	}

	/**
	 * Get method for struct member 'prev_loc'.
	 * @see #__DNA__FIELD__prev_loc
	 */
	
	public CArrayFacade<Float> getPrev_loc() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 220, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'prev_loc'.
	 * @see #__DNA__FIELD__prev_loc
	 */
	
	public void setPrev_loc(CArrayFacade<Float> prev_loc) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 220;
		} else {
			__dna__offset = 140;
		}
		if (__io__equals(prev_loc, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, prev_loc)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, prev_loc);
		} else {
			__io__generic__copy( getPrev_loc(), prev_loc);
		}
	}

	/**
	 * Get method for struct member 'shift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current domain shift in simulation cells. </p>
	 * @see #__DNA__FIELD__shift
	 */
	
	public CArrayFacade<Integer> getShift() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 232, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 152, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shift'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Current domain shift in simulation cells. </p>
	 * @see #__DNA__FIELD__shift
	 */
	
	public void setShift(CArrayFacade<Integer> shift) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 232;
		} else {
			__dna__offset = 152;
		}
		if (__io__equals(shift, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, shift)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, shift);
		} else {
			__io__generic__copy( getShift(), shift);
		}
	}

	/**
	 * Get method for struct member 'shift_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Exact domain shift. </p>
	 * @see #__DNA__FIELD__shift_f
	 */
	
	public CArrayFacade<Float> getShift_f() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 244, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 164, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'shift_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Exact domain shift. </p>
	 * @see #__DNA__FIELD__shift_f
	 */
	
	public void setShift_f(CArrayFacade<Float> shift_f) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 244;
		} else {
			__dna__offset = 164;
		}
		if (__io__equals(shift_f, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, shift_f)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, shift_f);
		} else {
			__io__generic__copy( getShift_f(), shift_f);
		}
	}

	/**
	 * Get method for struct member 'obj_shift_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How much object has shifted since previous smoke frame (used to "lock" domain while drawing). </p>
	 * @see #__DNA__FIELD__obj_shift_f
	 */
	
	public CArrayFacade<Float> getObj_shift_f() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 256, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'obj_shift_f'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How much object has shifted since previous smoke frame (used to "lock" domain while drawing). </p>
	 * @see #__DNA__FIELD__obj_shift_f
	 */
	
	public void setObj_shift_f(CArrayFacade<Float> obj_shift_f) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 256;
		} else {
			__dna__offset = 176;
		}
		if (__io__equals(obj_shift_f, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, obj_shift_f)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, obj_shift_f);
		} else {
			__io__generic__copy( getObj_shift_f(), obj_shift_f);
		}
	}

	/**
	 * Get method for struct member 'imat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain object imat. </p>
	 * @see #__DNA__FIELD__imat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getImat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 268, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 188, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'imat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain object imat. </p>
	 * @see #__DNA__FIELD__imat
	 */
	
	public void setImat(CArrayFacade<CArrayFacade<Float>> imat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 268;
		} else {
			__dna__offset = 188;
		}
		if (__io__equals(imat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, imat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, imat);
		} else {
			__io__generic__copy( getImat(), imat);
		}
	}

	/**
	 * Get method for struct member 'obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain obmat. </p>
	 * @see #__DNA__FIELD__obmat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getObmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 332, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 252, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'obmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Domain obmat. </p>
	 * @see #__DNA__FIELD__obmat
	 */
	
	public void setObmat(CArrayFacade<CArrayFacade<Float>> obmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 332;
		} else {
			__dna__offset = 252;
		}
		if (__io__equals(obmat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, obmat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, obmat);
		} else {
			__io__generic__copy( getObmat(), obmat);
		}
	}

	/**
	 * Get method for struct member 'fluidmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Low res fluid matrix. </p>
	 * @see #__DNA__FIELD__fluidmat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getFluidmat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 396, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 316, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fluidmat'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Low res fluid matrix. </p>
	 * @see #__DNA__FIELD__fluidmat
	 */
	
	public void setFluidmat(CArrayFacade<CArrayFacade<Float>> fluidmat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 396;
		} else {
			__dna__offset = 316;
		}
		if (__io__equals(fluidmat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, fluidmat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, fluidmat);
		} else {
			__io__generic__copy( getFluidmat(), fluidmat);
		}
	}

	/**
	 * Get method for struct member 'fluidmat_wt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> High res fluid matrix. </p>
	 * @see #__DNA__FIELD__fluidmat_wt
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getFluidmat_wt() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 460, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 380, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'fluidmat_wt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> High res fluid matrix. </p>
	 * @see #__DNA__FIELD__fluidmat_wt
	 */
	
	public void setFluidmat_wt(CArrayFacade<CArrayFacade<Float>> fluidmat_wt) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 460;
		} else {
			__dna__offset = 380;
		}
		if (__io__equals(fluidmat_wt, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, fluidmat_wt)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, fluidmat_wt);
		} else {
			__io__generic__copy( getFluidmat_wt(), fluidmat_wt);
		}
	}

	/**
	 * Get method for struct member 'base_res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Initial "non-adapted" resolution. </p>
	 * @see #__DNA__FIELD__base_res
	 */
	
	public CArrayFacade<Integer> getBase_res() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 524, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 444, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'base_res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Initial "non-adapted" resolution. </p>
	 * @see #__DNA__FIELD__base_res
	 */
	
	public void setBase_res(CArrayFacade<Integer> base_res) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 524;
		} else {
			__dna__offset = 444;
		}
		if (__io__equals(base_res, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, base_res)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, base_res);
		} else {
			__io__generic__copy( getBase_res(), base_res);
		}
	}

	/**
	 * Get method for struct member 'res_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cell min. </p>
	 * @see #__DNA__FIELD__res_min
	 */
	
	public CArrayFacade<Integer> getRes_min() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 536, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 456, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'res_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cell min. </p>
	 * @see #__DNA__FIELD__res_min
	 */
	
	public void setRes_min(CArrayFacade<Integer> res_min) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 536;
		} else {
			__dna__offset = 456;
		}
		if (__io__equals(res_min, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, res_min)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, res_min);
		} else {
			__io__generic__copy( getRes_min(), res_min);
		}
	}

	/**
	 * Get method for struct member 'res_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cell max. </p>
	 * @see #__DNA__FIELD__res_max
	 */
	
	public CArrayFacade<Integer> getRes_max() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 548, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 468, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'res_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Cell max. </p>
	 * @see #__DNA__FIELD__res_max
	 */
	
	public void setRes_max(CArrayFacade<Integer> res_max) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 548;
		} else {
			__dna__offset = 468;
		}
		if (__io__equals(res_max, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, res_max)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, res_max);
		} else {
			__io__generic__copy( getRes_max(), res_max);
		}
	}

	/**
	 * Get method for struct member 'res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Data resolution (res_max-res_min). </p>
	 * @see #__DNA__FIELD__res
	 */
	
	public CArrayFacade<Integer> getRes() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 560, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 480, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Data resolution (res_max-res_min). </p>
	 * @see #__DNA__FIELD__res
	 */
	
	public void setRes(CArrayFacade<Integer> res) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 560;
		} else {
			__dna__offset = 480;
		}
		if (__io__equals(res, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, res)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, res);
		} else {
			__io__generic__copy( getRes(), res);
		}
	}

	/**
	 * Get method for struct member 'total_cells'.
	 * @see #__DNA__FIELD__total_cells
	 */
	
	public int getTotal_cells() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 572);
		} else {
			return __io__block.readInt(__io__address + 492);
		}
	}

	/**
	 * Set method for struct member 'total_cells'.
	 * @see #__DNA__FIELD__total_cells
	 */
	
	public void setTotal_cells(int total_cells) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 572, total_cells);
		} else {
			__io__block.writeInt(__io__address + 492, total_cells);
		}
	}

	/**
	 * Get method for struct member 'dx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1.0f / res. </p>
	 * @see #__DNA__FIELD__dx
	 */
	
	public float getDx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 576);
		} else {
			return __io__block.readFloat(__io__address + 496);
		}
	}

	/**
	 * Set method for struct member 'dx'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> 1.0f / res. </p>
	 * @see #__DNA__FIELD__dx
	 */
	
	public void setDx(float dx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 576, dx);
		} else {
			__io__block.writeFloat(__io__address + 496, dx);
		}
	}

	/**
	 * Get method for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Largest domain size. </p>
	 * @see #__DNA__FIELD__scale
	 */
	
	public float getScale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 580);
		} else {
			return __io__block.readFloat(__io__address + 500);
		}
	}

	/**
	 * Set method for struct member 'scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Largest domain size. </p>
	 * @see #__DNA__FIELD__scale
	 */
	
	public void setScale(float scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 580, scale);
		} else {
			__io__block.writeFloat(__io__address + 500, scale);
		}
	}

	/**
	 * Get method for struct member 'boundary_width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Usually this is just 1. </p>
	 * @see #__DNA__FIELD__boundary_width
	 */
	
	public int getBoundary_width() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 584);
		} else {
			return __io__block.readInt(__io__address + 504);
		}
	}

	/**
	 * Set method for struct member 'boundary_width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Usually this is just 1. </p>
	 * @see #__DNA__FIELD__boundary_width
	 */
	
	public void setBoundary_width(int boundary_width) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 584, boundary_width);
		} else {
			__io__block.writeInt(__io__address + 504, boundary_width);
		}
	}

	/**
	 * Get method for struct member 'adapt_margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Margin added around fluid to minimize boundary interference<h4>Blender Source Code:</h4>
	 * <p><ndash/>  User-accesible fields (from here on). <ndash/>  Adaptive domain options. </p>
	 * @see #__DNA__FIELD__adapt_margin
	 */
	
	public int getAdapt_margin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 588);
		} else {
			return __io__block.readInt(__io__address + 508);
		}
	}

	/**
	 * Set method for struct member 'adapt_margin'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Margin added around fluid to minimize boundary interference<h4>Blender Source Code:</h4>
	 * <p><ndash/>  User-accesible fields (from here on). <ndash/>  Adaptive domain options. </p>
	 * @see #__DNA__FIELD__adapt_margin
	 */
	
	public void setAdapt_margin(int adapt_margin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 588, adapt_margin);
		} else {
			__io__block.writeInt(__io__address + 508, adapt_margin);
		}
	}

	/**
	 * Get method for struct member 'adapt_res'.
	 * @see #__DNA__FIELD__adapt_res
	 */
	
	public int getAdapt_res() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 592);
		} else {
			return __io__block.readInt(__io__address + 512);
		}
	}

	/**
	 * Set method for struct member 'adapt_res'.
	 * @see #__DNA__FIELD__adapt_res
	 */
	
	public void setAdapt_res(int adapt_res) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 592, adapt_res);
		} else {
			__io__block.writeInt(__io__address + 512, adapt_res);
		}
	}

	/**
	 * Get method for struct member 'adapt_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum amount of fluid cell can contain before it is considered empty
	 * @see #__DNA__FIELD__adapt_threshold
	 */
	
	public float getAdapt_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 596);
		} else {
			return __io__block.readFloat(__io__address + 516);
		}
	}

	/**
	 * Set method for struct member 'adapt_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum amount of fluid cell can contain before it is considered empty
	 * @see #__DNA__FIELD__adapt_threshold
	 */
	
	public void setAdapt_threshold(float adapt_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 596, adapt_threshold);
		} else {
			__io__block.writeFloat(__io__address + 516, adapt_threshold);
		}
	}

	/**
	 * Get method for struct member '_pad1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad1
	 */
	
	public CArrayFacade<Byte> get_pad1() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 600, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 520, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad1'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad1
	 */
	
	public void set_pad1(CArrayFacade<Byte> _pad1) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 600;
		} else {
			__dna__offset = 520;
		}
		if (__io__equals(_pad1, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad1)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad1);
		} else {
			__io__generic__copy( get_pad1(), _pad1);
		}
	}

	/**
	 * Get method for struct member 'maxres'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Fluid domain options Longest axis on the BB gets this resolution assigned. </p>
	 * @see #__DNA__FIELD__maxres
	 */
	
	public int getMaxres() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 604);
		} else {
			return __io__block.readInt(__io__address + 524);
		}
	}

	/**
	 * Set method for struct member 'maxres'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Fluid domain options Longest axis on the BB gets this resolution assigned. </p>
	 * @see #__DNA__FIELD__maxres
	 */
	
	public void setMaxres(int maxres) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 604, maxres);
		} else {
			__io__block.writeInt(__io__address + 524, maxres);
		}
	}

	/**
	 * Get method for struct member 'solver_res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dimension of manta solver, 2d or 3d. </p>
	 * @see #__DNA__FIELD__solver_res
	 */
	
	public int getSolver_res() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 608);
		} else {
			return __io__block.readInt(__io__address + 528);
		}
	}

	/**
	 * Set method for struct member 'solver_res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Dimension of manta solver, 2d or 3d. </p>
	 * @see #__DNA__FIELD__solver_res
	 */
	
	public void setSolver_res(int solver_res) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 608, solver_res);
		} else {
			__io__block.writeInt(__io__address + 528, solver_res);
		}
	}

	/**
	 * Get method for struct member 'border_collisions'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How domain border collisions are handled. </p>
	 * @see #__DNA__FIELD__border_collisions
	 */
	
	public int getBorder_collisions() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 612);
		} else {
			return __io__block.readInt(__io__address + 532);
		}
	}

	/**
	 * Set method for struct member 'border_collisions'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> How domain border collisions are handled. </p>
	 * @see #__DNA__FIELD__border_collisions
	 */
	
	public void setBorder_collisions(int border_collisions) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 612, border_collisions);
		} else {
			__io__block.writeInt(__io__address + 532, border_collisions);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Use-mesh, use-noise, etc. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 616);
		} else {
			return __io__block.readInt(__io__address + 536);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Use-mesh, use-noise, etc. </p>
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 616, flags);
		} else {
			__io__block.writeInt(__io__address + 536, flags);
		}
	}

	/**
	 * Get method for struct member 'gravity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Gravity in X, Y and Z direction
	 * @see #__DNA__FIELD__gravity
	 */
	
	public CArrayFacade<Float> getGravity() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 620, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 540, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gravity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Gravity in X, Y and Z direction
	 * @see #__DNA__FIELD__gravity
	 */
	
	public void setGravity(CArrayFacade<Float> gravity) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 620;
		} else {
			__dna__offset = 540;
		}
		if (__io__equals(gravity, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gravity)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gravity);
		} else {
			__io__generic__copy( getGravity(), gravity);
		}
	}

	/**
	 * Get method for struct member 'active_fields'.
	 * @see #__DNA__FIELD__active_fields
	 */
	
	public int getActive_fields() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 632);
		} else {
			return __io__block.readInt(__io__address + 552);
		}
	}

	/**
	 * Set method for struct member 'active_fields'.
	 * @see #__DNA__FIELD__active_fields
	 */
	
	public void setActive_fields(int active_fields) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 632, active_fields);
		} else {
			__io__block.writeInt(__io__address + 552, active_fields);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gas, liquid. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 636);
		} else {
			return __io__block.readShort(__io__address + 556);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Gas, liquid. </p>
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 636, type);
		} else {
			__io__block.writeShort(__io__address + 556, type);
		}
	}

	/**
	 * Get method for struct member '_pad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad2
	 */
	
	public CArrayFacade<Byte> get_pad2() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 638, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 558, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad2'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad2
	 */
	
	public void set_pad2(CArrayFacade<Byte> _pad2) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 638;
		} else {
			__dna__offset = 558;
		}
		if (__io__equals(_pad2, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad2)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad2);
		} else {
			__io__generic__copy( get_pad2(), _pad2);
		}
	}

	/**
	 * Get method for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Buoyant force based on smoke density (higher value results in faster rising smoke)<h4>Blender Source Code:</h4>
	 * <p> Smoke domain options. </p>
	 * @see #__DNA__FIELD__alpha
	 */
	
	public float getAlpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 644);
		} else {
			return __io__block.readFloat(__io__address + 564);
		}
	}

	/**
	 * Set method for struct member 'alpha'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Buoyant force based on smoke density (higher value results in faster rising smoke)<h4>Blender Source Code:</h4>
	 * <p> Smoke domain options. </p>
	 * @see #__DNA__FIELD__alpha
	 */
	
	public void setAlpha(float alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 644, alpha);
		} else {
			__io__block.writeFloat(__io__address + 564, alpha);
		}
	}

	/**
	 * Get method for struct member 'beta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Buoyant force based on smoke heat (higher value results in faster rising smoke)
	 * @see #__DNA__FIELD__beta
	 */
	
	public float getBeta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 648);
		} else {
			return __io__block.readFloat(__io__address + 568);
		}
	}

	/**
	 * Set method for struct member 'beta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Buoyant force based on smoke heat (higher value results in faster rising smoke)
	 * @see #__DNA__FIELD__beta
	 */
	
	public void setBeta(float beta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 648, beta);
		} else {
			__io__block.writeFloat(__io__address + 568, beta);
		}
	}

	/**
	 * Get method for struct member 'diss_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In frames. </p>
	 * @see #__DNA__FIELD__diss_speed
	 */
	
	public int getDiss_speed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 652);
		} else {
			return __io__block.readInt(__io__address + 572);
		}
	}

	/**
	 * Set method for struct member 'diss_speed'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> In frames. </p>
	 * @see #__DNA__FIELD__diss_speed
	 */
	
	public void setDiss_speed(int diss_speed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 652, diss_speed);
		} else {
			__io__block.writeInt(__io__address + 572, diss_speed);
		}
	}

	/**
	 * Get method for struct member 'vorticity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of turbulence and rotation in smoke
	 * @see #__DNA__FIELD__vorticity
	 */
	
	public float getVorticity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 656);
		} else {
			return __io__block.readFloat(__io__address + 576);
		}
	}

	/**
	 * Set method for struct member 'vorticity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of turbulence and rotation in smoke
	 * @see #__DNA__FIELD__vorticity
	 */
	
	public void setVorticity(float vorticity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 656, vorticity);
		} else {
			__io__block.writeFloat(__io__address + 576, vorticity);
		}
	}

	/**
	 * Get method for struct member 'active_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Monitor smoke color. </p>
	 * @see #__DNA__FIELD__active_color
	 */
	
	public CArrayFacade<Float> getActive_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 660, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 580, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'active_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Monitor smoke color. </p>
	 * @see #__DNA__FIELD__active_color
	 */
	
	public void setActive_color(CArrayFacade<Float> active_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 660;
		} else {
			__dna__offset = 580;
		}
		if (__io__equals(active_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, active_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, active_color);
		} else {
			__io__generic__copy( getActive_color(), active_color);
		}
	}

	/**
	 * Get method for struct member 'highres_sampling'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method for sampling the high resolution flow
	 * @see #__DNA__FIELD__highres_sampling
	 */
	
	public int getHighres_sampling() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 672);
		} else {
			return __io__block.readInt(__io__address + 592);
		}
	}

	/**
	 * Set method for struct member 'highres_sampling'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Method for sampling the high resolution flow
	 * @see #__DNA__FIELD__highres_sampling
	 */
	
	public void setHighres_sampling(int highres_sampling) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 672, highres_sampling);
		} else {
			__io__block.writeInt(__io__address + 592, highres_sampling);
		}
	}

	/**
	 * Get method for struct member 'burning_rate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed of the burning reaction (higher value results in smaller flames)<h4>Blender Source Code:</h4>
	 * <p> Flame options. </p>
	 * @see #__DNA__FIELD__burning_rate
	 */
	
	public float getBurning_rate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 676);
		} else {
			return __io__block.readFloat(__io__address + 596);
		}
	}

	/**
	 * Set method for struct member 'burning_rate'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Speed of the burning reaction (higher value results in smaller flames)<h4>Blender Source Code:</h4>
	 * <p> Flame options. </p>
	 * @see #__DNA__FIELD__burning_rate
	 */
	
	public void setBurning_rate(float burning_rate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 676, burning_rate);
		} else {
			__io__block.writeFloat(__io__address + 596, burning_rate);
		}
	}

	/**
	 * Get method for struct member 'flame_smoke'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of smoke created by burning fuel
	 * @see #__DNA__FIELD__flame_smoke
	 */
	
	public float getFlame_smoke() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 680);
		} else {
			return __io__block.readFloat(__io__address + 600);
		}
	}

	/**
	 * Set method for struct member 'flame_smoke'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of smoke created by burning fuel
	 * @see #__DNA__FIELD__flame_smoke
	 */
	
	public void setFlame_smoke(float flame_smoke) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 680, flame_smoke);
		} else {
			__io__block.writeFloat(__io__address + 600, flame_smoke);
		}
	}

	/**
	 * Get method for struct member 'flame_vorticity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Additional vorticity for the flames
	 * @see #__DNA__FIELD__flame_vorticity
	 */
	
	public float getFlame_vorticity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 684);
		} else {
			return __io__block.readFloat(__io__address + 604);
		}
	}

	/**
	 * Set method for struct member 'flame_vorticity'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Additional vorticity for the flames
	 * @see #__DNA__FIELD__flame_vorticity
	 */
	
	public void setFlame_vorticity(float flame_vorticity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 684, flame_vorticity);
		} else {
			__io__block.writeFloat(__io__address + 604, flame_vorticity);
		}
	}

	/**
	 * Get method for struct member 'flame_ignition'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum temperature of the flames (higher value results in faster rising flames)
	 * @see #__DNA__FIELD__flame_ignition
	 */
	
	public float getFlame_ignition() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 688);
		} else {
			return __io__block.readFloat(__io__address + 608);
		}
	}

	/**
	 * Set method for struct member 'flame_ignition'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Minimum temperature of the flames (higher value results in faster rising flames)
	 * @see #__DNA__FIELD__flame_ignition
	 */
	
	public void setFlame_ignition(float flame_ignition) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 688, flame_ignition);
		} else {
			__io__block.writeFloat(__io__address + 608, flame_ignition);
		}
	}

	/**
	 * Get method for struct member 'flame_max_temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum temperature of the flames (higher value results in faster rising flames)
	 * @see #__DNA__FIELD__flame_max_temp
	 */
	
	public float getFlame_max_temp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 692);
		} else {
			return __io__block.readFloat(__io__address + 612);
		}
	}

	/**
	 * Set method for struct member 'flame_max_temp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum temperature of the flames (higher value results in faster rising flames)
	 * @see #__DNA__FIELD__flame_max_temp
	 */
	
	public void setFlame_max_temp(float flame_max_temp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 692, flame_max_temp);
		} else {
			__io__block.writeFloat(__io__address + 612, flame_max_temp);
		}
	}

	/**
	 * Get method for struct member 'flame_smoke_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color of smoke emitted from burning fuel
	 * @see #__DNA__FIELD__flame_smoke_color
	 */
	
	public CArrayFacade<Float> getFlame_smoke_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 696, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 616, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'flame_smoke_color'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Color of smoke emitted from burning fuel
	 * @see #__DNA__FIELD__flame_smoke_color
	 */
	
	public void setFlame_smoke_color(CArrayFacade<Float> flame_smoke_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 696;
		} else {
			__dna__offset = 616;
		}
		if (__io__equals(flame_smoke_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, flame_smoke_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, flame_smoke_color);
		} else {
			__io__generic__copy( getFlame_smoke_color(), flame_smoke_color);
		}
	}

	/**
	 * Get method for struct member 'noise_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Strength of noise<h4>Blender Source Code:</h4>
	 * <p> Noise options. </p>
	 * @see #__DNA__FIELD__noise_strength
	 */
	
	public float getNoise_strength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 708);
		} else {
			return __io__block.readFloat(__io__address + 628);
		}
	}

	/**
	 * Set method for struct member 'noise_strength'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Strength of noise<h4>Blender Source Code:</h4>
	 * <p> Noise options. </p>
	 * @see #__DNA__FIELD__noise_strength
	 */
	
	public void setNoise_strength(float noise_strength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 708, noise_strength);
		} else {
			__io__block.writeFloat(__io__address + 628, noise_strength);
		}
	}

	/**
	 * Get method for struct member 'noise_pos_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale of noise (higher value results in larger vortices)
	 * @see #__DNA__FIELD__noise_pos_scale
	 */
	
	public float getNoise_pos_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 712);
		} else {
			return __io__block.readFloat(__io__address + 632);
		}
	}

	/**
	 * Set method for struct member 'noise_pos_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Scale of noise (higher value results in larger vortices)
	 * @see #__DNA__FIELD__noise_pos_scale
	 */
	
	public void setNoise_pos_scale(float noise_pos_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 712, noise_pos_scale);
		} else {
			__io__block.writeFloat(__io__address + 632, noise_pos_scale);
		}
	}

	/**
	 * Get method for struct member 'noise_time_anim'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Animation time of noise
	 * @see #__DNA__FIELD__noise_time_anim
	 */
	
	public float getNoise_time_anim() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 716);
		} else {
			return __io__block.readFloat(__io__address + 636);
		}
	}

	/**
	 * Set method for struct member 'noise_time_anim'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Animation time of noise
	 * @see #__DNA__FIELD__noise_time_anim
	 */
	
	public void setNoise_time_anim(float noise_time_anim) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 716, noise_time_anim);
		} else {
			__io__block.writeFloat(__io__address + 636, noise_time_anim);
		}
	}

	/**
	 * Get method for struct member 'res_noise'.
	 * @see #__DNA__FIELD__res_noise
	 */
	
	public CArrayFacade<Integer> getRes_noise() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 720, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 640, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'res_noise'.
	 * @see #__DNA__FIELD__res_noise
	 */
	
	public void setRes_noise(CArrayFacade<Integer> res_noise) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 720;
		} else {
			__dna__offset = 640;
		}
		if (__io__equals(res_noise, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, res_noise)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, res_noise);
		} else {
			__io__generic__copy( getRes_noise(), res_noise);
		}
	}

	/**
	 * Get method for struct member 'noise_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The noise simulation is scaled up by this factor (compared to the base resolution of the domain)
	 * @see #__DNA__FIELD__noise_scale
	 */
	
	public int getNoise_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 732);
		} else {
			return __io__block.readInt(__io__address + 652);
		}
	}

	/**
	 * Set method for struct member 'noise_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The noise simulation is scaled up by this factor (compared to the base resolution of the domain)
	 * @see #__DNA__FIELD__noise_scale
	 */
	
	public void setNoise_scale(int noise_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 732, noise_scale);
		} else {
			__io__block.writeInt(__io__address + 652, noise_scale);
		}
	}

	/**
	 * Get method for struct member 'noise_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Noise method which is used during the high-res simulation<h4>Blender Source Code:</h4>
	 * <p> Noise type: wave, curl, anisotropic. </p>
	 * @see #__DNA__FIELD__noise_type
	 */
	
	public short getNoise_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 736);
		} else {
			return __io__block.readShort(__io__address + 656);
		}
	}

	/**
	 * Set method for struct member 'noise_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Noise method which is used during the high-res simulation<h4>Blender Source Code:</h4>
	 * <p> Noise type: wave, curl, anisotropic. </p>
	 * @see #__DNA__FIELD__noise_type
	 */
	
	public void setNoise_type(short noise_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 736, noise_type);
		} else {
			__io__block.writeShort(__io__address + 656, noise_type);
		}
	}

	/**
	 * Get method for struct member '_pad3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad3
	 */
	
	public CArrayFacade<Byte> get_pad3() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 738, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 658, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad3'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad3
	 */
	
	public void set_pad3(CArrayFacade<Byte> _pad3) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 738;
		} else {
			__dna__offset = 658;
		}
		if (__io__equals(_pad3, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad3)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad3);
		} else {
			__io__generic__copy( get_pad3(), _pad3);
		}
	}

	/**
	 * Get method for struct member 'particle_randomness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Randomness factor for particle sampling<h4>Blender Source Code:</h4>
	 * <p> Liquid domain options. </p>
	 * @see #__DNA__FIELD__particle_randomness
	 */
	
	public float getParticle_randomness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 740);
		} else {
			return __io__block.readFloat(__io__address + 660);
		}
	}

	/**
	 * Set method for struct member 'particle_randomness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Randomness factor for particle sampling<h4>Blender Source Code:</h4>
	 * <p> Liquid domain options. </p>
	 * @see #__DNA__FIELD__particle_randomness
	 */
	
	public void setParticle_randomness(float particle_randomness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 740, particle_randomness);
		} else {
			__io__block.writeFloat(__io__address + 660, particle_randomness);
		}
	}

	/**
	 * Get method for struct member 'particle_number'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle number factor (higher value results in more particles)
	 * @see #__DNA__FIELD__particle_number
	 */
	
	public int getParticle_number() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 744);
		} else {
			return __io__block.readInt(__io__address + 664);
		}
	}

	/**
	 * Set method for struct member 'particle_number'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle number factor (higher value results in more particles)
	 * @see #__DNA__FIELD__particle_number
	 */
	
	public void setParticle_number(int particle_number) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 744, particle_number);
		} else {
			__io__block.writeInt(__io__address + 664, particle_number);
		}
	}

	/**
	 * Get method for struct member 'particle_minimum'.
	 * @see #__DNA__FIELD__particle_minimum
	 */
	
	public int getParticle_minimum() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 748);
		} else {
			return __io__block.readInt(__io__address + 668);
		}
	}

	/**
	 * Set method for struct member 'particle_minimum'.
	 * @see #__DNA__FIELD__particle_minimum
	 */
	
	public void setParticle_minimum(int particle_minimum) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 748, particle_minimum);
		} else {
			__io__block.writeInt(__io__address + 668, particle_minimum);
		}
	}

	/**
	 * Get method for struct member 'particle_maximum'.
	 * @see #__DNA__FIELD__particle_maximum
	 */
	
	public int getParticle_maximum() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 752);
		} else {
			return __io__block.readInt(__io__address + 672);
		}
	}

	/**
	 * Set method for struct member 'particle_maximum'.
	 * @see #__DNA__FIELD__particle_maximum
	 */
	
	public void setParticle_maximum(int particle_maximum) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 752, particle_maximum);
		} else {
			__io__block.writeInt(__io__address + 672, particle_maximum);
		}
	}

	/**
	 * Get method for struct member 'particle_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle radius factor. Increase this value if the simulation appears to leak volume, decrease it if the simulation seems to gain volume
	 * @see #__DNA__FIELD__particle_radius
	 */
	
	public float getParticle_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 756);
		} else {
			return __io__block.readFloat(__io__address + 676);
		}
	}

	/**
	 * Set method for struct member 'particle_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle radius factor. Increase this value if the simulation appears to leak volume, decrease it if the simulation seems to gain volume
	 * @see #__DNA__FIELD__particle_radius
	 */
	
	public void setParticle_radius(float particle_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 756, particle_radius);
		} else {
			__io__block.writeFloat(__io__address + 676, particle_radius);
		}
	}

	/**
	 * Get method for struct member 'particle_band_width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle (narrow) band width (higher value results in thicker band and more particles)
	 * @see #__DNA__FIELD__particle_band_width
	 */
	
	public float getParticle_band_width() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 760);
		} else {
			return __io__block.readFloat(__io__address + 680);
		}
	}

	/**
	 * Set method for struct member 'particle_band_width'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle (narrow) band width (higher value results in thicker band and more particles)
	 * @see #__DNA__FIELD__particle_band_width
	 */
	
	public void setParticle_band_width(float particle_band_width) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 760, particle_band_width);
		} else {
			__io__block.writeFloat(__io__address + 680, particle_band_width);
		}
	}

	/**
	 * Get method for struct member 'fractions_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Determines how much fluid is allowed in an obstacle cell (higher values will tag a boundary cell as an obstacle easier and reduce the boundary smoothening effect)
	 * @see #__DNA__FIELD__fractions_threshold
	 */
	
	public float getFractions_threshold() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 764);
		} else {
			return __io__block.readFloat(__io__address + 684);
		}
	}

	/**
	 * Set method for struct member 'fractions_threshold'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Determines how much fluid is allowed in an obstacle cell (higher values will tag a boundary cell as an obstacle easier and reduce the boundary smoothening effect)
	 * @see #__DNA__FIELD__fractions_threshold
	 */
	
	public void setFractions_threshold(float fractions_threshold) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 764, fractions_threshold);
		} else {
			__io__block.writeFloat(__io__address + 684, fractions_threshold);
		}
	}

	/**
	 * Get method for struct member 'flip_ratio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * PIC/FLIP Ratio. A value of 1.0 will result in a completely FLIP based simulation. Use a lower value for simulations which should produce smaller splashes
	 * @see #__DNA__FIELD__flip_ratio
	 */
	
	public float getFlip_ratio() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 768);
		} else {
			return __io__block.readFloat(__io__address + 688);
		}
	}

	/**
	 * Set method for struct member 'flip_ratio'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * PIC/FLIP Ratio. A value of 1.0 will result in a completely FLIP based simulation. Use a lower value for simulations which should produce smaller splashes
	 * @see #__DNA__FIELD__flip_ratio
	 */
	
	public void setFlip_ratio(float flip_ratio) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 768, flip_ratio);
		} else {
			__io__block.writeFloat(__io__address + 688, flip_ratio);
		}
	}

	/**
	 * Get method for struct member 'simulation_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Change the underlying simulation method
	 * @see #__DNA__FIELD__simulation_method
	 */
	
	public short getSimulation_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 772);
		} else {
			return __io__block.readShort(__io__address + 692);
		}
	}

	/**
	 * Set method for struct member 'simulation_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Change the underlying simulation method
	 * @see #__DNA__FIELD__simulation_method
	 */
	
	public void setSimulation_method(short simulation_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 772, simulation_method);
		} else {
			__io__block.writeShort(__io__address + 692, simulation_method);
		}
	}

	/**
	 * Get method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public CArrayFacade<Byte> get_pad4() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 774, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 694, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad4'.
	 * @see #__DNA__FIELD___pad4
	 */
	
	public void set_pad4(CArrayFacade<Byte> _pad4) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 774;
		} else {
			__dna__offset = 694;
		}
		if (__io__equals(_pad4, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad4)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad4);
		} else {
			__io__generic__copy( get_pad4(), _pad4);
		}
	}

	/**
	 * Get method for struct member 'surface_tension'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Surface tension of liquid (higher value results in greater hydrophobic behaviour)<h4>Blender Source Code:</h4>
	 * <p> Diffusion options. </p>
	 * @see #__DNA__FIELD__surface_tension
	 */
	
	public float getSurface_tension() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 780);
		} else {
			return __io__block.readFloat(__io__address + 700);
		}
	}

	/**
	 * Set method for struct member 'surface_tension'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Surface tension of liquid (higher value results in greater hydrophobic behaviour)<h4>Blender Source Code:</h4>
	 * <p> Diffusion options. </p>
	 * @see #__DNA__FIELD__surface_tension
	 */
	
	public void setSurface_tension(float surface_tension) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 780, surface_tension);
		} else {
			__io__block.writeFloat(__io__address + 700, surface_tension);
		}
	}

	/**
	 * Get method for struct member 'viscosity_base'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Viscosity setting: value that is multiplied by 10 to the power of (exponent*-1)
	 * @see #__DNA__FIELD__viscosity_base
	 */
	
	public float getViscosity_base() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 784);
		} else {
			return __io__block.readFloat(__io__address + 704);
		}
	}

	/**
	 * Set method for struct member 'viscosity_base'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Viscosity setting: value that is multiplied by 10 to the power of (exponent*-1)
	 * @see #__DNA__FIELD__viscosity_base
	 */
	
	public void setViscosity_base(float viscosity_base) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 784, viscosity_base);
		} else {
			__io__block.writeFloat(__io__address + 704, viscosity_base);
		}
	}

	/**
	 * Get method for struct member 'viscosity_exponent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Negative exponent for the viscosity value (to simplify entering small values e.g. 5*10^-6)
	 * @see #__DNA__FIELD__viscosity_exponent
	 */
	
	public int getViscosity_exponent() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 788);
		} else {
			return __io__block.readInt(__io__address + 708);
		}
	}

	/**
	 * Set method for struct member 'viscosity_exponent'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Negative exponent for the viscosity value (to simplify entering small values e.g. 5*10^-6)
	 * @see #__DNA__FIELD__viscosity_exponent
	 */
	
	public void setViscosity_exponent(int viscosity_exponent) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 788, viscosity_exponent);
		} else {
			__io__block.writeInt(__io__address + 708, viscosity_exponent);
		}
	}

	/**
	 * Get method for struct member 'domain_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Domain size in meters (longest domain side)
	 * @see #__DNA__FIELD__domain_size
	 */
	
	public float getDomain_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 792);
		} else {
			return __io__block.readFloat(__io__address + 712);
		}
	}

	/**
	 * Set method for struct member 'domain_size'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Domain size in meters (longest domain side)
	 * @see #__DNA__FIELD__domain_size
	 */
	
	public void setDomain_size(float domain_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 792, domain_size);
		} else {
			__io__block.writeFloat(__io__address + 712, domain_size);
		}
	}

	/**
	 * Get method for struct member 'mesh_concave_upper'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper mesh concavity bound (high values tend to smoothen and fill out concave regions)<h4>Blender Source Code:</h4>
	 * <p>{@link Mesh}  options. </p>
	 * @see #__DNA__FIELD__mesh_concave_upper
	 */
	
	public float getMesh_concave_upper() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 796);
		} else {
			return __io__block.readFloat(__io__address + 716);
		}
	}

	/**
	 * Set method for struct member 'mesh_concave_upper'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper mesh concavity bound (high values tend to smoothen and fill out concave regions)<h4>Blender Source Code:</h4>
	 * <p>{@link Mesh}  options. </p>
	 * @see #__DNA__FIELD__mesh_concave_upper
	 */
	
	public void setMesh_concave_upper(float mesh_concave_upper) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 796, mesh_concave_upper);
		} else {
			__io__block.writeFloat(__io__address + 716, mesh_concave_upper);
		}
	}

	/**
	 * Get method for struct member 'mesh_concave_lower'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower mesh concavity bound (high values tend to smoothen and fill out concave regions)
	 * @see #__DNA__FIELD__mesh_concave_lower
	 */
	
	public float getMesh_concave_lower() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 800);
		} else {
			return __io__block.readFloat(__io__address + 720);
		}
	}

	/**
	 * Set method for struct member 'mesh_concave_lower'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower mesh concavity bound (high values tend to smoothen and fill out concave regions)
	 * @see #__DNA__FIELD__mesh_concave_lower
	 */
	
	public void setMesh_concave_lower(float mesh_concave_lower) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 800, mesh_concave_lower);
		} else {
			__io__block.writeFloat(__io__address + 720, mesh_concave_lower);
		}
	}

	/**
	 * Get method for struct member 'mesh_particle_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle radius factor (higher value results in larger (meshed) particles). Needs to be adjusted after changing the mesh scale
	 * @see #__DNA__FIELD__mesh_particle_radius
	 */
	
	public float getMesh_particle_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 804);
		} else {
			return __io__block.readFloat(__io__address + 724);
		}
	}

	/**
	 * Set method for struct member 'mesh_particle_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Particle radius factor (higher value results in larger (meshed) particles). Needs to be adjusted after changing the mesh scale
	 * @see #__DNA__FIELD__mesh_particle_radius
	 */
	
	public void setMesh_particle_radius(float mesh_particle_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 804, mesh_particle_radius);
		} else {
			__io__block.writeFloat(__io__address + 724, mesh_particle_radius);
		}
	}

	/**
	 * Get method for struct member 'mesh_smoothen_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Positive mesh smoothening
	 * @see #__DNA__FIELD__mesh_smoothen_pos
	 */
	
	public int getMesh_smoothen_pos() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 808);
		} else {
			return __io__block.readInt(__io__address + 728);
		}
	}

	/**
	 * Set method for struct member 'mesh_smoothen_pos'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Positive mesh smoothening
	 * @see #__DNA__FIELD__mesh_smoothen_pos
	 */
	
	public void setMesh_smoothen_pos(int mesh_smoothen_pos) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 808, mesh_smoothen_pos);
		} else {
			__io__block.writeInt(__io__address + 728, mesh_smoothen_pos);
		}
	}

	/**
	 * Get method for struct member 'mesh_smoothen_neg'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Negative mesh smoothening
	 * @see #__DNA__FIELD__mesh_smoothen_neg
	 */
	
	public int getMesh_smoothen_neg() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 812);
		} else {
			return __io__block.readInt(__io__address + 732);
		}
	}

	/**
	 * Set method for struct member 'mesh_smoothen_neg'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Negative mesh smoothening
	 * @see #__DNA__FIELD__mesh_smoothen_neg
	 */
	
	public void setMesh_smoothen_neg(int mesh_smoothen_neg) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 812, mesh_smoothen_neg);
		} else {
			__io__block.writeInt(__io__address + 732, mesh_smoothen_neg);
		}
	}

	/**
	 * Get method for struct member 'mesh_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The mesh simulation is scaled up by this factor (compared to the base resolution of the domain). For best meshing, it is recommended to adjust the mesh particle radius alongside this value
	 * @see #__DNA__FIELD__mesh_scale
	 */
	
	public int getMesh_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 816);
		} else {
			return __io__block.readInt(__io__address + 736);
		}
	}

	/**
	 * Set method for struct member 'mesh_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The mesh simulation is scaled up by this factor (compared to the base resolution of the domain). For best meshing, it is recommended to adjust the mesh particle radius alongside this value
	 * @see #__DNA__FIELD__mesh_scale
	 */
	
	public void setMesh_scale(int mesh_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 816, mesh_scale);
		} else {
			__io__block.writeInt(__io__address + 736, mesh_scale);
		}
	}

	/**
	 * Get method for struct member 'totvert'.
	 * @see #__DNA__FIELD__totvert
	 */
	
	public int getTotvert() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 820);
		} else {
			return __io__block.readInt(__io__address + 740);
		}
	}

	/**
	 * Set method for struct member 'totvert'.
	 * @see #__DNA__FIELD__totvert
	 */
	
	public void setTotvert(int totvert) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 820, totvert);
		} else {
			__io__block.writeInt(__io__address + 740, totvert);
		}
	}

	/**
	 * Get method for struct member 'mesh_generator'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Which particle levelset generator to use
	 * @see #__DNA__FIELD__mesh_generator
	 */
	
	public short getMesh_generator() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 824);
		} else {
			return __io__block.readShort(__io__address + 744);
		}
	}

	/**
	 * Set method for struct member 'mesh_generator'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Which particle levelset generator to use
	 * @see #__DNA__FIELD__mesh_generator
	 */
	
	public void setMesh_generator(short mesh_generator) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 824, mesh_generator);
		} else {
			__io__block.writeShort(__io__address + 744, mesh_generator);
		}
	}

	/**
	 * Get method for struct member '_pad5'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad5
	 */
	
	public CArrayFacade<Byte> get_pad5() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 826, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 746, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad5'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad5
	 */
	
	public void set_pad5(CArrayFacade<Byte> _pad5) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 826;
		} else {
			__dna__offset = 746;
		}
		if (__io__equals(_pad5, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad5)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad5);
		} else {
			__io__generic__copy( get_pad5(), _pad5);
		}
	}

	/**
	 * Get method for struct member 'particle_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Secondary particle options. </p>
	 * @see #__DNA__FIELD__particle_type
	 */
	
	public int getParticle_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 828);
		} else {
			return __io__block.readInt(__io__address + 748);
		}
	}

	/**
	 * Set method for struct member 'particle_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Secondary particle options. </p>
	 * @see #__DNA__FIELD__particle_type
	 */
	
	public void setParticle_type(int particle_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 828, particle_type);
		} else {
			__io__block.writeInt(__io__address + 748, particle_type);
		}
	}

	/**
	 * Get method for struct member 'particle_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The particle simulation is scaled up by this factor (compared to the base resolution of the domain)
	 * @see #__DNA__FIELD__particle_scale
	 */
	
	public int getParticle_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 832);
		} else {
			return __io__block.readInt(__io__address + 752);
		}
	}

	/**
	 * Set method for struct member 'particle_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * The particle simulation is scaled up by this factor (compared to the base resolution of the domain)
	 * @see #__DNA__FIELD__particle_scale
	 */
	
	public void setParticle_scale(int particle_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 832, particle_scale);
		} else {
			__io__block.writeInt(__io__address + 752, particle_scale);
		}
	}

	/**
	 * Get method for struct member 'sndparticle_tau_min_wc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower clamping threshold for marking fluid cells as wave crests (lower value results in more marked cells)
	 * @see #__DNA__FIELD__sndparticle_tau_min_wc
	 */
	
	public float getSndparticle_tau_min_wc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 836);
		} else {
			return __io__block.readFloat(__io__address + 756);
		}
	}

	/**
	 * Set method for struct member 'sndparticle_tau_min_wc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower clamping threshold for marking fluid cells as wave crests (lower value results in more marked cells)
	 * @see #__DNA__FIELD__sndparticle_tau_min_wc
	 */
	
	public void setSndparticle_tau_min_wc(float sndparticle_tau_min_wc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 836, sndparticle_tau_min_wc);
		} else {
			__io__block.writeFloat(__io__address + 756, sndparticle_tau_min_wc);
		}
	}

	/**
	 * Get method for struct member 'sndparticle_tau_max_wc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper clamping threshold for marking fluid cells as wave crests (higher value results in less marked cells)
	 * @see #__DNA__FIELD__sndparticle_tau_max_wc
	 */
	
	public float getSndparticle_tau_max_wc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 840);
		} else {
			return __io__block.readFloat(__io__address + 760);
		}
	}

	/**
	 * Set method for struct member 'sndparticle_tau_max_wc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper clamping threshold for marking fluid cells as wave crests (higher value results in less marked cells)
	 * @see #__DNA__FIELD__sndparticle_tau_max_wc
	 */
	
	public void setSndparticle_tau_max_wc(float sndparticle_tau_max_wc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 840, sndparticle_tau_max_wc);
		} else {
			__io__block.writeFloat(__io__address + 760, sndparticle_tau_max_wc);
		}
	}

	/**
	 * Get method for struct member 'sndparticle_tau_min_ta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower clamping threshold for marking fluid cells where air is trapped (lower value results in more marked cells)
	 * @see #__DNA__FIELD__sndparticle_tau_min_ta
	 */
	
	public float getSndparticle_tau_min_ta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 844);
		} else {
			return __io__block.readFloat(__io__address + 764);
		}
	}

	/**
	 * Set method for struct member 'sndparticle_tau_min_ta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower clamping threshold for marking fluid cells where air is trapped (lower value results in more marked cells)
	 * @see #__DNA__FIELD__sndparticle_tau_min_ta
	 */
	
	public void setSndparticle_tau_min_ta(float sndparticle_tau_min_ta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 844, sndparticle_tau_min_ta);
		} else {
			__io__block.writeFloat(__io__address + 764, sndparticle_tau_min_ta);
		}
	}

	/**
	 * Get method for struct member 'sndparticle_tau_max_ta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper clamping threshold for marking fluid cells where air is trapped (highe value results in less marked cells)
	 * @see #__DNA__FIELD__sndparticle_tau_max_ta
	 */
	
	public float getSndparticle_tau_max_ta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 848);
		} else {
			return __io__block.readFloat(__io__address + 768);
		}
	}

	/**
	 * Set method for struct member 'sndparticle_tau_max_ta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper clamping threshold for marking fluid cells where air is trapped (highe value results in less marked cells)
	 * @see #__DNA__FIELD__sndparticle_tau_max_ta
	 */
	
	public void setSndparticle_tau_max_ta(float sndparticle_tau_max_ta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 848, sndparticle_tau_max_ta);
		} else {
			__io__block.writeFloat(__io__address + 768, sndparticle_tau_max_ta);
		}
	}

	/**
	 * Get method for struct member 'sndparticle_tau_min_k'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower clamping threshold that indicates the fluid speed where cells start to emit particles (lower values result in generally more particles)
	 * @see #__DNA__FIELD__sndparticle_tau_min_k
	 */
	
	public float getSndparticle_tau_min_k() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 852);
		} else {
			return __io__block.readFloat(__io__address + 772);
		}
	}

	/**
	 * Set method for struct member 'sndparticle_tau_min_k'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lower clamping threshold that indicates the fluid speed where cells start to emit particles (lower values result in generally more particles)
	 * @see #__DNA__FIELD__sndparticle_tau_min_k
	 */
	
	public void setSndparticle_tau_min_k(float sndparticle_tau_min_k) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 852, sndparticle_tau_min_k);
		} else {
			__io__block.writeFloat(__io__address + 772, sndparticle_tau_min_k);
		}
	}

	/**
	 * Get method for struct member 'sndparticle_tau_max_k'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper clamping threshold that indicates the fluid speed where cells no longer emit more particles (higher value results in generally less particles)
	 * @see #__DNA__FIELD__sndparticle_tau_max_k
	 */
	
	public float getSndparticle_tau_max_k() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 856);
		} else {
			return __io__block.readFloat(__io__address + 776);
		}
	}

	/**
	 * Set method for struct member 'sndparticle_tau_max_k'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Upper clamping threshold that indicates the fluid speed where cells no longer emit more particles (higher value results in generally less particles)
	 * @see #__DNA__FIELD__sndparticle_tau_max_k
	 */
	
	public void setSndparticle_tau_max_k(float sndparticle_tau_max_k) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 856, sndparticle_tau_max_k);
		} else {
			__io__block.writeFloat(__io__address + 776, sndparticle_tau_max_k);
		}
	}

	/**
	 * Get method for struct member 'sndparticle_k_wc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum number of particles generated per wave crest cell per frame
	 * @see #__DNA__FIELD__sndparticle_k_wc
	 */
	
	public int getSndparticle_k_wc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 860);
		} else {
			return __io__block.readInt(__io__address + 780);
		}
	}

	/**
	 * Set method for struct member 'sndparticle_k_wc'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum number of particles generated per wave crest cell per frame
	 * @see #__DNA__FIELD__sndparticle_k_wc
	 */
	
	public void setSndparticle_k_wc(int sndparticle_k_wc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 860, sndparticle_k_wc);
		} else {
			__io__block.writeInt(__io__address + 780, sndparticle_k_wc);
		}
	}

	/**
	 * Get method for struct member 'sndparticle_k_ta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum number of particles generated per trapped air cell per frame
	 * @see #__DNA__FIELD__sndparticle_k_ta
	 */
	
	public int getSndparticle_k_ta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 864);
		} else {
			return __io__block.readInt(__io__address + 784);
		}
	}

	/**
	 * Set method for struct member 'sndparticle_k_ta'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximum number of particles generated per trapped air cell per frame
	 * @see #__DNA__FIELD__sndparticle_k_ta
	 */
	
	public void setSndparticle_k_ta(int sndparticle_k_ta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 864, sndparticle_k_ta);
		} else {
			__io__block.writeInt(__io__address + 784, sndparticle_k_ta);
		}
	}

	/**
	 * Get method for struct member 'sndparticle_k_b'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of buoyancy force that rises bubbles (high value results in bubble movement mainly upwards)
	 * @see #__DNA__FIELD__sndparticle_k_b
	 */
	
	public float getSndparticle_k_b() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 868);
		} else {
			return __io__block.readFloat(__io__address + 788);
		}
	}

	/**
	 * Set method for struct member 'sndparticle_k_b'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of buoyancy force that rises bubbles (high value results in bubble movement mainly upwards)
	 * @see #__DNA__FIELD__sndparticle_k_b
	 */
	
	public void setSndparticle_k_b(float sndparticle_k_b) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 868, sndparticle_k_b);
		} else {
			__io__block.writeFloat(__io__address + 788, sndparticle_k_b);
		}
	}

	/**
	 * Get method for struct member 'sndparticle_k_d'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of drag force that moves bubbles along with the fluid (high value results in bubble movement mainly along with the fluid)
	 * @see #__DNA__FIELD__sndparticle_k_d
	 */
	
	public float getSndparticle_k_d() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 872);
		} else {
			return __io__block.readFloat(__io__address + 792);
		}
	}

	/**
	 * Set method for struct member 'sndparticle_k_d'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Amount of drag force that moves bubbles along with the fluid (high value results in bubble movement mainly along with the fluid)
	 * @see #__DNA__FIELD__sndparticle_k_d
	 */
	
	public void setSndparticle_k_d(float sndparticle_k_d) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 872, sndparticle_k_d);
		} else {
			__io__block.writeFloat(__io__address + 792, sndparticle_k_d);
		}
	}

	/**
	 * Get method for struct member 'sndparticle_l_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lowest possible particle lifetime
	 * @see #__DNA__FIELD__sndparticle_l_min
	 */
	
	public float getSndparticle_l_min() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 876);
		} else {
			return __io__block.readFloat(__io__address + 796);
		}
	}

	/**
	 * Set method for struct member 'sndparticle_l_min'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Lowest possible particle lifetime
	 * @see #__DNA__FIELD__sndparticle_l_min
	 */
	
	public void setSndparticle_l_min(float sndparticle_l_min) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 876, sndparticle_l_min);
		} else {
			__io__block.writeFloat(__io__address + 796, sndparticle_l_min);
		}
	}

	/**
	 * Get method for struct member 'sndparticle_l_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Highest possible particle lifetime
	 * @see #__DNA__FIELD__sndparticle_l_max
	 */
	
	public float getSndparticle_l_max() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 880);
		} else {
			return __io__block.readFloat(__io__address + 800);
		}
	}

	/**
	 * Set method for struct member 'sndparticle_l_max'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Highest possible particle lifetime
	 * @see #__DNA__FIELD__sndparticle_l_max
	 */
	
	public void setSndparticle_l_max(float sndparticle_l_max) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 880, sndparticle_l_max);
		} else {
			__io__block.writeFloat(__io__address + 800, sndparticle_l_max);
		}
	}

	/**
	 * Get method for struct member 'sndparticle_potential_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius to compute potential for each cell (higher values are slower but create smoother potential grids)
	 * @see #__DNA__FIELD__sndparticle_potential_radius
	 */
	
	public int getSndparticle_potential_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 884);
		} else {
			return __io__block.readInt(__io__address + 804);
		}
	}

	/**
	 * Set method for struct member 'sndparticle_potential_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius to compute potential for each cell (higher values are slower but create smoother potential grids)
	 * @see #__DNA__FIELD__sndparticle_potential_radius
	 */
	
	public void setSndparticle_potential_radius(int sndparticle_potential_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 884, sndparticle_potential_radius);
		} else {
			__io__block.writeInt(__io__address + 804, sndparticle_potential_radius);
		}
	}

	/**
	 * Get method for struct member 'sndparticle_update_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius to compute position update for each particle (higher values are slower but particles move less chaotic)
	 * @see #__DNA__FIELD__sndparticle_update_radius
	 */
	
	public int getSndparticle_update_radius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 888);
		} else {
			return __io__block.readInt(__io__address + 808);
		}
	}

	/**
	 * Set method for struct member 'sndparticle_update_radius'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Radius to compute position update for each particle (higher values are slower but particles move less chaotic)
	 * @see #__DNA__FIELD__sndparticle_update_radius
	 */
	
	public void setSndparticle_update_radius(int sndparticle_update_radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 888, sndparticle_update_radius);
		} else {
			__io__block.writeInt(__io__address + 808, sndparticle_update_radius);
		}
	}

	/**
	 * Get method for struct member 'sndparticle_boundary'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How particles that left the domain are treated
	 * @see #__DNA__FIELD__sndparticle_boundary
	 */
	
	public byte getSndparticle_boundary() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 892);
		} else {
			return __io__block.readByte(__io__address + 812);
		}
	}

	/**
	 * Set method for struct member 'sndparticle_boundary'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How particles that left the domain are treated
	 * @see #__DNA__FIELD__sndparticle_boundary
	 */
	
	public void setSndparticle_boundary(byte sndparticle_boundary) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 892, sndparticle_boundary);
		} else {
			__io__block.writeByte(__io__address + 812, sndparticle_boundary);
		}
	}

	/**
	 * Get method for struct member 'sndparticle_combined_export'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Determines which particle systems are created from secondary particles
	 * @see #__DNA__FIELD__sndparticle_combined_export
	 */
	
	public byte getSndparticle_combined_export() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 893);
		} else {
			return __io__block.readByte(__io__address + 813);
		}
	}

	/**
	 * Set method for struct member 'sndparticle_combined_export'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Determines which particle systems are created from secondary particles
	 * @see #__DNA__FIELD__sndparticle_combined_export
	 */
	
	public void setSndparticle_combined_export(byte sndparticle_combined_export) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 893, sndparticle_combined_export);
		} else {
			__io__block.writeByte(__io__address + 813, sndparticle_combined_export);
		}
	}

	/**
	 * Get method for struct member '_pad6'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad6
	 */
	
	public CArrayFacade<Byte> get_pad6() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			6
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 894, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 814, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad6'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad6
	 */
	
	public void set_pad6(CArrayFacade<Byte> _pad6) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 894;
		} else {
			__dna__offset = 814;
		}
		if (__io__equals(_pad6, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad6)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad6);
		} else {
			__io__generic__copy( get_pad6(), _pad6);
		}
	}

	/**
	 * Get method for struct member 'guiding_alpha'.
	 * @see #__DNA__FIELD__guiding_alpha
	 */
	
	public float getGuiding_alpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 900);
		} else {
			return __io__block.readFloat(__io__address + 820);
		}
	}

	/**
	 * Set method for struct member 'guiding_alpha'.
	 * @see #__DNA__FIELD__guiding_alpha
	 */
	
	public void setGuiding_alpha(float guiding_alpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 900, guiding_alpha);
		} else {
			__io__block.writeFloat(__io__address + 820, guiding_alpha);
		}
	}

	/**
	 * Get method for struct member 'guiding_beta'.
	 * @see #__DNA__FIELD__guiding_beta
	 */
	
	public int getGuiding_beta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 904);
		} else {
			return __io__block.readInt(__io__address + 824);
		}
	}

	/**
	 * Set method for struct member 'guiding_beta'.
	 * @see #__DNA__FIELD__guiding_beta
	 */
	
	public void setGuiding_beta(int guiding_beta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 904, guiding_beta);
		} else {
			__io__block.writeInt(__io__address + 824, guiding_beta);
		}
	}

	/**
	 * Get method for struct member 'guiding_vel_factor'.
	 * @see #__DNA__FIELD__guiding_vel_factor
	 */
	
	public float getGuiding_vel_factor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 908);
		} else {
			return __io__block.readFloat(__io__address + 828);
		}
	}

	/**
	 * Set method for struct member 'guiding_vel_factor'.
	 * @see #__DNA__FIELD__guiding_vel_factor
	 */
	
	public void setGuiding_vel_factor(float guiding_vel_factor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 908, guiding_vel_factor);
		} else {
			__io__block.writeFloat(__io__address + 828, guiding_vel_factor);
		}
	}

	/**
	 * Get method for struct member 'guide_res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Res for velocity guide grids - independent from base res. </p>
	 * @see #__DNA__FIELD__guide_res
	 */
	
	public CArrayFacade<Integer> getGuide_res() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Integer>(__io__address + 912, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Integer>(__io__address + 832, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'guide_res'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Res for velocity guide grids - independent from base res. </p>
	 * @see #__DNA__FIELD__guide_res
	 */
	
	public void setGuide_res(CArrayFacade<Integer> guide_res) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 912;
		} else {
			__dna__offset = 832;
		}
		if (__io__equals(guide_res, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, guide_res)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, guide_res);
		} else {
			__io__generic__copy( getGuide_res(), guide_res);
		}
	}

	/**
	 * Get method for struct member 'guiding_source'.
	 * @see #__DNA__FIELD__guiding_source
	 */
	
	public short getGuiding_source() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 924);
		} else {
			return __io__block.readShort(__io__address + 844);
		}
	}

	/**
	 * Set method for struct member 'guiding_source'.
	 * @see #__DNA__FIELD__guiding_source
	 */
	
	public void setGuiding_source(short guiding_source) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 924, guiding_source);
		} else {
			__io__block.writeShort(__io__address + 844, guiding_source);
		}
	}

	/**
	 * Get method for struct member '_pad7'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad7
	 */
	
	public CArrayFacade<Byte> get_pad7() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 926, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 846, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad7'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad7
	 */
	
	public void set_pad7(CArrayFacade<Byte> _pad7) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 926;
		} else {
			__dna__offset = 846;
		}
		if (__io__equals(_pad7, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad7)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad7);
		} else {
			__io__generic__copy( get_pad7(), _pad7);
		}
	}

	/**
	 * Get method for struct member 'cache_frame_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Frame on which the simulation starts<h4>Blender Source Code:</h4>
	 * <p> Cache options. </p>
	 * @see #__DNA__FIELD__cache_frame_start
	 */
	
	public int getCache_frame_start() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 928);
		} else {
			return __io__block.readInt(__io__address + 848);
		}
	}

	/**
	 * Set method for struct member 'cache_frame_start'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Frame on which the simulation starts<h4>Blender Source Code:</h4>
	 * <p> Cache options. </p>
	 * @see #__DNA__FIELD__cache_frame_start
	 */
	
	public void setCache_frame_start(int cache_frame_start) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 928, cache_frame_start);
		} else {
			__io__block.writeInt(__io__address + 848, cache_frame_start);
		}
	}

	/**
	 * Get method for struct member 'cache_frame_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Frame on which the simulation stops
	 * @see #__DNA__FIELD__cache_frame_end
	 */
	
	public int getCache_frame_end() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 932);
		} else {
			return __io__block.readInt(__io__address + 852);
		}
	}

	/**
	 * Set method for struct member 'cache_frame_end'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Frame on which the simulation stops
	 * @see #__DNA__FIELD__cache_frame_end
	 */
	
	public void setCache_frame_end(int cache_frame_end) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 932, cache_frame_end);
		} else {
			__io__block.writeInt(__io__address + 852, cache_frame_end);
		}
	}

	/**
	 * Get method for struct member 'cache_frame_pause_data'.
	 * @see #__DNA__FIELD__cache_frame_pause_data
	 */
	
	public int getCache_frame_pause_data() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 936);
		} else {
			return __io__block.readInt(__io__address + 856);
		}
	}

	/**
	 * Set method for struct member 'cache_frame_pause_data'.
	 * @see #__DNA__FIELD__cache_frame_pause_data
	 */
	
	public void setCache_frame_pause_data(int cache_frame_pause_data) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 936, cache_frame_pause_data);
		} else {
			__io__block.writeInt(__io__address + 856, cache_frame_pause_data);
		}
	}

	/**
	 * Get method for struct member 'cache_frame_pause_noise'.
	 * @see #__DNA__FIELD__cache_frame_pause_noise
	 */
	
	public int getCache_frame_pause_noise() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 940);
		} else {
			return __io__block.readInt(__io__address + 860);
		}
	}

	/**
	 * Set method for struct member 'cache_frame_pause_noise'.
	 * @see #__DNA__FIELD__cache_frame_pause_noise
	 */
	
	public void setCache_frame_pause_noise(int cache_frame_pause_noise) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 940, cache_frame_pause_noise);
		} else {
			__io__block.writeInt(__io__address + 860, cache_frame_pause_noise);
		}
	}

	/**
	 * Get method for struct member 'cache_frame_pause_mesh'.
	 * @see #__DNA__FIELD__cache_frame_pause_mesh
	 */
	
	public int getCache_frame_pause_mesh() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 944);
		} else {
			return __io__block.readInt(__io__address + 864);
		}
	}

	/**
	 * Set method for struct member 'cache_frame_pause_mesh'.
	 * @see #__DNA__FIELD__cache_frame_pause_mesh
	 */
	
	public void setCache_frame_pause_mesh(int cache_frame_pause_mesh) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 944, cache_frame_pause_mesh);
		} else {
			__io__block.writeInt(__io__address + 864, cache_frame_pause_mesh);
		}
	}

	/**
	 * Get method for struct member 'cache_frame_pause_particles'.
	 * @see #__DNA__FIELD__cache_frame_pause_particles
	 */
	
	public int getCache_frame_pause_particles() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 948);
		} else {
			return __io__block.readInt(__io__address + 868);
		}
	}

	/**
	 * Set method for struct member 'cache_frame_pause_particles'.
	 * @see #__DNA__FIELD__cache_frame_pause_particles
	 */
	
	public void setCache_frame_pause_particles(int cache_frame_pause_particles) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 948, cache_frame_pause_particles);
		} else {
			__io__block.writeInt(__io__address + 868, cache_frame_pause_particles);
		}
	}

	/**
	 * Get method for struct member 'cache_frame_pause_guiding'.
	 * @see #__DNA__FIELD__cache_frame_pause_guiding
	 */
	
	public int getCache_frame_pause_guiding() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 952);
		} else {
			return __io__block.readInt(__io__address + 872);
		}
	}

	/**
	 * Set method for struct member 'cache_frame_pause_guiding'.
	 * @see #__DNA__FIELD__cache_frame_pause_guiding
	 */
	
	public void setCache_frame_pause_guiding(int cache_frame_pause_guiding) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 952, cache_frame_pause_guiding);
		} else {
			__io__block.writeInt(__io__address + 872, cache_frame_pause_guiding);
		}
	}

	/**
	 * Get method for struct member 'cache_flag'.
	 * @see #__DNA__FIELD__cache_flag
	 */
	
	public int getCache_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 956);
		} else {
			return __io__block.readInt(__io__address + 876);
		}
	}

	/**
	 * Set method for struct member 'cache_flag'.
	 * @see #__DNA__FIELD__cache_flag
	 */
	
	public void setCache_flag(int cache_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 956, cache_flag);
		} else {
			__io__block.writeInt(__io__address + 876, cache_flag);
		}
	}

	/**
	 * Get method for struct member 'cache_mesh_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the file format to be used for caching surface data
	 * @see #__DNA__FIELD__cache_mesh_format
	 */
	
	public byte getCache_mesh_format() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 960);
		} else {
			return __io__block.readByte(__io__address + 880);
		}
	}

	/**
	 * Set method for struct member 'cache_mesh_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the file format to be used for caching surface data
	 * @see #__DNA__FIELD__cache_mesh_format
	 */
	
	public void setCache_mesh_format(byte cache_mesh_format) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 960, cache_mesh_format);
		} else {
			__io__block.writeByte(__io__address + 880, cache_mesh_format);
		}
	}

	/**
	 * Get method for struct member 'cache_data_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the file format to be used for caching volumetric data
	 * @see #__DNA__FIELD__cache_data_format
	 */
	
	public byte getCache_data_format() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 961);
		} else {
			return __io__block.readByte(__io__address + 881);
		}
	}

	/**
	 * Set method for struct member 'cache_data_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the file format to be used for caching volumetric data
	 * @see #__DNA__FIELD__cache_data_format
	 */
	
	public void setCache_data_format(byte cache_data_format) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 961, cache_data_format);
		} else {
			__io__block.writeByte(__io__address + 881, cache_data_format);
		}
	}

	/**
	 * Get method for struct member 'cache_particle_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the file format to be used for caching particle data
	 * @see #__DNA__FIELD__cache_particle_format
	 */
	
	public byte getCache_particle_format() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 962);
		} else {
			return __io__block.readByte(__io__address + 882);
		}
	}

	/**
	 * Set method for struct member 'cache_particle_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the file format to be used for caching particle data
	 * @see #__DNA__FIELD__cache_particle_format
	 */
	
	public void setCache_particle_format(byte cache_particle_format) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 962, cache_particle_format);
		} else {
			__io__block.writeByte(__io__address + 882, cache_particle_format);
		}
	}

	/**
	 * Get method for struct member 'cache_noise_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the file format to be used for caching noise data
	 * @see #__DNA__FIELD__cache_noise_format
	 */
	
	public byte getCache_noise_format() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 963);
		} else {
			return __io__block.readByte(__io__address + 883);
		}
	}

	/**
	 * Set method for struct member 'cache_noise_format'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Select the file format to be used for caching noise data
	 * @see #__DNA__FIELD__cache_noise_format
	 */
	
	public void setCache_noise_format(byte cache_noise_format) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 963, cache_noise_format);
		} else {
			__io__block.writeByte(__io__address + 883, cache_noise_format);
		}
	}

	/**
	 * Get method for struct member 'cache_directory'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Directory that contains fluid cache files
	 * @see #__DNA__FIELD__cache_directory
	 */
	
	public CArrayFacade<Byte> getCache_directory() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 964, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 884, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cache_directory'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Directory that contains fluid cache files
	 * @see #__DNA__FIELD__cache_directory
	 */
	
	public void setCache_directory(CArrayFacade<Byte> cache_directory) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 964;
		} else {
			__dna__offset = 884;
		}
		if (__io__equals(cache_directory, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cache_directory)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cache_directory);
		} else {
			__io__generic__copy( getCache_directory(), cache_directory);
		}
	}

	/**
	 * Get method for struct member 'error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bake error description. </p>
	 * @see #__DNA__FIELD__error
	 */
	
	public CArrayFacade<Byte> getError() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1988, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1908, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'error'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Bake error description. </p>
	 * @see #__DNA__FIELD__error
	 */
	
	public void setError(CArrayFacade<Byte> error) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1988;
		} else {
			__dna__offset = 1908;
		}
		if (__io__equals(error, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, error)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, error);
		} else {
			__io__generic__copy( getError(), error);
		}
	}

	/**
	 * Get method for struct member 'cache_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Change the cache type of the simulation
	 * @see #__DNA__FIELD__cache_type
	 */
	
	public short getCache_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 2052);
		} else {
			return __io__block.readShort(__io__address + 1972);
		}
	}

	/**
	 * Set method for struct member 'cache_type'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Change the cache type of the simulation
	 * @see #__DNA__FIELD__cache_type
	 */
	
	public void setCache_type(short cache_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 2052, cache_type);
		} else {
			__io__block.writeShort(__io__address + 1972, cache_type);
		}
	}

	/**
	 * Get method for struct member '_pad8'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad8
	 */
	
	public CArrayFacade<Byte> get_pad8() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2054, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1974, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad8'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad8
	 */
	
	public void set_pad8(CArrayFacade<Byte> _pad8) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2054;
		} else {
			__dna__offset = 1974;
		}
		if (__io__equals(_pad8, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad8)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad8);
		} else {
			__io__generic__copy( get_pad8(), _pad8);
		}
	}

	/**
	 * Get method for struct member 'dt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Time options. </p>
	 * @see #__DNA__FIELD__dt
	 */
	
	public float getDt() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2056);
		} else {
			return __io__block.readFloat(__io__address + 1976);
		}
	}

	/**
	 * Set method for struct member 'dt'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Time options. </p>
	 * @see #__DNA__FIELD__dt
	 */
	
	public void setDt(float dt) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2056, dt);
		} else {
			__io__block.writeFloat(__io__address + 1976, dt);
		}
	}

	/**
	 * Get method for struct member 'time_total'.
	 * @see #__DNA__FIELD__time_total
	 */
	
	public float getTime_total() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2060);
		} else {
			return __io__block.readFloat(__io__address + 1980);
		}
	}

	/**
	 * Set method for struct member 'time_total'.
	 * @see #__DNA__FIELD__time_total
	 */
	
	public void setTime_total(float time_total) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2060, time_total);
		} else {
			__io__block.writeFloat(__io__address + 1980, time_total);
		}
	}

	/**
	 * Get method for struct member 'time_per_frame'.
	 * @see #__DNA__FIELD__time_per_frame
	 */
	
	public float getTime_per_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2064);
		} else {
			return __io__block.readFloat(__io__address + 1984);
		}
	}

	/**
	 * Set method for struct member 'time_per_frame'.
	 * @see #__DNA__FIELD__time_per_frame
	 */
	
	public void setTime_per_frame(float time_per_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2064, time_per_frame);
		} else {
			__io__block.writeFloat(__io__address + 1984, time_per_frame);
		}
	}

	/**
	 * Get method for struct member 'frame_length'.
	 * @see #__DNA__FIELD__frame_length
	 */
	
	public float getFrame_length() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2068);
		} else {
			return __io__block.readFloat(__io__address + 1988);
		}
	}

	/**
	 * Set method for struct member 'frame_length'.
	 * @see #__DNA__FIELD__frame_length
	 */
	
	public void setFrame_length(float frame_length) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2068, frame_length);
		} else {
			__io__block.writeFloat(__io__address + 1988, frame_length);
		}
	}

	/**
	 * Get method for struct member 'time_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust simulation speed
	 * @see #__DNA__FIELD__time_scale
	 */
	
	public float getTime_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2072);
		} else {
			return __io__block.readFloat(__io__address + 1992);
		}
	}

	/**
	 * Set method for struct member 'time_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Adjust simulation speed
	 * @see #__DNA__FIELD__time_scale
	 */
	
	public void setTime_scale(float time_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2072, time_scale);
		} else {
			__io__block.writeFloat(__io__address + 1992, time_scale);
		}
	}

	/**
	 * Get method for struct member 'cfl_condition'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximal velocity per cell (higher value results in greater timesteps)
	 * @see #__DNA__FIELD__cfl_condition
	 */
	
	public float getCfl_condition() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2076);
		} else {
			return __io__block.readFloat(__io__address + 1996);
		}
	}

	/**
	 * Set method for struct member 'cfl_condition'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Maximal velocity per cell (higher value results in greater timesteps)
	 * @see #__DNA__FIELD__cfl_condition
	 */
	
	public void setCfl_condition(float cfl_condition) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2076, cfl_condition);
		} else {
			__io__block.writeFloat(__io__address + 1996, cfl_condition);
		}
	}

	/**
	 * Get method for struct member 'timesteps_minimum'.
	 * @see #__DNA__FIELD__timesteps_minimum
	 */
	
	public int getTimesteps_minimum() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2080);
		} else {
			return __io__block.readInt(__io__address + 2000);
		}
	}

	/**
	 * Set method for struct member 'timesteps_minimum'.
	 * @see #__DNA__FIELD__timesteps_minimum
	 */
	
	public void setTimesteps_minimum(int timesteps_minimum) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2080, timesteps_minimum);
		} else {
			__io__block.writeInt(__io__address + 2000, timesteps_minimum);
		}
	}

	/**
	 * Get method for struct member 'timesteps_maximum'.
	 * @see #__DNA__FIELD__timesteps_maximum
	 */
	
	public int getTimesteps_maximum() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2084);
		} else {
			return __io__block.readInt(__io__address + 2004);
		}
	}

	/**
	 * Set method for struct member 'timesteps_maximum'.
	 * @see #__DNA__FIELD__timesteps_maximum
	 */
	
	public void setTimesteps_maximum(int timesteps_maximum) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2084, timesteps_maximum);
		} else {
			__io__block.writeInt(__io__address + 2004, timesteps_maximum);
		}
	}

	/**
	 * Get method for struct member 'slice_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How to slice the volume for viewport rendering<h4>Blender Source Code:</h4>
	 * <p> Display options. </p>
	 * @see #__DNA__FIELD__slice_method
	 */
	
	public byte getSlice_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2088);
		} else {
			return __io__block.readByte(__io__address + 2008);
		}
	}

	/**
	 * Set method for struct member 'slice_method'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How to slice the volume for viewport rendering<h4>Blender Source Code:</h4>
	 * <p> Display options. </p>
	 * @see #__DNA__FIELD__slice_method
	 */
	
	public void setSlice_method(byte slice_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2088, slice_method);
		} else {
			__io__block.writeByte(__io__address + 2008, slice_method);
		}
	}

	/**
	 * Get method for struct member 'axis_slice_method'.
	 * @see #__DNA__FIELD__axis_slice_method
	 */
	
	public byte getAxis_slice_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2089);
		} else {
			return __io__block.readByte(__io__address + 2009);
		}
	}

	/**
	 * Set method for struct member 'axis_slice_method'.
	 * @see #__DNA__FIELD__axis_slice_method
	 */
	
	public void setAxis_slice_method(byte axis_slice_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2089, axis_slice_method);
		} else {
			__io__block.writeByte(__io__address + 2009, axis_slice_method);
		}
	}

	/**
	 * Get method for struct member 'slice_axis'.
	 * @see #__DNA__FIELD__slice_axis
	 */
	
	public byte getSlice_axis() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2090);
		} else {
			return __io__block.readByte(__io__address + 2010);
		}
	}

	/**
	 * Set method for struct member 'slice_axis'.
	 * @see #__DNA__FIELD__slice_axis
	 */
	
	public void setSlice_axis(byte slice_axis) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2090, slice_axis);
		} else {
			__io__block.writeByte(__io__address + 2010, slice_axis);
		}
	}

	/**
	 * Get method for struct member 'draw_velocity'.
	 * @see #__DNA__FIELD__draw_velocity
	 */
	
	public byte getDraw_velocity() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2091);
		} else {
			return __io__block.readByte(__io__address + 2011);
		}
	}

	/**
	 * Set method for struct member 'draw_velocity'.
	 * @see #__DNA__FIELD__draw_velocity
	 */
	
	public void setDraw_velocity(byte draw_velocity) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2091, draw_velocity);
		} else {
			__io__block.writeByte(__io__address + 2011, draw_velocity);
		}
	}

	/**
	 * Get method for struct member 'slice_per_voxel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How many slices per voxel should be generated
	 * @see #__DNA__FIELD__slice_per_voxel
	 */
	
	public float getSlice_per_voxel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2092);
		} else {
			return __io__block.readFloat(__io__address + 2012);
		}
	}

	/**
	 * Set method for struct member 'slice_per_voxel'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * How many slices per voxel should be generated
	 * @see #__DNA__FIELD__slice_per_voxel
	 */
	
	public void setSlice_per_voxel(float slice_per_voxel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2092, slice_per_voxel);
		} else {
			__io__block.writeFloat(__io__address + 2012, slice_per_voxel);
		}
	}

	/**
	 * Get method for struct member 'slice_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Position of the slice
	 * @see #__DNA__FIELD__slice_depth
	 */
	
	public float getSlice_depth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2096);
		} else {
			return __io__block.readFloat(__io__address + 2016);
		}
	}

	/**
	 * Set method for struct member 'slice_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Position of the slice
	 * @see #__DNA__FIELD__slice_depth
	 */
	
	public void setSlice_depth(float slice_depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2096, slice_depth);
		} else {
			__io__block.writeFloat(__io__address + 2016, slice_depth);
		}
	}

	/**
	 * Get method for struct member 'display_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Thickness of smoke drawing in the viewport
	 * @see #__DNA__FIELD__display_thickness
	 */
	
	public float getDisplay_thickness() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2100);
		} else {
			return __io__block.readFloat(__io__address + 2020);
		}
	}

	/**
	 * Set method for struct member 'display_thickness'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Thickness of smoke drawing in the viewport
	 * @see #__DNA__FIELD__display_thickness
	 */
	
	public void setDisplay_thickness(float display_thickness) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2100, display_thickness);
		} else {
			__io__block.writeFloat(__io__address + 2020, display_thickness);
		}
	}

	/**
	 * Get method for struct member 'coba'.
	 * @see #__DNA__FIELD__coba
	 */
	
	public CPointer<ColorBand> getCoba() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 2104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 2024);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ColorBand.class};
		return new CPointer<ColorBand>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ColorBand.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'coba'.
	 * @see #__DNA__FIELD__coba
	 */
	
	public void setCoba(CPointer<ColorBand> coba) throws IOException
	{
		long __address = ((coba == null) ? 0 : coba.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 2104, __address);
		} else {
			__io__block.writeLong(__io__address + 2024, __address);
		}
	}

	/**
	 * Get method for struct member 'vector_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier for scaling the vectors
	 * @see #__DNA__FIELD__vector_scale
	 */
	
	public float getVector_scale() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2112);
		} else {
			return __io__block.readFloat(__io__address + 2028);
		}
	}

	/**
	 * Set method for struct member 'vector_scale'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Multiplier for scaling the vectors
	 * @see #__DNA__FIELD__vector_scale
	 */
	
	public void setVector_scale(float vector_scale) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2112, vector_scale);
		} else {
			__io__block.writeFloat(__io__address + 2028, vector_scale);
		}
	}

	/**
	 * Get method for struct member 'vector_draw_type'.
	 * @see #__DNA__FIELD__vector_draw_type
	 */
	
	public byte getVector_draw_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2116);
		} else {
			return __io__block.readByte(__io__address + 2032);
		}
	}

	/**
	 * Set method for struct member 'vector_draw_type'.
	 * @see #__DNA__FIELD__vector_draw_type
	 */
	
	public void setVector_draw_type(byte vector_draw_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2116, vector_draw_type);
		} else {
			__io__block.writeByte(__io__address + 2032, vector_draw_type);
		}
	}

	/**
	 * Get method for struct member 'use_coba'.
	 * @see #__DNA__FIELD__use_coba
	 */
	
	public byte getUse_coba() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2117);
		} else {
			return __io__block.readByte(__io__address + 2033);
		}
	}

	/**
	 * Set method for struct member 'use_coba'.
	 * @see #__DNA__FIELD__use_coba
	 */
	
	public void setUse_coba(byte use_coba) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2117, use_coba);
		} else {
			__io__block.writeByte(__io__address + 2033, use_coba);
		}
	}

	/**
	 * Get method for struct member 'coba_field'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Simulation field to color map<h4>Blender Source Code:</h4>
	 * <p> Simulation field used for the color mapping. </p>
	 * @see #__DNA__FIELD__coba_field
	 */
	
	public byte getCoba_field() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2118);
		} else {
			return __io__block.readByte(__io__address + 2034);
		}
	}

	/**
	 * Set method for struct member 'coba_field'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Simulation field to color map<h4>Blender Source Code:</h4>
	 * <p> Simulation field used for the color mapping. </p>
	 * @see #__DNA__FIELD__coba_field
	 */
	
	public void setCoba_field(byte coba_field) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2118, coba_field);
		} else {
			__io__block.writeByte(__io__address + 2034, coba_field);
		}
	}

	/**
	 * Get method for struct member 'interp_method'.
	 * @see #__DNA__FIELD__interp_method
	 */
	
	public byte getInterp_method() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2119);
		} else {
			return __io__block.readByte(__io__address + 2035);
		}
	}

	/**
	 * Set method for struct member 'interp_method'.
	 * @see #__DNA__FIELD__interp_method
	 */
	
	public void setInterp_method(byte interp_method) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2119, interp_method);
		} else {
			__io__block.writeByte(__io__address + 2035, interp_method);
		}
	}

	/**
	 * Get method for struct member 'viewsettings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><ndash/>  Deprecated / unsed options (below). <ndash/>  View options. </p>
	 * @see #__DNA__FIELD__viewsettings
	 */
	
	public int getViewsettings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2120);
		} else {
			return __io__block.readInt(__io__address + 2036);
		}
	}

	/**
	 * Set method for struct member 'viewsettings'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p><ndash/>  Deprecated / unsed options (below). <ndash/>  View options. </p>
	 * @see #__DNA__FIELD__viewsettings
	 */
	
	public void setViewsettings(int viewsettings) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2120, viewsettings);
		} else {
			__io__block.writeInt(__io__address + 2036, viewsettings);
		}
	}

	/**
	 * Get method for struct member '_pad9'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad9
	 */
	
	public CArrayFacade<Byte> get_pad9() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2040, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad9'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad9
	 */
	
	public void set_pad9(CArrayFacade<Byte> _pad9) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2124;
		} else {
			__dna__offset = 2040;
		}
		if (__io__equals(_pad9, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad9)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad9);
		} else {
			__io__generic__copy( get_pad9(), _pad9);
		}
	}

	/**
	 * Get method for struct member 'openvdb_comp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> OpenVDB cache options. </p>
	 * @see #__DNA__FIELD__openvdb_comp
	 */
	
	public int getOpenvdb_comp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2128);
		} else {
			return __io__block.readInt(__io__address + 2044);
		}
	}

	/**
	 * Set method for struct member 'openvdb_comp'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> OpenVDB cache options. </p>
	 * @see #__DNA__FIELD__openvdb_comp
	 */
	
	public void setOpenvdb_comp(int openvdb_comp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2128, openvdb_comp);
		} else {
			__io__block.writeInt(__io__address + 2044, openvdb_comp);
		}
	}

	/**
	 * Get method for struct member 'clipping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Value under which voxels are considered empty space to optimize caching and rendering
	 * @see #__DNA__FIELD__clipping
	 */
	
	public float getClipping() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 2132);
		} else {
			return __io__block.readFloat(__io__address + 2048);
		}
	}

	/**
	 * Set method for struct member 'clipping'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Value under which voxels are considered empty space to optimize caching and rendering
	 * @see #__DNA__FIELD__clipping
	 */
	
	public void setClipping(float clipping) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 2132, clipping);
		} else {
			__io__block.writeFloat(__io__address + 2048, clipping);
		}
	}

	/**
	 * Get method for struct member 'data_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Bit depth for writing all scalar (including vector) lower values reduce file size
	 * @see #__DNA__FIELD__data_depth
	 */
	
	public byte getData_depth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2136);
		} else {
			return __io__block.readByte(__io__address + 2052);
		}
	}

	/**
	 * Set method for struct member 'data_depth'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * Bit depth for writing all scalar (including vector) lower values reduce file size
	 * @see #__DNA__FIELD__data_depth
	 */
	
	public void setData_depth(byte data_depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2136, data_depth);
		} else {
			__io__block.writeByte(__io__address + 2052, data_depth);
		}
	}

	/**
	 * Get method for struct member '_pad10'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad10
	 */
	
	public CArrayFacade<Byte> get_pad10() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2137, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2053, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad10'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad10
	 */
	
	public void set_pad10(CArrayFacade<Byte> _pad10) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2137;
		} else {
			__dna__offset = 2053;
		}
		if (__io__equals(_pad10, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad10)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad10);
		} else {
			__io__generic__copy( get_pad10(), _pad10);
		}
	}

	/**
	 * Get method for struct member 'point_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Pointcache options. Smoke uses only one cache from now on (index [0]), but keeping the array for now for reading old files. Definition is in {@link DNA_object_force_types.h} . </p>
	 * @see #__DNA__FIELD__point_cache
	 */
	
	public CArrayFacade<CPointer<PointCache>> getPoint_cache() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, PointCache.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CPointer<PointCache>>(__io__address + 2144, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CPointer<PointCache>>(__io__address + 2060, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'point_cache'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Python API:</h4>
	 * (read-only)<h4>Blender Source Code:</h4>
	 * <p> Pointcache options. Smoke uses only one cache from now on (index [0]), but keeping the array for now for reading old files. Definition is in {@link DNA_object_force_types.h} . </p>
	 * @see #__DNA__FIELD__point_cache
	 */
	
	public void setPoint_cache(CArrayFacade<CPointer<PointCache>> point_cache) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2144;
		} else {
			__dna__offset = 2060;
		}
		if (__io__equals(point_cache, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, point_cache)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, point_cache);
		} else {
			__io__generic__copy( getPoint_cache(), point_cache);
		}
	}

	/**
	 * Get method for struct member 'ptcaches'.
	 * @see #__DNA__FIELD__ptcaches
	 */
	
	public CArrayFacade<ListBase> getPtcaches() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{ListBase.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<ListBase>(__io__address + 2160, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<ListBase>(__io__address + 2068, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ptcaches'.
	 * @see #__DNA__FIELD__ptcaches
	 */
	
	public void setPtcaches(CArrayFacade<ListBase> ptcaches) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2160;
		} else {
			__dna__offset = 2068;
		}
		if (__io__equals(ptcaches, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ptcaches)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ptcaches);
		} else {
			__io__generic__copy( getPtcaches(), ptcaches);
		}
	}

	/**
	 * Get method for struct member 'cache_comp'.
	 * @see #__DNA__FIELD__cache_comp
	 */
	
	public int getCache_comp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2192);
		} else {
			return __io__block.readInt(__io__address + 2084);
		}
	}

	/**
	 * Set method for struct member 'cache_comp'.
	 * @see #__DNA__FIELD__cache_comp
	 */
	
	public void setCache_comp(int cache_comp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2192, cache_comp);
		} else {
			__io__block.writeInt(__io__address + 2084, cache_comp);
		}
	}

	/**
	 * Get method for struct member 'cache_high_comp'.
	 * @see #__DNA__FIELD__cache_high_comp
	 */
	
	public int getCache_high_comp() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 2196);
		} else {
			return __io__block.readInt(__io__address + 2088);
		}
	}

	/**
	 * Set method for struct member 'cache_high_comp'.
	 * @see #__DNA__FIELD__cache_high_comp
	 */
	
	public void setCache_high_comp(int cache_high_comp) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 2196, cache_high_comp);
		} else {
			__io__block.writeInt(__io__address + 2088, cache_high_comp);
		}
	}

	/**
	 * Get method for struct member 'cache_file_format'.
	 * @see #__DNA__FIELD__cache_file_format
	 */
	
	public byte getCache_file_format() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 2200);
		} else {
			return __io__block.readByte(__io__address + 2092);
		}
	}

	/**
	 * Set method for struct member 'cache_file_format'.
	 * @see #__DNA__FIELD__cache_file_format
	 */
	
	public void setCache_file_format(byte cache_file_format) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 2200, cache_file_format);
		} else {
			__io__block.writeByte(__io__address + 2092, cache_file_format);
		}
	}

	/**
	 * Get method for struct member '_pad11'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad11
	 */
	
	public CArrayFacade<Byte> get_pad11() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 2201, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 2093, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member '_pad11'.
	 * <h3>Field Documentation</h3>
	 * <h4>Blender Source Code:</h4>
	 * <p> Unused. </p>
	 * @see #__DNA__FIELD___pad11
	 */
	
	public void set_pad11(CArrayFacade<Byte> _pad11) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 2201;
		} else {
			__dna__offset = 2093;
		}
		if (__io__equals(_pad11, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, _pad11)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, _pad11);
		} else {
			__io__generic__copy( get_pad11(), _pad11);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FluidDomainSettings> __io__addressof() {
		return new CPointer<FluidDomainSettings>(__io__address, new Class[]{FluidDomainSettings.class}, __io__block, __io__blockTable);
	}

}
