package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FluidsimSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1236, size64=1256)
public class FluidsimSettings extends CFacade {

	/**
	 * This is the sdna index of the struct FluidsimSettings.
	 * <p>
	 * It is required when allocating a new block to store data for FluidsimSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 146;

	/**
	 * Field descriptor (offset) for struct member 'fmd'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__fmd);
	 * CPointer&lt;CPointer&lt;FluidsimModifierData&gt;&gt; p_fmd = p.cast(new Class[]{CPointer.class, FluidsimModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fmd'</li>
	 * <li>Signature: 'FluidsimModifierData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fmd = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'threads'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__threads);
	 * CPointer&lt;Integer&gt; p_threads = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'threads'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__threads = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'pad1'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__pad1);
	 * CPointer&lt;Integer&gt; p_pad1 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad1'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad1 = new long[]{8, 12};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{12, 16};

	/**
	 * Field descriptor (offset) for struct member 'show_advancedoptions'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__show_advancedoptions);
	 * CPointer&lt;Short&gt; p_show_advancedoptions = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'show_advancedoptions'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__show_advancedoptions = new long[]{14, 18};

	/**
	 * Field descriptor (offset) for struct member 'resolutionxyz'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__resolutionxyz);
	 * CPointer&lt;Short&gt; p_resolutionxyz = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'resolutionxyz'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__resolutionxyz = new long[]{16, 20};

	/**
	 * Field descriptor (offset) for struct member 'previewresxyz'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__previewresxyz);
	 * CPointer&lt;Short&gt; p_previewresxyz = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'previewresxyz'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__previewresxyz = new long[]{18, 22};

	/**
	 * Field descriptor (offset) for struct member 'realsize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__realsize);
	 * CPointer&lt;Float&gt; p_realsize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'realsize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__realsize = new long[]{20, 24};

	/**
	 * Field descriptor (offset) for struct member 'guiDisplayMode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__guiDisplayMode);
	 * CPointer&lt;Short&gt; p_guiDisplayMode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'guiDisplayMode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__guiDisplayMode = new long[]{24, 28};

	/**
	 * Field descriptor (offset) for struct member 'renderDisplayMode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__renderDisplayMode);
	 * CPointer&lt;Short&gt; p_renderDisplayMode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'renderDisplayMode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__renderDisplayMode = new long[]{26, 30};

	/**
	 * Field descriptor (offset) for struct member 'viscosityValue'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__viscosityValue);
	 * CPointer&lt;Float&gt; p_viscosityValue = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viscosityValue'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viscosityValue = new long[]{28, 32};

	/**
	 * Field descriptor (offset) for struct member 'viscosityMode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__viscosityMode);
	 * CPointer&lt;Short&gt; p_viscosityMode = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viscosityMode'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viscosityMode = new long[]{32, 36};

	/**
	 * Field descriptor (offset) for struct member 'viscosityExponent'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__viscosityExponent);
	 * CPointer&lt;Short&gt; p_viscosityExponent = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'viscosityExponent'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__viscosityExponent = new long[]{34, 38};

	/**
	 * Field descriptor (offset) for struct member 'grav'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__grav);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_grav = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grav'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grav = new long[]{36, 40};

	/**
	 * Field descriptor (offset) for struct member 'animStart'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__animStart);
	 * CPointer&lt;Float&gt; p_animStart = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'animStart'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__animStart = new long[]{48, 52};

	/**
	 * Field descriptor (offset) for struct member 'animEnd'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__animEnd);
	 * CPointer&lt;Float&gt; p_animEnd = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'animEnd'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__animEnd = new long[]{52, 56};

	/**
	 * Field descriptor (offset) for struct member 'bakeStart'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__bakeStart);
	 * CPointer&lt;Integer&gt; p_bakeStart = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bakeStart'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bakeStart = new long[]{56, 60};

	/**
	 * Field descriptor (offset) for struct member 'bakeEnd'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__bakeEnd);
	 * CPointer&lt;Integer&gt; p_bakeEnd = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bakeEnd'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bakeEnd = new long[]{60, 64};

	/**
	 * Field descriptor (offset) for struct member 'frameOffset'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__frameOffset);
	 * CPointer&lt;Integer&gt; p_frameOffset = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'frameOffset'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__frameOffset = new long[]{64, 68};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__pad2);
	 * CPointer&lt;Integer&gt; p_pad2 = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{68, 72};

	/**
	 * Field descriptor (offset) for struct member 'gstar'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__gstar);
	 * CPointer&lt;Float&gt; p_gstar = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gstar'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gstar = new long[]{72, 76};

	/**
	 * Field descriptor (offset) for struct member 'maxRefine'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__maxRefine);
	 * CPointer&lt;Integer&gt; p_maxRefine = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'maxRefine'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__maxRefine = new long[]{76, 80};

	/**
	 * Field descriptor (offset) for struct member 'iniVelx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__iniVelx);
	 * CPointer&lt;Float&gt; p_iniVelx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iniVelx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iniVelx = new long[]{80, 84};

	/**
	 * Field descriptor (offset) for struct member 'iniVely'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__iniVely);
	 * CPointer&lt;Float&gt; p_iniVely = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iniVely'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iniVely = new long[]{84, 88};

	/**
	 * Field descriptor (offset) for struct member 'iniVelz'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__iniVelz);
	 * CPointer&lt;Float&gt; p_iniVelz = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iniVelz'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iniVelz = new long[]{88, 92};

	/**
	 * Field descriptor (offset) for struct member 'orgMesh'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__orgMesh);
	 * CPointer&lt;CPointer&lt;Mesh&gt;&gt; p_orgMesh = p.cast(new Class[]{CPointer.class, Mesh.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'orgMesh'</li>
	 * <li>Signature: 'Mesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__orgMesh = new long[]{92, 96};

	/**
	 * Field descriptor (offset) for struct member 'meshBB'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__meshBB);
	 * CPointer&lt;CPointer&lt;Mesh&gt;&gt; p_meshBB = p.cast(new Class[]{CPointer.class, Mesh.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'meshBB'</li>
	 * <li>Signature: 'Mesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__meshBB = new long[]{96, 104};

	/**
	 * Field descriptor (offset) for struct member 'surfdataPath'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__surfdataPath);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_surfdataPath = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'surfdataPath'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__surfdataPath = new long[]{100, 112};

	/**
	 * Field descriptor (offset) for struct member 'bbStart'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__bbStart);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_bbStart = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bbStart'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bbStart = new long[]{1124, 1136};

	/**
	 * Field descriptor (offset) for struct member 'bbSize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__bbSize);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_bbSize = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bbSize'</li>
	 * <li>Signature: 'float[3]'</li>
	 * <li>Actual Size (32bit/64bit): 12/12</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bbSize = new long[]{1136, 1148};

	/**
	 * Field descriptor (offset) for struct member 'ipo'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__ipo);
	 * CPointer&lt;CPointer&lt;Ipo&gt;&gt; p_ipo = p.cast(new Class[]{CPointer.class, Ipo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ipo'</li>
	 * <li>Signature: 'Ipo*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ipo = new long[]{1148, 1160};

	/**
	 * Field descriptor (offset) for struct member 'typeFlags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__typeFlags);
	 * CPointer&lt;Short&gt; p_typeFlags = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'typeFlags'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__typeFlags = new long[]{1152, 1168};

	/**
	 * Field descriptor (offset) for struct member 'domainNovecgen'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__domainNovecgen);
	 * CPointer&lt;Byte&gt; p_domainNovecgen = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'domainNovecgen'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__domainNovecgen = new long[]{1154, 1170};

	/**
	 * Field descriptor (offset) for struct member 'volumeInitType'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__volumeInitType);
	 * CPointer&lt;Byte&gt; p_volumeInitType = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'volumeInitType'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__volumeInitType = new long[]{1155, 1171};

	/**
	 * Field descriptor (offset) for struct member 'partSlipValue'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__partSlipValue);
	 * CPointer&lt;Float&gt; p_partSlipValue = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'partSlipValue'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__partSlipValue = new long[]{1156, 1172};

	/**
	 * Field descriptor (offset) for struct member 'generateTracers'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__generateTracers);
	 * CPointer&lt;Integer&gt; p_generateTracers = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'generateTracers'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__generateTracers = new long[]{1160, 1176};

	/**
	 * Field descriptor (offset) for struct member 'generateParticles'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__generateParticles);
	 * CPointer&lt;Float&gt; p_generateParticles = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'generateParticles'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__generateParticles = new long[]{1164, 1180};

	/**
	 * Field descriptor (offset) for struct member 'surfaceSmoothing'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__surfaceSmoothing);
	 * CPointer&lt;Float&gt; p_surfaceSmoothing = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'surfaceSmoothing'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__surfaceSmoothing = new long[]{1168, 1184};

	/**
	 * Field descriptor (offset) for struct member 'surfaceSubdivs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__surfaceSubdivs);
	 * CPointer&lt;Integer&gt; p_surfaceSubdivs = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'surfaceSubdivs'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__surfaceSubdivs = new long[]{1172, 1188};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{1176, 1192};

	/**
	 * Field descriptor (offset) for struct member 'particleInfSize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__particleInfSize);
	 * CPointer&lt;Float&gt; p_particleInfSize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particleInfSize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particleInfSize = new long[]{1180, 1196};

	/**
	 * Field descriptor (offset) for struct member 'particleInfAlpha'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__particleInfAlpha);
	 * CPointer&lt;Float&gt; p_particleInfAlpha = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particleInfAlpha'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particleInfAlpha = new long[]{1184, 1200};

	/**
	 * Field descriptor (offset) for struct member 'farFieldSize'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__farFieldSize);
	 * CPointer&lt;Float&gt; p_farFieldSize = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'farFieldSize'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__farFieldSize = new long[]{1188, 1204};

	/**
	 * Field descriptor (offset) for struct member 'meshVelocities'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__meshVelocities);
	 * CPointer&lt;CPointer&lt;FluidVertexVelocity&gt;&gt; p_meshVelocities = p.cast(new Class[]{CPointer.class, FluidVertexVelocity.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'meshVelocities'</li>
	 * <li>Signature: 'FluidVertexVelocity*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__meshVelocities = new long[]{1192, 1208};

	/**
	 * Field descriptor (offset) for struct member 'totvert'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__totvert);
	 * CPointer&lt;Integer&gt; p_totvert = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totvert'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totvert = new long[]{1196, 1216};

	/**
	 * Field descriptor (offset) for struct member 'cpsTimeStart'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__cpsTimeStart);
	 * CPointer&lt;Float&gt; p_cpsTimeStart = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cpsTimeStart'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cpsTimeStart = new long[]{1200, 1220};

	/**
	 * Field descriptor (offset) for struct member 'cpsTimeEnd'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__cpsTimeEnd);
	 * CPointer&lt;Float&gt; p_cpsTimeEnd = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cpsTimeEnd'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cpsTimeEnd = new long[]{1204, 1224};

	/**
	 * Field descriptor (offset) for struct member 'cpsQuality'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__cpsQuality);
	 * CPointer&lt;Float&gt; p_cpsQuality = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cpsQuality'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cpsQuality = new long[]{1208, 1228};

	/**
	 * Field descriptor (offset) for struct member 'attractforceStrength'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__attractforceStrength);
	 * CPointer&lt;Float&gt; p_attractforceStrength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attractforceStrength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attractforceStrength = new long[]{1212, 1232};

	/**
	 * Field descriptor (offset) for struct member 'attractforceRadius'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__attractforceRadius);
	 * CPointer&lt;Float&gt; p_attractforceRadius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'attractforceRadius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__attractforceRadius = new long[]{1216, 1236};

	/**
	 * Field descriptor (offset) for struct member 'velocityforceStrength'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__velocityforceStrength);
	 * CPointer&lt;Float&gt; p_velocityforceStrength = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'velocityforceStrength'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__velocityforceStrength = new long[]{1220, 1240};

	/**
	 * Field descriptor (offset) for struct member 'velocityforceRadius'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__velocityforceRadius);
	 * CPointer&lt;Float&gt; p_velocityforceRadius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'velocityforceRadius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__velocityforceRadius = new long[]{1224, 1244};

	/**
	 * Field descriptor (offset) for struct member 'lastgoodframe'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__lastgoodframe);
	 * CPointer&lt;Integer&gt; p_lastgoodframe = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastgoodframe'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastgoodframe = new long[]{1228, 1248};

	/**
	 * Field descriptor (offset) for struct member 'animRate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FluidsimSettings fluidsimsettings = ...;
	 * CPointer&lt;Object&gt; p = fluidsimsettings.__dna__addressof(FluidsimSettings.__DNA__FIELD__animRate);
	 * CPointer&lt;Float&gt; p_animRate = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'animRate'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__animRate = new long[]{1232, 1252};

	public FluidsimSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FluidsimSettings(FluidsimSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'fmd'.
	 * @see #__DNA__FIELD__fmd
	 */
	
