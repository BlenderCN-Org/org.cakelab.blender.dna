package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'FFMpegCodecData'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=68, size64=72)
public class FFMpegCodecData extends CFacade {

	/**
	 * This is the sdna index of the struct FFMpegCodecData.
	 * <p>
	 * It is required when allocating a new block to store data for FFMpegCodecData.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 152;

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FFMpegCodecData ffmpegcodecdata = ...;
	 * CPointer&lt;Object&gt; p = ffmpegcodecdata.__dna__addressof(FFMpegCodecData.__DNA__FIELD__type);
	 * CPointer&lt;Integer&gt; p_type = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'codec'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FFMpegCodecData ffmpegcodecdata = ...;
	 * CPointer&lt;Object&gt; p = ffmpegcodecdata.__dna__addressof(FFMpegCodecData.__DNA__FIELD__codec);
	 * CPointer&lt;Integer&gt; p_codec = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'codec'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__codec = new long[]{4, 4};

	/**
	 * Field descriptor (offset) for struct member 'audio_codec'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FFMpegCodecData ffmpegcodecdata = ...;
	 * CPointer&lt;Object&gt; p = ffmpegcodecdata.__dna__addressof(FFMpegCodecData.__DNA__FIELD__audio_codec);
	 * CPointer&lt;Integer&gt; p_audio_codec = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audio_codec'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audio_codec = new long[]{8, 8};

	/**
	 * Field descriptor (offset) for struct member 'video_bitrate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FFMpegCodecData ffmpegcodecdata = ...;
	 * CPointer&lt;Object&gt; p = ffmpegcodecdata.__dna__addressof(FFMpegCodecData.__DNA__FIELD__video_bitrate);
	 * CPointer&lt;Integer&gt; p_video_bitrate = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'video_bitrate'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__video_bitrate = new long[]{12, 12};

	/**
	 * Field descriptor (offset) for struct member 'audio_bitrate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FFMpegCodecData ffmpegcodecdata = ...;
	 * CPointer&lt;Object&gt; p = ffmpegcodecdata.__dna__addressof(FFMpegCodecData.__DNA__FIELD__audio_bitrate);
	 * CPointer&lt;Integer&gt; p_audio_bitrate = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audio_bitrate'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audio_bitrate = new long[]{16, 16};

	/**
	 * Field descriptor (offset) for struct member 'audio_mixrate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FFMpegCodecData ffmpegcodecdata = ...;
	 * CPointer&lt;Object&gt; p = ffmpegcodecdata.__dna__addressof(FFMpegCodecData.__DNA__FIELD__audio_mixrate);
	 * CPointer&lt;Integer&gt; p_audio_mixrate = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audio_mixrate'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audio_mixrate = new long[]{20, 20};

	/**
	 * Field descriptor (offset) for struct member 'audio_channels'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FFMpegCodecData ffmpegcodecdata = ...;
	 * CPointer&lt;Object&gt; p = ffmpegcodecdata.__dna__addressof(FFMpegCodecData.__DNA__FIELD__audio_channels);
	 * CPointer&lt;Integer&gt; p_audio_channels = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audio_channels'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audio_channels = new long[]{24, 24};

	/**
	 * Field descriptor (offset) for struct member 'audio_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FFMpegCodecData ffmpegcodecdata = ...;
	 * CPointer&lt;Object&gt; p = ffmpegcodecdata.__dna__addressof(FFMpegCodecData.__DNA__FIELD__audio_pad);
	 * CPointer&lt;Integer&gt; p_audio_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audio_pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audio_pad = new long[]{28, 28};

	/**
	 * Field descriptor (offset) for struct member 'audio_volume'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FFMpegCodecData ffmpegcodecdata = ...;
	 * CPointer&lt;Object&gt; p = ffmpegcodecdata.__dna__addressof(FFMpegCodecData.__DNA__FIELD__audio_volume);
	 * CPointer&lt;Float&gt; p_audio_volume = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'audio_volume'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__audio_volume = new long[]{32, 32};

	/**
	 * Field descriptor (offset) for struct member 'gop_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FFMpegCodecData ffmpegcodecdata = ...;
	 * CPointer&lt;Object&gt; p = ffmpegcodecdata.__dna__addressof(FFMpegCodecData.__DNA__FIELD__gop_size);
	 * CPointer&lt;Integer&gt; p_gop_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gop_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gop_size = new long[]{36, 36};

	/**
	 * Field descriptor (offset) for struct member 'flags'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FFMpegCodecData ffmpegcodecdata = ...;
	 * CPointer&lt;Object&gt; p = ffmpegcodecdata.__dna__addressof(FFMpegCodecData.__DNA__FIELD__flags);
	 * CPointer&lt;Integer&gt; p_flags = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flags'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flags = new long[]{40, 40};

	/**
	 * Field descriptor (offset) for struct member 'rc_min_rate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FFMpegCodecData ffmpegcodecdata = ...;
	 * CPointer&lt;Object&gt; p = ffmpegcodecdata.__dna__addressof(FFMpegCodecData.__DNA__FIELD__rc_min_rate);
	 * CPointer&lt;Integer&gt; p_rc_min_rate = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rc_min_rate'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rc_min_rate = new long[]{44, 44};

	/**
	 * Field descriptor (offset) for struct member 'rc_max_rate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FFMpegCodecData ffmpegcodecdata = ...;
	 * CPointer&lt;Object&gt; p = ffmpegcodecdata.__dna__addressof(FFMpegCodecData.__DNA__FIELD__rc_max_rate);
	 * CPointer&lt;Integer&gt; p_rc_max_rate = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rc_max_rate'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rc_max_rate = new long[]{48, 48};

	/**
	 * Field descriptor (offset) for struct member 'rc_buffer_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FFMpegCodecData ffmpegcodecdata = ...;
	 * CPointer&lt;Object&gt; p = ffmpegcodecdata.__dna__addressof(FFMpegCodecData.__DNA__FIELD__rc_buffer_size);
	 * CPointer&lt;Integer&gt; p_rc_buffer_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rc_buffer_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rc_buffer_size = new long[]{52, 52};

	/**
	 * Field descriptor (offset) for struct member 'mux_packet_size'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FFMpegCodecData ffmpegcodecdata = ...;
	 * CPointer&lt;Object&gt; p = ffmpegcodecdata.__dna__addressof(FFMpegCodecData.__DNA__FIELD__mux_packet_size);
	 * CPointer&lt;Integer&gt; p_mux_packet_size = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mux_packet_size'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mux_packet_size = new long[]{56, 56};

	/**
	 * Field descriptor (offset) for struct member 'mux_rate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FFMpegCodecData ffmpegcodecdata = ...;
	 * CPointer&lt;Object&gt; p = ffmpegcodecdata.__dna__addressof(FFMpegCodecData.__DNA__FIELD__mux_rate);
	 * CPointer&lt;Integer&gt; p_mux_rate = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mux_rate'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mux_rate = new long[]{60, 60};

	/**
	 * Field descriptor (offset) for struct member 'properties'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * FFMpegCodecData ffmpegcodecdata = ...;
	 * CPointer&lt;Object&gt; p = ffmpegcodecdata.__dna__addressof(FFMpegCodecData.__DNA__FIELD__properties);
	 * CPointer&lt;CPointer&lt;IDProperty&gt;&gt; p_properties = p.cast(new Class[]{CPointer.class, IDProperty.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'properties'</li>
	 * <li>Signature: 'IDProperty*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__properties = new long[]{64, 64};

	public FFMpegCodecData(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected FFMpegCodecData(FFMpegCodecData that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public int getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 0);
		} else {
			return __io__block.readInt(__io__address + 0);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(int type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 0, type);
		} else {
			__io__block.writeInt(__io__address + 0, type);
		}
	}

	/**
	 * Get method for struct member 'codec'.
	 * @see #__DNA__FIELD__codec
	 */
	
