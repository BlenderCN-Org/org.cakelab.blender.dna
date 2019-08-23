package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'wmWindow'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=192, size64=280)
public class wmWindow extends CFacade {

	/**
	 * This is the sdna index of the struct wmWindow.
	 * <p>
	 * It is required when allocating a new block to store data for wmWindow.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 485;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;wmWindow&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, wmWindow.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'wmWindow*'</li>
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
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;wmWindow&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, wmWindow.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'wmWindow*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'ghostwin'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__ghostwin);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_ghostwin = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ghostwin'</li>
	 * <li>Signature: 'void*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ghostwin = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'screen'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__screen);
	 * CPointer&lt;CPointer&lt;bScreen&gt;&gt; p_screen = p.cast(new Class[]{CPointer.class, bScreen.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'screen'</li>
	 * <li>Signature: 'bScreen*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__screen = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'newscreen'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__newscreen);
	 * CPointer&lt;CPointer&lt;bScreen&gt;&gt; p_newscreen = p.cast(new Class[]{CPointer.class, bScreen.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'newscreen'</li>
	 * <li>Signature: 'bScreen*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__newscreen = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'screenname'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__screenname);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_screenname = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'screenname'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__screenname = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'posx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__posx);
	 * CPointer&lt;Short&gt; p_posx = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'posx'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__posx = new long[]{84, 104};

	/**
	 * Field descriptor (offset) for struct member 'posy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__posy);
	 * CPointer&lt;Short&gt; p_posy = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'posy'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__posy = new long[]{86, 106};

	/**
	 * Field descriptor (offset) for struct member 'sizex'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__sizex);
	 * CPointer&lt;Short&gt; p_sizex = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sizex'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sizex = new long[]{88, 108};

	/**
	 * Field descriptor (offset) for struct member 'sizey'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__sizey);
	 * CPointer&lt;Short&gt; p_sizey = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sizey'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sizey = new long[]{90, 110};

	/**
	 * Field descriptor (offset) for struct member 'windowstate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__windowstate);
	 * CPointer&lt;Short&gt; p_windowstate = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'windowstate'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__windowstate = new long[]{92, 112};

	/**
	 * Field descriptor (offset) for struct member 'monitor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__monitor);
	 * CPointer&lt;Short&gt; p_monitor = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'monitor'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__monitor = new long[]{94, 114};

	/**
	 * Field descriptor (offset) for struct member 'active'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__active);
	 * CPointer&lt;Short&gt; p_active = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'active'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__active = new long[]{96, 116};

	/**
	 * Field descriptor (offset) for struct member 'cursor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__cursor);
	 * CPointer&lt;Short&gt; p_cursor = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cursor'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cursor = new long[]{98, 118};

	/**
	 * Field descriptor (offset) for struct member 'lastcursor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__lastcursor);
	 * CPointer&lt;Short&gt; p_lastcursor = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastcursor'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastcursor = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'modalcursor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__modalcursor);
	 * CPointer&lt;Short&gt; p_modalcursor = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modalcursor'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modalcursor = new long[]{102, 122};

	/**
	 * Field descriptor (offset) for struct member 'grabcursor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__grabcursor);
	 * CPointer&lt;Short&gt; p_grabcursor = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'grabcursor'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__grabcursor = new long[]{104, 124};

	/**
	 * Field descriptor (offset) for struct member 'addmousemove'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__addmousemove);
	 * CPointer&lt;Short&gt; p_addmousemove = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'addmousemove'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__addmousemove = new long[]{106, 126};

	/**
	 * Field descriptor (offset) for struct member 'winid'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__winid);
	 * CPointer&lt;Integer&gt; p_winid = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'winid'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__winid = new long[]{108, 128};

	/**
	 * Field descriptor (offset) for struct member 'lock_pie_event'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__lock_pie_event);
	 * CPointer&lt;Short&gt; p_lock_pie_event = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lock_pie_event'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lock_pie_event = new long[]{112, 132};

	/**
	 * Field descriptor (offset) for struct member 'last_pie_event'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__last_pie_event);
	 * CPointer&lt;Short&gt; p_last_pie_event = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_pie_event'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_pie_event = new long[]{114, 134};

	/**
	 * Field descriptor (offset) for struct member 'eventstate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__eventstate);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_eventstate = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'eventstate'</li>
	 * <li>Signature: 'wmEvent*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__eventstate = new long[]{116, 136};

	/**
	 * Field descriptor (offset) for struct member 'curswin'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__curswin);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_curswin = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curswin'</li>
	 * <li>Signature: 'wmSubWindow*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curswin = new long[]{120, 144};

	/**
	 * Field descriptor (offset) for struct member 'tweak'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__tweak);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tweak = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tweak'</li>
	 * <li>Signature: 'wmGesture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tweak = new long[]{124, 152};

	/**
	 * Field descriptor (offset) for struct member 'ime_data'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__ime_data);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_ime_data = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ime_data'</li>
	 * <li>Signature: 'wmIMEData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ime_data = new long[]{128, 160};

	/**
	 * Field descriptor (offset) for struct member 'drawmethod'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__drawmethod);
	 * CPointer&lt;Integer&gt; p_drawmethod = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawmethod'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawmethod = new long[]{132, 168};

	/**
	 * Field descriptor (offset) for struct member 'drawfail'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__drawfail);
	 * CPointer&lt;Integer&gt; p_drawfail = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawfail'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawfail = new long[]{136, 172};

	/**
	 * Field descriptor (offset) for struct member 'drawdata'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__drawdata);
	 * CPointer&lt;ListBase&gt; p_drawdata = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'drawdata'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__drawdata = new long[]{140, 176};

	/**
	 * Field descriptor (offset) for struct member 'queue'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__queue);
	 * CPointer&lt;ListBase&gt; p_queue = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'queue'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__queue = new long[]{148, 192};

	/**
	 * Field descriptor (offset) for struct member 'handlers'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__handlers);
	 * CPointer&lt;ListBase&gt; p_handlers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'handlers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__handlers = new long[]{156, 208};

	/**
	 * Field descriptor (offset) for struct member 'modalhandlers'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__modalhandlers);
	 * CPointer&lt;ListBase&gt; p_modalhandlers = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'modalhandlers'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__modalhandlers = new long[]{164, 224};

	/**
	 * Field descriptor (offset) for struct member 'subwindows'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__subwindows);
	 * CPointer&lt;ListBase&gt; p_subwindows = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subwindows'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subwindows = new long[]{172, 240};

	/**
	 * Field descriptor (offset) for struct member 'gesture'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__gesture);
	 * CPointer&lt;ListBase&gt; p_gesture = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gesture'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gesture = new long[]{180, 256};

	/**
	 * Field descriptor (offset) for struct member 'stereo3d_format'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * wmWindow wmwindow = ...;
	 * CPointer&lt;Object&gt; p = wmwindow.__dna__addressof(wmWindow.__DNA__FIELD__stereo3d_format);
	 * CPointer&lt;CPointer&lt;Stereo3dFormat&gt;&gt; p_stereo3d_format = p.cast(new Class[]{CPointer.class, Stereo3dFormat.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'stereo3d_format'</li>
	 * <li>Signature: 'Stereo3dFormat*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__stereo3d_format = new long[]{188, 272};

	public wmWindow(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected wmWindow(wmWindow that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<wmWindow> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmWindow.class};
		return new CPointer<wmWindow>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmWindow.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<wmWindow> next) throws IOException
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
	
	public CPointer<wmWindow> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{wmWindow.class};
		return new CPointer<wmWindow>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, wmWindow.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<wmWindow> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'ghostwin'.
	 * @see #__DNA__FIELD__ghostwin
	 */
	
