package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.VertexFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreVertexFormatMod {
  
  @JSImport("cesium/Source/Core/VertexFormat", JSImport.Default)
  @js.native
  open class default () extends VertexFormat {
    def this(options: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/VertexFormat", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * An immutable vertex format with well-known attributes: position, normal, st, tangent, and bitangent.
      */
    @JSImport("cesium/Source/Core/VertexFormat", "default.ALL")
    @js.native
    val ALL: VertexFormat = js.native
    
    /**
      * An immutable vertex format with position, normal, and st attributes.
      * This is compatible with most appearances and materials; however
      * normal and st attributes are not always required.  When this is
      * known in advance, another <code>VertexFormat</code> should be used.
      */
    @JSImport("cesium/Source/Core/VertexFormat", "default.DEFAULT")
    @js.native
    val DEFAULT: VertexFormat = js.native
    
    /**
      * An immutable vertex format with position and color attributes.
      */
    @JSImport("cesium/Source/Core/VertexFormat", "default.POSITION_AND_COLOR")
    @js.native
    val POSITION_AND_COLOR: VertexFormat = js.native
    
    /**
      * An immutable vertex format with position and normal attributes.
      * This is compatible with per-instance color appearances like {@link PerInstanceColorAppearance}.
      */
    @JSImport("cesium/Source/Core/VertexFormat", "default.POSITION_AND_NORMAL")
    @js.native
    val POSITION_AND_NORMAL: VertexFormat = js.native
    
    /**
      * An immutable vertex format with position and st attributes.
      * This is compatible with {@link EllipsoidSurfaceAppearance}.
      */
    @JSImport("cesium/Source/Core/VertexFormat", "default.POSITION_AND_ST")
    @js.native
    val POSITION_AND_ST: VertexFormat = js.native
    
    /**
      * An immutable vertex format with position, normal, and st attributes.
      * This is compatible with {@link MaterialAppearance} when {@link MaterialAppearance#materialSupport}
      * is <code>TEXTURED/code>.
      */
    @JSImport("cesium/Source/Core/VertexFormat", "default.POSITION_NORMAL_AND_ST")
    @js.native
    val POSITION_NORMAL_AND_ST: VertexFormat = js.native
    
    /**
      * An immutable vertex format with only a position attribute.
      */
    @JSImport("cesium/Source/Core/VertexFormat", "default.POSITION_ONLY")
    @js.native
    val POSITION_ONLY: VertexFormat = js.native
    
    /**
      * Duplicates a VertexFormat instance.
      * @param vertexFormat - The vertex format to duplicate.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new VertexFormat instance if one was not provided. (Returns undefined if vertexFormat is undefined)
      */
    inline def clone(vertexFormat: VertexFormat): VertexFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(vertexFormat.asInstanceOf[js.Any]).asInstanceOf[VertexFormat]
    inline def clone(vertexFormat: VertexFormat, result: VertexFormat): VertexFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(vertexFormat.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[VertexFormat]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: VertexFormat, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: VertexFormat, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/VertexFormat", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new VertexFormat instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): VertexFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[VertexFormat]
    inline def unpack(array: js.Array[Double], startingIndex: Double): VertexFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[VertexFormat]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: VertexFormat): VertexFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[VertexFormat]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: VertexFormat): VertexFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[VertexFormat]
  }
}