	public int getCodec() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 4);
		} else {
			return __io__block.readInt(__io__address + 4);
		}
	}

	/**
	 * Set method for struct member 'codec'.
	 * @see #__DNA__FIELD__codec
	 */
	
	public void setCodec(int codec) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 4, codec);
		} else {
			__io__block.writeInt(__io__address + 4, codec);
		}
	}

	/**
	 * Get method for struct member 'audio_codec'.
	 * @see #__DNA__FIELD__audio_codec
	 */
	
	public int getAudio_codec() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 8);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'audio_codec'.
	 * @see #__DNA__FIELD__audio_codec
	 */
	
	public void setAudio_codec(int audio_codec) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 8, audio_codec);
		} else {
			__io__block.writeInt(__io__address + 8, audio_codec);
		}
	}

	/**
	 * Get method for struct member 'video_bitrate'.
	 * @see #__DNA__FIELD__video_bitrate
	 */
	
	public int getVideo_bitrate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 12);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'video_bitrate'.
	 * @see #__DNA__FIELD__video_bitrate
	 */
	
	public void setVideo_bitrate(int video_bitrate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 12, video_bitrate);
		} else {
			__io__block.writeInt(__io__address + 12, video_bitrate);
		}
	}

	/**
	 * Get method for struct member 'audio_bitrate'.
	 * @see #__DNA__FIELD__audio_bitrate
	 */
	
	public int getAudio_bitrate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'audio_bitrate'.
	 * @see #__DNA__FIELD__audio_bitrate
	 */
	
	public void setAudio_bitrate(int audio_bitrate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, audio_bitrate);
		} else {
			__io__block.writeInt(__io__address + 16, audio_bitrate);
		}
	}

	/**
	 * Get method for struct member 'audio_mixrate'.
	 * @see #__DNA__FIELD__audio_mixrate
	 */
	
	public int getAudio_mixrate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'audio_mixrate'.
	 * @see #__DNA__FIELD__audio_mixrate
	 */
	
	public void setAudio_mixrate(int audio_mixrate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, audio_mixrate);
		} else {
			__io__block.writeInt(__io__address + 20, audio_mixrate);
		}
	}

	/**
	 * Get method for struct member 'audio_channels'.
	 * @see #__DNA__FIELD__audio_channels
	 */
	
	public int getAudio_channels() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 24);
		}
	}

	/**
	 * Set method for struct member 'audio_channels'.
	 * @see #__DNA__FIELD__audio_channels
	 */
	
	public void setAudio_channels(int audio_channels) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, audio_channels);
		} else {
			__io__block.writeInt(__io__address + 24, audio_channels);
		}
	}

	/**
	 * Get method for struct member 'audio_pad'.
	 * @see #__DNA__FIELD__audio_pad
	 */
	
	public int getAudio_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 28);
		}
	}

	/**
	 * Set method for struct member 'audio_pad'.
	 * @see #__DNA__FIELD__audio_pad
	 */
	
	public void setAudio_pad(int audio_pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, audio_pad);
		} else {
			__io__block.writeInt(__io__address + 28, audio_pad);
		}
	}

	/**
	 * Get method for struct member 'audio_volume'.
	 * @see #__DNA__FIELD__audio_volume
	 */
	
	public float getAudio_volume() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 32);
		} else {
			return __io__block.readFloat(__io__address + 32);
		}
	}

	/**
	 * Set method for struct member 'audio_volume'.
	 * @see #__DNA__FIELD__audio_volume
	 */
	
	public void setAudio_volume(float audio_volume) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 32, audio_volume);
		} else {
			__io__block.writeFloat(__io__address + 32, audio_volume);
		}
	}

	/**
	 * Get method for struct member 'gop_size'.
	 * @see #__DNA__FIELD__gop_size
	 */
	
	public int getGop_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 36);
		}
	}

	/**
	 * Set method for struct member 'gop_size'.
	 * @see #__DNA__FIELD__gop_size
	 */
	
	public void setGop_size(int gop_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, gop_size);
		} else {
			__io__block.writeInt(__io__address + 36, gop_size);
		}
	}

	/**
	 * Get method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public int getFlags() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 40);
		} else {
			return __io__block.readInt(__io__address + 40);
		}
	}

	/**
	 * Set method for struct member 'flags'.
	 * @see #__DNA__FIELD__flags
	 */
	
	public void setFlags(int flags) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 40, flags);
		} else {
			__io__block.writeInt(__io__address + 40, flags);
		}
	}

	/**
	 * Get method for struct member 'rc_min_rate'.
	 * @see #__DNA__FIELD__rc_min_rate
	 */
	
	public int getRc_min_rate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 44);
		} else {
			return __io__block.readInt(__io__address + 44);
		}
	}

	/**
	 * Set method for struct member 'rc_min_rate'.
	 * @see #__DNA__FIELD__rc_min_rate
	 */
	
	public void setRc_min_rate(int rc_min_rate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 44, rc_min_rate);
		} else {
			__io__block.writeInt(__io__address + 44, rc_min_rate);
		}
	}

	/**
	 * Get method for struct member 'rc_max_rate'.
	 * @see #__DNA__FIELD__rc_max_rate
	 */
	
	public int getRc_max_rate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 48);
		} else {
			return __io__block.readInt(__io__address + 48);
		}
	}

	/**
	 * Set method for struct member 'rc_max_rate'.
	 * @see #__DNA__FIELD__rc_max_rate
	 */
	
	public void setRc_max_rate(int rc_max_rate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 48, rc_max_rate);
		} else {
			__io__block.writeInt(__io__address + 48, rc_max_rate);
		}
	}

	/**
	 * Get method for struct member 'rc_buffer_size'.
	 * @see #__DNA__FIELD__rc_buffer_size
	 */
	
	public int getRc_buffer_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 52);
		} else {
			return __io__block.readInt(__io__address + 52);
		}
	}

	/**
	 * Set method for struct member 'rc_buffer_size'.
	 * @see #__DNA__FIELD__rc_buffer_size
	 */
	
	public void setRc_buffer_size(int rc_buffer_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 52, rc_buffer_size);
		} else {
			__io__block.writeInt(__io__address + 52, rc_buffer_size);
		}
	}

	/**
	 * Get method for struct member 'mux_packet_size'.
	 * @see #__DNA__FIELD__mux_packet_size
	 */
	
	public int getMux_packet_size() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 56);
		} else {
			return __io__block.readInt(__io__address + 56);
		}
	}

	/**
	 * Set method for struct member 'mux_packet_size'.
	 * @see #__DNA__FIELD__mux_packet_size
	 */
	
	public void setMux_packet_size(int mux_packet_size) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 56, mux_packet_size);
		} else {
			__io__block.writeInt(__io__address + 56, mux_packet_size);
		}
	}

	/**
	 * Get method for struct member 'mux_rate'.
	 * @see #__DNA__FIELD__mux_rate
	 */
	
	public int getMux_rate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 60);
		} else {
			return __io__block.readInt(__io__address + 60);
		}
	}

	/**
	 * Set method for struct member 'mux_rate'.
	 * @see #__DNA__FIELD__mux_rate
	 */
	
	public void setMux_rate(int mux_rate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 60, mux_rate);
		} else {
			__io__block.writeInt(__io__address + 60, mux_rate);
		}
	}

	/**
	 * Get method for struct member 'properties'.
	 * @see #__DNA__FIELD__properties
	 */
	
	public CPointer<IDProperty> getProperties() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		}
		Class<?>[] __dna__targetTypes = new Class[]{IDProperty.class};
		return new CPointer<IDProperty>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, IDProperty.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'properties'.
	 * @see #__DNA__FIELD__properties
	 */
	
	public void setProperties(CPointer<IDProperty> properties) throws IOException
	{
		long __address = ((properties == null) ? 0 : properties.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 64, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<FFMpegCodecData> __io__addressof() {
		return new CPointer<FFMpegCodecData>(__io__address, new Class[]{FFMpegCodecData.class}, __io__block, __io__blockTable);
	}

}