	public CPointer<Object> getGhostwin() throws IOException
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
	 * Set method for struct member 'ghostwin'.
	 * @see #__DNA__FIELD__ghostwin
	 */
	
	public void setGhostwin(CPointer<Object> ghostwin) throws IOException
	{
		long __address = ((ghostwin == null) ? 0 : ghostwin.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'screen'.
	 * @see #__DNA__FIELD__screen
	 */
	
	public CPointer<bScreen> getScreen() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bScreen.class};
		return new CPointer<bScreen>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bScreen.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'screen'.
	 * @see #__DNA__FIELD__screen
	 */
	
	public void setScreen(CPointer<bScreen> screen) throws IOException
	{
		long __address = ((screen == null) ? 0 : screen.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'newscreen'.
	 * @see #__DNA__FIELD__newscreen
	 */
	
	public CPointer<bScreen> getNewscreen() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bScreen.class};
		return new CPointer<bScreen>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bScreen.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'newscreen'.
	 * @see #__DNA__FIELD__newscreen
	 */
	
	public void setNewscreen(CPointer<bScreen> newscreen) throws IOException
	{
		long __address = ((newscreen == null) ? 0 : newscreen.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'screenname'.
	 * @see #__DNA__FIELD__screenname
	 */
	
	public CArrayFacade<Byte> getScreenname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 40, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 20, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'screenname'.
	 * @see #__DNA__FIELD__screenname
	 */
	
	public void setScreenname(CArrayFacade<Byte> screenname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 40;
		} else {
			__dna__offset = 20;
		}
		if (__io__equals(screenname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, screenname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, screenname);
		} else {
			__io__generic__copy( getScreenname(), screenname);
		}
	}

	/**
	 * Get method for struct member 'posx'.
	 * @see #__DNA__FIELD__posx
	 */
	
	public short getPosx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 104);
		} else {
			return __io__block.readShort(__io__address + 84);
		}
	}