	public CPointer<FluidsimModifierData> getFmd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FluidsimModifierData.class};
		return new CPointer<FluidsimModifierData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FluidsimModifierData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'fmd'.
	 * @see #__DNA__FIELD__fmd
	 */
	
	public void setFmd(CPointer<FluidsimModifierData> fmd) throws IOException
	{
		long __address = ((fmd == null) ? 0 : fmd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'threads'.
	 * @see #__DNA__FIELD__threads
	 */
	
	public int getThreads() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'threads'.
	 * @see #__DNA__FIELD__threads
	 */
	
	public void setThreads(int threads) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, threads);
		} else {
			__io__block.writeInt(__io__address + 4, threads);
		}
	}

	/**
	 * Get method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public int getPad1() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'pad1'.
	 * @see #__DNA__FIELD__pad1
	 */
	
	public void setPad1(int pad1) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, pad1);
		} else {
			__io__block.writeInt(__io__address + 8, pad1);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 16);
		} else {
			return __io__block.readShort(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 16, type);
		} else {
			__io__block.writeShort(__io__address + 12, type);
		}
	}

	/**
	 * Get method for struct member 'show_advancedoptions'.
	 * @see #__DNA__FIELD__show_advancedoptions
	 */
	
	public short getShow_advancedoptions() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 18);
		} else {
			return __io__block.readShort(__io__address + 14);
		}
	}

	/**
	 * Set method for struct member 'show_advancedoptions'.
	 * @see #__DNA__FIELD__show_advancedoptions
	 */
	
	public void setShow_advancedoptions(short show_advancedoptions) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 18, show_advancedoptions);
		} else {
			__io__block.writeShort(__io__address + 14, show_advancedoptions);
		}
	}

	/**
	 * Get method for struct member 'resolutionxyz'.
	 * @see #__DNA__FIELD__resolutionxyz
	 */
	
	public short getResolutionxyz() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 20);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'resolutionxyz'.
	 * @see #__DNA__FIELD__resolutionxyz
	 */
	
	public void setResolutionxyz(short resolutionxyz) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 20, resolutionxyz);
		} else {
			__io__block.writeShort(__io__address + 16, resolutionxyz);
		}
	}

	/**
	 * Get method for struct member 'previewresxyz'.
	 * @see #__DNA__FIELD__previewresxyz
	 */
	
	public short getPreviewresxyz() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 22);
		} else {
			return __io__block.readShort(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'previewresxyz'.
	 * @see #__DNA__FIELD__previewresxyz
	 */
	
	public void setPreviewresxyz(short previewresxyz) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 22, previewresxyz);
		} else {
			__io__block.writeShort(__io__address + 18, previewresxyz);
		}
	}

	/**
	 * Get method for struct member 'realsize'.
	 * @see #__DNA__FIELD__realsize
	 */
	
	public float getRealsize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 24);
		} else {
			return __io__block.readFloat(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'realsize'.
	 * @see #__DNA__FIELD__realsize
	 */
	
	public void setRealsize(float realsize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 24, realsize);
		} else {
			__io__block.writeFloat(__io__address + 20, realsize);
		}
	}

	/**
	 * Get method for struct member 'guiDisplayMode'.
	 * @see #__DNA__FIELD__guiDisplayMode
	 */
	
	public short getGuiDisplayMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 28);
		} else {
			return __io__block.readShort(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'guiDisplayMode'.
	 * @see #__DNA__FIELD__guiDisplayMode
	 */
	
	public void setGuiDisplayMode(short guiDisplayMode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 28, guiDisplayMode);
		} else {
			__io__block.writeShort(__io__address + 24, guiDisplayMode);
		}
	}

	/**
	 * Get method for struct member 'renderDisplayMode'.
	 * @see #__DNA__FIELD__renderDisplayMode
	 */
	
	public short getRenderDisplayMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 30);
		} else {
			return __io__block.readShort(__io__address + 26);
		}
	}

	/**
	 * Set method for struct member 'renderDisplayMode'.
	 * @see #__DNA__FIELD__renderDisplayMode
	 */
	
	public void setRenderDisplayMode(short renderDisplayMode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 30, renderDisplayMode);
		} else {
			__io__block.writeShort(__io__address + 26, renderDisplayMode);
		}
	}

	/**
	 * Get method for struct member 'viscosityValue'.
	 * @see #__DNA__FIELD__viscosityValue
	 */
	
	public float getViscosityValue() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'viscosityValue'.
	 * @see #__DNA__FIELD__viscosityValue
	 */
	
	public void setViscosityValue(float viscosityValue) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, viscosityValue);
		} else {
			__io__block.writeFloat(__io__address + 28, viscosityValue);
		}
	}

	/**
	 * Get method for struct member 'viscosityMode'.
	 * @see #__DNA__FIELD__viscosityMode
	 */
	
	public short getViscosityMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 36);
		} else {
			return __io__block.readShort(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'viscosityMode'.
	 * @see #__DNA__FIELD__viscosityMode
	 */
	
	public void setViscosityMode(short viscosityMode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 36, viscosityMode);
		} else {
			__io__block.writeShort(__io__address + 32, viscosityMode);
		}
	}

	/**
	 * Get method for struct member 'viscosityExponent'.
	 * @see #__DNA__FIELD__viscosityExponent
	 */
	
	public short getViscosityExponent() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 38);
		} else {
			return __io__block.readShort(__io__address + 34);
		}
	}

	/**
	 * Set method for struct member 'viscosityExponent'.
	 * @see #__DNA__FIELD__viscosityExponent
	 */
	
	public void setViscosityExponent(short viscosityExponent) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 38, viscosityExponent);
		} else {
			__io__block.writeShort(__io__address + 34, viscosityExponent);
		}
	}

	/**
	 * Get method for struct member 'grav'.
	 * @see #__DNA__FIELD__grav
	 */
	
	public CArrayFacade<Float> getGrav() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 36, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'grav'.
	 * @see #__DNA__FIELD__grav
	 */
	
	public void setGrav(CArrayFacade<Float> grav) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 36;
		}
		if (__io__equals(grav, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, grav)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, grav);
		} else {
			__io__generic__copy( getGrav(), grav);
		}
	}

	/**
	 * Get method for struct member 'animStart'.
	 * @see #__DNA__FIELD__animStart
	 */
	
	public float getAnimStart() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 52);
		} else {
			return __io__block.readFloat(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'animStart'.
	 * @see #__DNA__FIELD__animStart
	 */
	
	public void setAnimStart(float animStart) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 52, animStart);
		} else {
			__io__block.writeFloat(__io__address + 48, animStart);
		}
	}

	/**
	 * Get method for struct member 'animEnd'.
	 * @see #__DNA__FIELD__animEnd
	 */
	
	public float getAnimEnd() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 56);
		} else {
			return __io__block.readFloat(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'animEnd'.
	 * @see #__DNA__FIELD__animEnd
	 */
	
	public void setAnimEnd(float animEnd) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 56, animEnd);
		} else {
			__io__block.writeFloat(__io__address + 52, animEnd);
		}
	}

	/**
	 * Get method for struct member 'bakeStart'.
	 * @see #__DNA__FIELD__bakeStart
	 */
	
	public int getBakeStart() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 60);
		} else {
			return __io__block.readInt(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'bakeStart'.
	 * @see #__DNA__FIELD__bakeStart
	 */
	
	public void setBakeStart(int bakeStart) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 60, bakeStart);
		} else {
			__io__block.writeInt(__io__address + 56, bakeStart);
		}
	}

	/**
	 * Get method for struct member 'bakeEnd'.
	 * @see #__DNA__FIELD__bakeEnd
	 */
	
	public int getBakeEnd() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 64);
		} else {
			return __io__block.readInt(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'bakeEnd'.
	 * @see #__DNA__FIELD__bakeEnd
	 */
	
	public void setBakeEnd(int bakeEnd) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 64, bakeEnd);
		} else {
			__io__block.writeInt(__io__address + 60, bakeEnd);
		}
	}

	/**
	 * Get method for struct member 'frameOffset'.
	 * @see #__DNA__FIELD__frameOffset
	 */
	
	public int getFrameOffset() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 68);
		} else {
			return __io__block.readInt(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'frameOffset'.
	 * @see #__DNA__FIELD__frameOffset
	 */
	
	public void setFrameOffset(int frameOffset) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 68, frameOffset);
		} else {
			__io__block.writeInt(__io__address + 64, frameOffset);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public int getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 72);
		} else {
			return __io__block.readInt(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(int pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 72, pad2);
		} else {
			__io__block.writeInt(__io__address + 68, pad2);
		}
	}

	/**
	 * Get method for struct member 'gstar'.
	 * @see #__DNA__FIELD__gstar
	 */
	
	public float getGstar() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 76);
		} else {
			return __io__block.readFloat(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'gstar'.
	 * @see #__DNA__FIELD__gstar
	 */
	
	public void setGstar(float gstar) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 76, gstar);
		} else {
			__io__block.writeFloat(__io__address + 72, gstar);
		}
	}

	/**
	 * Get method for struct member 'maxRefine'.
	 * @see #__DNA__FIELD__maxRefine
	 */
	
	public int getMaxRefine() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 80);
		} else {
			return __io__block.readInt(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'maxRefine'.
	 * @see #__DNA__FIELD__maxRefine
	 */
	
	public void setMaxRefine(int maxRefine) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 80, maxRefine);
		} else {
			__io__block.writeInt(__io__address + 76, maxRefine);
		}
	}

	/**
	 * Get method for struct member 'iniVelx'.
	 * @see #__DNA__FIELD__iniVelx
	 */
	
	public float getIniVelx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 84);
		} else {
			return __io__block.readFloat(__io__address + 80);
		}
	}

	/**
	 * Set method for struct member 'iniVelx'.
	 * @see #__DNA__FIELD__iniVelx
	 */
	
	public void setIniVelx(float iniVelx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 84, iniVelx);
		} else {
			__io__block.writeFloat(__io__address + 80, iniVelx);
		}
	}

	/**
	 * Get method for struct member 'iniVely'.
	 * @see #__DNA__FIELD__iniVely
	 */
	
	public float getIniVely() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 88);
		} else {
			return __io__block.readFloat(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'iniVely'.
	 * @see #__DNA__FIELD__iniVely
	 */
	
	public void setIniVely(float iniVely) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 88, iniVely);
		} else {
			__io__block.writeFloat(__io__address + 84, iniVely);
		}
	}

	/**
	 * Get method for struct member 'iniVelz'.
	 * @see #__DNA__FIELD__iniVelz
	 */
	
	public float getIniVelz() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 92);
		} else {
			return __io__block.readFloat(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'iniVelz'.
	 * @see #__DNA__FIELD__iniVelz
	 */
	
	public void setIniVelz(float iniVelz) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 92, iniVelz);
		} else {
			__io__block.writeFloat(__io__address + 88, iniVelz);
		}
	}

	/**
	 * Get method for struct member 'orgMesh'.
	 * @see #__DNA__FIELD__orgMesh
	 */
	
	public CPointer<Mesh> getOrgMesh() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 92);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Mesh.class};
		return new CPointer<Mesh>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Mesh.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'orgMesh'.
	 * @see #__DNA__FIELD__orgMesh
	 */
	
	public void setOrgMesh(CPointer<Mesh> orgMesh) throws IOException
	{
		long __address = ((orgMesh == null) ? 0 : orgMesh.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 96, __address);
		} else {
			__io__block.writeLong(__io__address + 92, __address);
		}
	}

	/**
	 * Get method for struct member 'meshBB'.
	 * @see #__DNA__FIELD__meshBB
	 */
	
	public CPointer<Mesh> getMeshBB() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 96);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Mesh.class};
		return new CPointer<Mesh>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Mesh.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'meshBB'.
	 * @see #__DNA__FIELD__meshBB
	 */
	
	public void setMeshBB(CPointer<Mesh> meshBB) throws IOException
	{
		long __address = ((meshBB == null) ? 0 : meshBB.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 96, __address);
		}
	}

	/**
	 * Get method for struct member 'surfdataPath'.
	 * @see #__DNA__FIELD__surfdataPath
	 */
	
	public CArrayFacade<Byte> getSurfdataPath() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 112, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'surfdataPath'.
	 * @see #__DNA__FIELD__surfdataPath
	 */
	
	public void setSurfdataPath(CArrayFacade<Byte> surfdataPath) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 112;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(surfdataPath, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, surfdataPath)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, surfdataPath);
		} else {
			__io__generic__copy( getSurfdataPath(), surfdataPath);
		}
	}

	/**
	 * Get method for struct member 'bbStart'.
	 * @see #__DNA__FIELD__bbStart
	 */
	
	public CArrayFacade<Float> getBbStart() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 1136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1124, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bbStart'.
	 * @see #__DNA__FIELD__bbStart
	 */
	
	public void setBbStart(CArrayFacade<Float> bbStart) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1136;
		} else {
			__dna__offset = 1124;
		}
		if (__io__equals(bbStart, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bbStart)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bbStart);
		} else {
			__io__generic__copy( getBbStart(), bbStart);
		}
	}

	/**
	 * Get method for struct member 'bbSize'.
	 * @see #__DNA__FIELD__bbSize
	 */
	
	public CArrayFacade<Float> getBbSize() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			3
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 1148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1136, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bbSize'.
	 * @see #__DNA__FIELD__bbSize
	 */
	
	public void setBbSize(CArrayFacade<Float> bbSize) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1148;
		} else {
			__dna__offset = 1136;
		}
		if (__io__equals(bbSize, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bbSize)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bbSize);
		} else {
			__io__generic__copy( getBbSize(), bbSize);
		}
	}

	/**
	 * Get method for struct member 'ipo'.
	 * @see #__DNA__FIELD__ipo
	 */
	
	public CPointer<Ipo> getIpo() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1148);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Ipo.class};
		return new CPointer<Ipo>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Ipo.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ipo'.
	 * @see #__DNA__FIELD__ipo
	 */
	
	public void setIpo(CPointer<Ipo> ipo) throws IOException
	{
		long __address = ((ipo == null) ? 0 : ipo.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1160, __address);
		} else {
			__io__block.writeLong(__io__address + 1148, __address);
		}
	}

	/**
	 * Get method for struct member 'typeFlags'.
	 * @see #__DNA__FIELD__typeFlags
	 */
	
	public short getTypeFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1168);
		} else {
			return __io__block.readShort(__io__address + 1152);
		}
	}

	/**
	 * Set method for struct member 'typeFlags'.
	 * @see #__DNA__FIELD__typeFlags
	 */
	
	public void setTypeFlags(short typeFlags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1168, typeFlags);
		} else {
			__io__block.writeShort(__io__address + 1152, typeFlags);
		}
	}

	/**
	 * Get method for struct member 'domainNovecgen'.
	 * @see #__DNA__FIELD__domainNovecgen
	 */
	
	public byte getDomainNovecgen() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1170);
		} else {
			return __io__block.readByte(__io__address + 1154);
		}
	}

	/**
	 * Set method for struct member 'domainNovecgen'.
	 * @see #__DNA__FIELD__domainNovecgen
	 */
	
	public void setDomainNovecgen(byte domainNovecgen) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1170, domainNovecgen);
		} else {
			__io__block.writeByte(__io__address + 1154, domainNovecgen);
		}
	}

	/**
	 * Get method for struct member 'volumeInitType'.
	 * @see #__DNA__FIELD__volumeInitType
	 */
	
	public byte getVolumeInitType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1171);
		} else {
			return __io__block.readByte(__io__address + 1155);
		}
	}

	/**
	 * Set method for struct member 'volumeInitType'.
	 * @see #__DNA__FIELD__volumeInitType
	 */
	
	public void setVolumeInitType(byte volumeInitType) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1171, volumeInitType);
		} else {
			__io__block.writeByte(__io__address + 1155, volumeInitType);
		}
	}

	/**
	 * Get method for struct member 'partSlipValue'.
	 * @see #__DNA__FIELD__partSlipValue
	 */
	
	public float getPartSlipValue() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1172);
		} else {
			return __io__block.readFloat(__io__address + 1156);
		}
	}

	/**
	 * Set method for struct member 'partSlipValue'.
	 * @see #__DNA__FIELD__partSlipValue
	 */
	
	public void setPartSlipValue(float partSlipValue) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1172, partSlipValue);
		} else {
			__io__block.writeFloat(__io__address + 1156, partSlipValue);
		}
	}

	/**
	 * Get method for struct member 'generateTracers'.
	 * @see #__DNA__FIELD__generateTracers
	 */
	
	public int getGenerateTracers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1176);
		} else {
			return __io__block.readInt(__io__address + 1160);
		}
	}

	/**
	 * Set method for struct member 'generateTracers'.
	 * @see #__DNA__FIELD__generateTracers
	 */
	
	public void setGenerateTracers(int generateTracers) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1176, generateTracers);
		} else {
			__io__block.writeInt(__io__address + 1160, generateTracers);
		}
	}

	/**
	 * Get method for struct member 'generateParticles'.
	 * @see #__DNA__FIELD__generateParticles
	 */
	
	public float getGenerateParticles() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1180);
		} else {
			return __io__block.readFloat(__io__address + 1164);
		}
	}

	/**
	 * Set method for struct member 'generateParticles'.
	 * @see #__DNA__FIELD__generateParticles
	 */
	
	public void setGenerateParticles(float generateParticles) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1180, generateParticles);
		} else {
			__io__block.writeFloat(__io__address + 1164, generateParticles);
		}
	}

	/**
	 * Get method for struct member 'surfaceSmoothing'.
	 * @see #__DNA__FIELD__surfaceSmoothing
	 */
	
	public float getSurfaceSmoothing() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1184);
		} else {
			return __io__block.readFloat(__io__address + 1168);
		}
	}

	/**
	 * Set method for struct member 'surfaceSmoothing'.
	 * @see #__DNA__FIELD__surfaceSmoothing
	 */
	
	public void setSurfaceSmoothing(float surfaceSmoothing) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1184, surfaceSmoothing);
		} else {
			__io__block.writeFloat(__io__address + 1168, surfaceSmoothing);
		}
	}

	/**
	 * Get method for struct member 'surfaceSubdivs'.
	 * @see #__DNA__FIELD__surfaceSubdivs
	 */
	
	public int getSurfaceSubdivs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1188);
		} else {
			return __io__block.readInt(__io__address + 1172);
		}
	}

	/**
	 * Set method for struct member 'surfaceSubdivs'.
	 * @see #__DNA__FIELD__surfaceSubdivs
	 */
	
	public void setSurfaceSubdivs(int surfaceSubdivs) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1188, surfaceSubdivs);
		} else {
			__io__block.writeInt(__io__address + 1172, surfaceSubdivs);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1192);
		} else {
			return __io__block.readInt(__io__address + 1176);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1192, flag);
		} else {
			__io__block.writeInt(__io__address + 1176, flag);
		}
	}

	/**
	 * Get method for struct member 'particleInfSize'.
	 * @see #__DNA__FIELD__particleInfSize
	 */
	
	public float getParticleInfSize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1196);
		} else {
			return __io__block.readFloat(__io__address + 1180);
		}
	}

	/**
	 * Set method for struct member 'particleInfSize'.
	 * @see #__DNA__FIELD__particleInfSize
	 */
	
	public void setParticleInfSize(float particleInfSize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1196, particleInfSize);
		} else {
			__io__block.writeFloat(__io__address + 1180, particleInfSize);
		}
	}

	/**
	 * Get method for struct member 'particleInfAlpha'.
	 * @see #__DNA__FIELD__particleInfAlpha
	 */
	
	public float getParticleInfAlpha() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1200);
		} else {
			return __io__block.readFloat(__io__address + 1184);
		}
	}

	/**
	 * Set method for struct member 'particleInfAlpha'.
	 * @see #__DNA__FIELD__particleInfAlpha
	 */
	
	public void setParticleInfAlpha(float particleInfAlpha) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1200, particleInfAlpha);
		} else {
			__io__block.writeFloat(__io__address + 1184, particleInfAlpha);
		}
	}

	/**
	 * Get method for struct member 'farFieldSize'.
	 * @see #__DNA__FIELD__farFieldSize
	 */
	
	public float getFarFieldSize() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1204);
		} else {
			return __io__block.readFloat(__io__address + 1188);
		}
	}

	/**
	 * Set method for struct member 'farFieldSize'.
	 * @see #__DNA__FIELD__farFieldSize
	 */
	
	public void setFarFieldSize(float farFieldSize) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1204, farFieldSize);
		} else {
			__io__block.writeFloat(__io__address + 1188, farFieldSize);
		}
	}

	/**
	 * Get method for struct member 'meshVelocities'.
	 * @see #__DNA__FIELD__meshVelocities
	 */
	
	public CPointer<FluidVertexVelocity> getMeshVelocities() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1208);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1192);
		}
		Class<?>[] __dna__targetTypes = new Class[]{FluidVertexVelocity.class};
		return new CPointer<FluidVertexVelocity>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, FluidVertexVelocity.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'meshVelocities'.
	 * @see #__DNA__FIELD__meshVelocities
	 */
	
	public void setMeshVelocities(CPointer<FluidVertexVelocity> meshVelocities) throws IOException
	{
		long __address = ((meshVelocities == null) ? 0 : meshVelocities.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1208, __address);
		} else {
			__io__block.writeLong(__io__address + 1192, __address);
		}
	}

	/**
	 * Get method for struct member 'totvert'.
	 * @see #__DNA__FIELD__totvert
	 */
	
	public int getTotvert() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1216);
		} else {
			return __io__block.readInt(__io__address + 1196);
		}
	}

	/**
	 * Set method for struct member 'totvert'.
	 * @see #__DNA__FIELD__totvert
	 */
	
	public void setTotvert(int totvert) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1216, totvert);
		} else {
			__io__block.writeInt(__io__address + 1196, totvert);
		}
	}

	/**
	 * Get method for struct member 'cpsTimeStart'.
	 * @see #__DNA__FIELD__cpsTimeStart
	 */
	
	public float getCpsTimeStart() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1220);
		} else {
			return __io__block.readFloat(__io__address + 1200);
		}
	}

	/**
	 * Set method for struct member 'cpsTimeStart'.
	 * @see #__DNA__FIELD__cpsTimeStart
	 */
	
	public void setCpsTimeStart(float cpsTimeStart) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1220, cpsTimeStart);
		} else {
			__io__block.writeFloat(__io__address + 1200, cpsTimeStart);
		}
	}

	/**
	 * Get method for struct member 'cpsTimeEnd'.
	 * @see #__DNA__FIELD__cpsTimeEnd
	 */
	
	public float getCpsTimeEnd() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1224);
		} else {
			return __io__block.readFloat(__io__address + 1204);
		}
	}

	/**
	 * Set method for struct member 'cpsTimeEnd'.
	 * @see #__DNA__FIELD__cpsTimeEnd
	 */
	
	public void setCpsTimeEnd(float cpsTimeEnd) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1224, cpsTimeEnd);
		} else {
			__io__block.writeFloat(__io__address + 1204, cpsTimeEnd);
		}
	}

	/**
	 * Get method for struct member 'cpsQuality'.
	 * @see #__DNA__FIELD__cpsQuality
	 */
	
	public float getCpsQuality() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1228);
		} else {
			return __io__block.readFloat(__io__address + 1208);
		}
	}

	/**
	 * Set method for struct member 'cpsQuality'.
	 * @see #__DNA__FIELD__cpsQuality
	 */
	
	public void setCpsQuality(float cpsQuality) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1228, cpsQuality);
		} else {
			__io__block.writeFloat(__io__address + 1208, cpsQuality);
		}
	}

	/**
	 * Get method for struct member 'attractforceStrength'.
	 * @see #__DNA__FIELD__attractforceStrength
	 */
	
	public float getAttractforceStrength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1232);
		} else {
			return __io__block.readFloat(__io__address + 1212);
		}
	}

	/**
	 * Set method for struct member 'attractforceStrength'.
	 * @see #__DNA__FIELD__attractforceStrength
	 */
	
	public void setAttractforceStrength(float attractforceStrength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1232, attractforceStrength);
		} else {
			__io__block.writeFloat(__io__address + 1212, attractforceStrength);
		}
	}

	/**
	 * Get method for struct member 'attractforceRadius'.
	 * @see #__DNA__FIELD__attractforceRadius
	 */
	
	public float getAttractforceRadius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1236);
		} else {
			return __io__block.readFloat(__io__address + 1216);
		}
	}

	/**
	 * Set method for struct member 'attractforceRadius'.
	 * @see #__DNA__FIELD__attractforceRadius
	 */
	
	public void setAttractforceRadius(float attractforceRadius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1236, attractforceRadius);
		} else {
			__io__block.writeFloat(__io__address + 1216, attractforceRadius);
		}
	}

	/**
	 * Get method for struct member 'velocityforceStrength'.
	 * @see #__DNA__FIELD__velocityforceStrength
	 */
	
	public float getVelocityforceStrength() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1240);
		} else {
			return __io__block.readFloat(__io__address + 1220);
		}
	}

	/**
	 * Set method for struct member 'velocityforceStrength'.
	 * @see #__DNA__FIELD__velocityforceStrength
	 */
	
	public void setVelocityforceStrength(float velocityforceStrength) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1240, velocityforceStrength);
		} else {
			__io__block.writeFloat(__io__address + 1220, velocityforceStrength);
		}
	}

	/**
	 * Get method for struct member 'velocityforceRadius'.
	 * @see #__DNA__FIELD__velocityforceRadius
	 */
	
	public float getVelocityforceRadius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1244);
		} else {
			return __io__block.readFloat(__io__address + 1224);
		}
	}

	/**
	 * Set method for struct member 'velocityforceRadius'.
	 * @see #__DNA__FIELD__velocityforceRadius
	 */
	
	public void setVelocityforceRadius(float velocityforceRadius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1244, velocityforceRadius);
		} else {
			__io__block.writeFloat(__io__address + 1224, velocityforceRadius);
		}
	}

	/**
	 * Get method for struct member 'lastgoodframe'.
	 * @see #__DNA__FIELD__lastgoodframe
	 */
	
	public int getLastgoodframe() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1248);
		} else {
			return __io__block.readInt(__io__address + 1228);
		}
	}

	/**
	 * Set method for struct member 'lastgoodframe'.
	 * @see #__DNA__FIELD__lastgoodframe
	 */
	
	public void setLastgoodframe(int lastgoodframe) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1248, lastgoodframe);
		} else {
			__io__block.writeInt(__io__address + 1228, lastgoodframe);
		}
	}

	/**
	 * Get method for struct member 'animRate'.
	 * @see #__DNA__FIELD__animRate
	 */
	
	public float getAnimRate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1252);
		} else {
			return __io__block.readFloat(__io__address + 1232);
		}
	}

	/**
	 * Set method for struct member 'animRate'.
	 * @see #__DNA__FIELD__animRate
	 */
	
	public void setAnimRate(float animRate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1252, animRate);
		} else {
			__io__block.writeFloat(__io__address + 1232, animRate);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FluidsimSettings> __io__addressof() {
		return new CPointer<FluidsimSettings>(__io__address, new Class[]{FluidsimSettings.class}, __io__block, __io__blockTable);
	}

}