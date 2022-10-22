package typingsJapgolly.openlayers.global.ol

import typingsJapgolly.openlayers.mod.StyleImageOptions
import typingsJapgolly.openlayers.mod.olx.style.AtlasManagerOptions
import typingsJapgolly.openlayers.mod.olx.style.CircleOptions
import typingsJapgolly.openlayers.mod.olx.style.FillOptions
import typingsJapgolly.openlayers.mod.olx.style.IconOptions
import typingsJapgolly.openlayers.mod.olx.style.RegularShapeOptions
import typingsJapgolly.openlayers.mod.olx.style.StrokeOptions
import typingsJapgolly.openlayers.mod.olx.style.StyleOptions
import typingsJapgolly.openlayers.mod.olx.style.TextOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object style {
  
  /**
    * Manages the creation of image atlases.
    *
    * Images added to this manager will be inserted into an atlas, which
    * will be used for rendering.
    * The `size` given in the constructor is the size for the first
    * atlas. After that, when new atlases are created, they will have
    * twice the size as the latest atlas (until `maxSize` is reached).
    *
    * If an application uses many images or very large images, it is recommended
    * to set a higher `size` value to avoid the creation of too many atlases.
    *
    * @struct
    * @api
    * @param opt_options Options.
    */
  /* tslint:disable-next-line:no-unnecessary-class */
  @JSGlobal("ol.style.AtlasManager")
  @js.native
  /**
    * Manages the creation of image atlases.
    *
    * Images added to this manager will be inserted into an atlas, which
    * will be used for rendering.
    * The `size` given in the constructor is the size for the first
    * atlas. After that, when new atlases are created, they will have
    * twice the size as the latest atlas (until `maxSize` is reached).
    *
    * If an application uses many images or very large images, it is recommended
    * to set a higher `size` value to avoid the creation of too many atlases.
    *
    * @struct
    * @api
    * @param opt_options Options.
    */
  open class AtlasManager ()
    extends typingsJapgolly.openlayers.mod.style.AtlasManager {
    def this(opt_options: AtlasManagerOptions) = this()
  }
  
  /**
    * @classdesc
    * Set circle style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  @JSGlobal("ol.style.Circle")
  @js.native
  /**
    * @classdesc
    * Set circle style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  open class Circle ()
    extends typingsJapgolly.openlayers.mod.style.Circle {
    def this(opt_options: CircleOptions) = this()
  }
  
  /**
    * @classdesc
    * Set fill style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  @JSGlobal("ol.style.Fill")
  @js.native
  /**
    * @classdesc
    * Set fill style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  open class Fill ()
    extends typingsJapgolly.openlayers.mod.style.Fill {
    def this(opt_options: FillOptions) = this()
  }
  
  /**
    * @classdesc
    * Set icon style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  @JSGlobal("ol.style.Icon")
  @js.native
  /**
    * @classdesc
    * Set icon style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  open class Icon ()
    extends typingsJapgolly.openlayers.mod.style.Icon {
    def this(opt_options: IconOptions) = this()
  }
  
  /**
    * @classdesc
    * A base class used for creating subclasses and not instantiated in
    * apps. Base class for {@link ol.style.Icon}, {@link ol.style.Circle} and
    * {@link ol.style.RegularShape}.
    *
    * @param options Options.
    * @api
    */
  @JSGlobal("ol.style.Image")
  @js.native
  open class Image protected ()
    extends typingsJapgolly.openlayers.mod.style.Image {
    /**
      * @classdesc
      * A base class used for creating subclasses and not instantiated in
      * apps. Base class for {@link ol.style.Icon}, {@link ol.style.Circle} and
      * {@link ol.style.RegularShape}.
      *
      * @param options Options.
      * @api
      */
    def this(options: StyleImageOptions) = this()
  }
  
  /**
    * @classdesc
    * Set regular shape style for vector features. The resulting shape will be
    * a regular polygon when `radius` is provided, or a star when `radius1` and
    * `radius2` are provided.
    *
    * @param options Options.
    * @api
    */
  @JSGlobal("ol.style.RegularShape")
  @js.native
  open class RegularShape protected ()
    extends typingsJapgolly.openlayers.mod.style.RegularShape {
    /**
      * @classdesc
      * Set regular shape style for vector features. The resulting shape will be
      * a regular polygon when `radius` is provided, or a star when `radius1` and
      * `radius2` are provided.
      *
      * @param options Options.
      * @api
      */
    def this(options: RegularShapeOptions) = this()
  }
  
  /**
    * @classdesc
    * Set stroke style for vector features.
    * Note that the defaults given are the Canvas defaults, which will be used if
    * option is not defined. The `get` functions return whatever was entered in
    * the options; they will not return the default.
    *
    * @param opt_options Options.
    * @api
    */
  @JSGlobal("ol.style.Stroke")
  @js.native
  /**
    * @classdesc
    * Set stroke style for vector features.
    * Note that the defaults given are the Canvas defaults, which will be used if
    * option is not defined. The `get` functions return whatever was entered in
    * the options; they will not return the default.
    *
    * @param opt_options Options.
    * @api
    */
  open class Stroke ()
    extends typingsJapgolly.openlayers.mod.style.Stroke {
    def this(opt_options: StrokeOptions) = this()
  }
  
  /**
    * @classdesc
    * Container for vector feature rendering styles. Any changes made to the style
    * or its children through `set*()` methods will not take effect until the
    * feature or layer that uses the style is re-rendered.
    *
    * @struct
    * @param opt_options Style options.
    * @api
    */
  @JSGlobal("ol.style.Style")
  @js.native
  /**
    * @classdesc
    * Container for vector feature rendering styles. Any changes made to the style
    * or its children through `set*()` methods will not take effect until the
    * feature or layer that uses the style is re-rendered.
    *
    * @struct
    * @param opt_options Style options.
    * @api
    */
  open class Style ()
    extends typingsJapgolly.openlayers.mod.style.Style {
    def this(opt_options: StyleOptions) = this()
  }
  
  /**
    * @classdesc
    * Set text style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  @JSGlobal("ol.style.Text")
  @js.native
  /**
    * @classdesc
    * Set text style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  open class Text ()
    extends typingsJapgolly.openlayers.mod.style.Text {
    def this(opt_options: TextOptions) = this()
  }
}