	/**
	 * Set method for struct member 'posx'.
	 * @see #__DNA__FIELD__posx
	 */
	
	public void setPosx(short posx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 104, posx);
		} else {
			__io__block.writeShort(__io__address + 84, posx);
		}
	}

	/**
	 * Get method for struct member 'posy'.
	 * @see #__DNA__FIELD__posy
	 */
	
	public short getPosy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 106);
		} else {
			return __io__block.readShort(__io__address + 86);
		}
	}

	/**
	 * Set method for struct member 'posy'.
	 * @see #__DNA__FIELD__posy
	 */
	
	public void setPosy(short posy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 106, posy);
		} else {
			__io__block.writeShort(__io__address + 86, posy);
		}
	}

	/**
	 * Get method for struct member 'sizex'.
	 * @see #__DNA__FIELD__sizex
	 */
	
	public short getSizex() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 108);
		} else {
			return __io__block.readShort(__io__address + 88);
		}
	}

	/**
	 * Set method for struct member 'sizex'.
	 * @see #__DNA__FIELD__sizex
	 */
	
	public void setSizex(short sizex) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 108, sizex);
		} else {
			__io__block.writeShort(__io__address + 88, sizex);
		}
	}

	/**
	 * Get method for struct member 'sizey'.
	 * @see #__DNA__FIELD__sizey
	 */
	
	public short getSizey() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 110);
		} else {
			return __io__block.readShort(__io__address + 90);
		}
	}

	/**
	 * Set method for struct member 'sizey'.
	 * @see #__DNA__FIELD__sizey
	 */
	
	public void setSizey(short sizey) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 110, sizey);
		} else {
			__io__block.writeShort(__io__address + 90, sizey);
		}
	}

	/**
	 * Get method for struct member 'windowstate'.
	 * @see #__DNA__FIELD__windowstate
	 */
	
	public short getWindowstate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 112);
		} else {
			return __io__block.readShort(__io__address + 92);
		}
	}

	/**
	 * Set method for struct member 'windowstate'.
	 * @see #__DNA__FIELD__windowstate
	 */
	
	public void setWindowstate(short windowstate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 112, windowstate);
		} else {
			__io__block.writeShort(__io__address + 92, windowstate);
		}
	}

	/**
	 * Get method for struct member 'monitor'.
	 * @see #__DNA__FIELD__monitor
	 */
	
	public short getMonitor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 114);
		} else {
			return __io__block.readShort(__io__address + 94);
		}
	}

	/**
	 * Set method for struct member 'monitor'.
	 * @see #__DNA__FIELD__monitor
	 */
	
	public void setMonitor(short monitor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 114, monitor);
		} else {
			__io__block.writeShort(__io__address + 94, monitor);
		}
	}

	/**
	 * Get method for struct member 'active'.
	 * @see #__DNA__FIELD__active
	 */
	
	public short getActive() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 116);
		} else {
			return __io__block.readShort(__io__address + 96);
		}
	}

	/**
	 * Set method for struct member 'active'.
	 * @see #__DNA__FIELD__active
	 */
	
	public void setActive(short active) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 116, active);
		} else {
			__io__block.writeShort(__io__address + 96, active);
		}
	}

	/**
	 * Get method for struct member 'cursor'.
	 * @see #__DNA__FIELD__cursor
	 */
	
	public short getCursor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 118);
		} else {
			return __io__block.readShort(__io__address + 98);
		}
	}

	/**
	 * Set method for struct member 'cursor'.
	 * @see #__DNA__FIELD__cursor
	 */
	
	public void setCursor(short cursor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 118, cursor);
		} else {
			__io__block.writeShort(__io__address + 98, cursor);
		}
	}

	/**
	 * Get method for struct member 'lastcursor'.
	 * @see #__DNA__FIELD__lastcursor
	 */
	
	public short getLastcursor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 120);
		} else {
			return __io__block.readShort(__io__address + 100);
		}
	}

	/**
	 * Set method for struct member 'lastcursor'.
	 * @see #__DNA__FIELD__lastcursor
	 */
	
	public void setLastcursor(short lastcursor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 120, lastcursor);
		} else {
			__io__block.writeShort(__io__address + 100, lastcursor);
		}
	}

	/**
	 * Get method for struct member 'modalcursor'.
	 * @see #__DNA__FIELD__modalcursor
	 */
	
	public short getModalcursor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 122);
		} else {
			return __io__block.readShort(__io__address + 102);
		}
	}

	/**
	 * Set method for struct member 'modalcursor'.
	 * @see #__DNA__FIELD__modalcursor
	 */
	
	public void setModalcursor(short modalcursor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 122, modalcursor);
		} else {
			__io__block.writeShort(__io__address + 102, modalcursor);
		}
	}

	/**
	 * Get method for struct member 'grabcursor'.
	 * @see #__DNA__FIELD__grabcursor
	 */
	
	public short getGrabcursor() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 124);
		} else {
			return __io__block.readShort(__io__address + 104);
		}
	}

	/**
	 * Set method for struct member 'grabcursor'.
	 * @see #__DNA__FIELD__grabcursor
	 */
	
	public void setGrabcursor(short grabcursor) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 124, grabcursor);
		} else {
			__io__block.writeShort(__io__address + 104, grabcursor);
		}
	}

	/**
	 * Get method for struct member 'addmousemove'.
	 * @see #__DNA__FIELD__addmousemove
	 */
	
	public short getAddmousemove() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 126);
		} else {
			return __io__block.readShort(__io__address + 106);
		}
	}

	/**
	 * Set method for struct member 'addmousemove'.
	 * @see #__DNA__FIELD__addmousemove
	 */
	
	public void setAddmousemove(short addmousemove) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 126, addmousemove);
		} else {
			__io__block.writeShort(__io__address + 106, addmousemove);
		}
	}

	/**
	 * Get method for struct member 'winid'.
	 * @see #__DNA__FIELD__winid
	 */
	
	public int getWinid() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 128);
		} else {
			return __io__block.readInt(__io__address + 108);
		}
	}

	/**
	 * Set method for struct member 'winid'.
	 * @see #__DNA__FIELD__winid
	 */
	
	public void setWinid(int winid) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 128, winid);
		} else {
			__io__block.writeInt(__io__address + 108, winid);
		}
	}

	/**
	 * Get method for struct member 'lock_pie_event'.
	 * @see #__DNA__FIELD__lock_pie_event
	 */
	
	public short getLock_pie_event() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 132);
		} else {
			return __io__block.readShort(__io__address + 112);
		}
	}

	/**
	 * Set method for struct member 'lock_pie_event'.
	 * @see #__DNA__FIELD__lock_pie_event
	 */
	
	public void setLock_pie_event(short lock_pie_event) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 132, lock_pie_event);
		} else {
			__io__block.writeShort(__io__address + 112, lock_pie_event);
		}
	}

	/**
	 * Get method for struct member 'last_pie_event'.
	 * @see #__DNA__FIELD__last_pie_event
	 */
	
	public short getLast_pie_event() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 134);
		} else {
			return __io__block.readShort(__io__address + 114);
		}
	}

	/**
	 * Set method for struct member 'last_pie_event'.
	 * @see #__DNA__FIELD__last_pie_event
	 */
	
	public void setLast_pie_event(short last_pie_event) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 134, last_pie_event);
		} else {
			__io__block.writeShort(__io__address + 114, last_pie_event);
		}
	}

	/**
	 * Get method for struct member 'eventstate'.
	 * @see #__DNA__FIELD__eventstate
	 */
	
	public CPointer<Object> getEventstate() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 116);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'eventstate'.
	 * @see #__DNA__FIELD__eventstate
	 */
	
	public void setEventstate(CPointer<Object> eventstate) throws IOException
	{
		long __address = ((eventstate == null) ? 0 : eventstate.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 116, __address);
		}
	}

	/**
	 * Get method for struct member 'curswin'.
	 * @see #__DNA__FIELD__curswin
	 */
	
	public CPointer<Object> getCurswin() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'curswin'.
	 * @see #__DNA__FIELD__curswin
	 */
	
	public void setCurswin(CPointer<Object> curswin) throws IOException
	{
		long __address = ((curswin == null) ? 0 : curswin.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 120, __address);
		}
	}

	/**
	 * Get method for struct member 'tweak'.
	 * @see #__DNA__FIELD__tweak
	 */
	
	public CPointer<Object> getTweak() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 124);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tweak'.
	 * @see #__DNA__FIELD__tweak
	 */
	
	public void setTweak(CPointer<Object> tweak) throws IOException
	{
		long __address = ((tweak == null) ? 0 : tweak.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 152, __address);
		} else {
			__io__block.writeLong(__io__address + 124, __address);
		}
	}

	/**
	 * Get method for struct member 'ime_data'.
	 * @see #__DNA__FIELD__ime_data
	 */
	
	public CPointer<Object> getIme_data() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'ime_data'.
	 * @see #__DNA__FIELD__ime_data
	 */
	
	public void setIme_data(CPointer<Object> ime_data) throws IOException
	{
		long __address = ((ime_data == null) ? 0 : ime_data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 160, __address);
		} else {
			__io__block.writeLong(__io__address + 128, __address);
		}
	}

	/**
	 * Get method for struct member 'drawmethod'.
	 * @see #__DNA__FIELD__drawmethod
	 */
	
	public int getDrawmethod() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 168);
		} else {
			return __io__block.readInt(__io__address + 132);
		}
	}

	/**
	 * Set method for struct member 'drawmethod'.
	 * @see #__DNA__FIELD__drawmethod
	 */
	
	public void setDrawmethod(int drawmethod) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 168, drawmethod);
		} else {
			__io__block.writeInt(__io__address + 132, drawmethod);
		}
	}

	/**
	 * Get method for struct member 'drawfail'.
	 * @see #__DNA__FIELD__drawfail
	 */
	
	public int getDrawfail() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 172);
		} else {
			return __io__block.readInt(__io__address + 136);
		}
	}

	/**
	 * Set method for struct member 'drawfail'.
	 * @see #__DNA__FIELD__drawfail
	 */
	
	public void setDrawfail(int drawfail) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 172, drawfail);
		} else {
			__io__block.writeInt(__io__address + 136, drawfail);
		}
	}

	/**
	 * Get method for struct member 'drawdata'.
	 * @see #__DNA__FIELD__drawdata
	 */
	
	public ListBase getDrawdata() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 176, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 140, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'drawdata'.
	 * @see #__DNA__FIELD__drawdata
	 */
	
	public void setDrawdata(ListBase drawdata) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 176;
		} else {
			__dna__offset = 140;
		}
		if (__io__equals(drawdata, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, drawdata)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, drawdata);
		} else {
			__io__generic__copy( getDrawdata(), drawdata);
		}
	}

	/**
	 * Get method for struct member 'queue'.
	 * @see #__DNA__FIELD__queue
	 */
	
	public ListBase getQueue() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 192, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 148, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'queue'.
	 * @see #__DNA__FIELD__queue
	 */
	
	public void setQueue(ListBase queue) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 192;
		} else {
			__dna__offset = 148;
		}
		if (__io__equals(queue, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, queue)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, queue);
		} else {
			__io__generic__copy( getQueue(), queue);
		}
	}

	/**
	 * Get method for struct member 'handlers'.
	 * @see #__DNA__FIELD__handlers
	 */
	
	public ListBase getHandlers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 208, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 156, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'handlers'.
	 * @see #__DNA__FIELD__handlers
	 */
	
	public void setHandlers(ListBase handlers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 208;
		} else {
			__dna__offset = 156;
		}
		if (__io__equals(handlers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, handlers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, handlers);
		} else {
			__io__generic__copy( getHandlers(), handlers);
		}
	}

	/**
	 * Get method for struct member 'modalhandlers'.
	 * @see #__DNA__FIELD__modalhandlers
	 */
	
	public ListBase getModalhandlers() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 224, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 164, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'modalhandlers'.
	 * @see #__DNA__FIELD__modalhandlers
	 */
	
	public void setModalhandlers(ListBase modalhandlers) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 224;
		} else {
			__dna__offset = 164;
		}
		if (__io__equals(modalhandlers, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, modalhandlers)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, modalhandlers);
		} else {
			__io__generic__copy( getModalhandlers(), modalhandlers);
		}
	}

	/**
	 * Get method for struct member 'subwindows'.
	 * @see #__DNA__FIELD__subwindows
	 */
	
	public ListBase getSubwindows() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 240, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 172, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'subwindows'.
	 * @see #__DNA__FIELD__subwindows
	 */
	
	public void setSubwindows(ListBase subwindows) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 240;
		} else {
			__dna__offset = 172;
		}
		if (__io__equals(subwindows, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, subwindows)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, subwindows);
		} else {
			__io__generic__copy( getSubwindows(), subwindows);
		}
	}

	/**
	 * Get method for struct member 'gesture'.
	 * @see #__DNA__FIELD__gesture
	 */
	
	public ListBase getGesture() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 256, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 180, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gesture'.
	 * @see #__DNA__FIELD__gesture
	 */
	
	public void setGesture(ListBase gesture) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 256;
		} else {
			__dna__offset = 180;
		}
		if (__io__equals(gesture, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gesture)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gesture);
		} else {
			__io__generic__copy( getGesture(), gesture);
		}
	}

	/**
	 * Get method for struct member 'stereo3d_format'.
	 * @see #__DNA__FIELD__stereo3d_format
	 */
	
	public CPointer<Stereo3dFormat> getStereo3d_format() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 272);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 188);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Stereo3dFormat.class};
		return new CPointer<Stereo3dFormat>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Stereo3dFormat.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'stereo3d_format'.
	 * @see #__DNA__FIELD__stereo3d_format
	 */
	
	public void setStereo3d_format(CPointer<Stereo3dFormat> stereo3d_format) throws IOException
	{
		long __address = ((stereo3d_format == null) ? 0 : stereo3d_format.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 272, __address);
		} else {
			__io__block.writeLong(__io__address + 188, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<wmWindow> __io__addressof() {
		return new CPointer<wmWindow>(__io__address, new Class[]{wmWindow.class}, __io__block, __io__blockTable);
	}

}
