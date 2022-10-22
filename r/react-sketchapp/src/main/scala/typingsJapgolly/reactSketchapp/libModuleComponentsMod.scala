package typingsJapgolly.reactSketchapp

import typingsJapgolly.reactSketchapp.anon.Children
import typingsJapgolly.reactSketchapp.anon.ChildrenRequireable
import typingsJapgolly.reactSketchapp.anon.DefaultSource
import typingsJapgolly.reactSketchapp.anon.Error
import typingsJapgolly.reactSketchapp.anon.Flow
import typingsJapgolly.reactSketchapp.anon.Name
import typingsJapgolly.reactSketchapp.anon.PreserveAspectRatioString
import typingsJapgolly.reactSketchapp.anon.ResizingConstraint
import typingsJapgolly.reactSketchapp.anon.Shadows
import typingsJapgolly.reactSketchapp.anon.Style
import typingsJapgolly.reactSketchapp.anon.TypeofCircleInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofClipPathInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofDefsInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofEllipseInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofGInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofImageInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofLineInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofLinearGradientInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofPathInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofPatternInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofPolygonInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofPolylineInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofRadialGradientInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofRectInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofStopInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofSymbolInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofTSpanInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofTextInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofTextPathInstantiable
import typingsJapgolly.reactSketchapp.anon.TypeofUseInstantiable
import typingsJapgolly.reactSketchapp.anon.UseColumns
import typingsJapgolly.reactSketchapp.libModuleComponentsArtboardMod.Props
import typingsJapgolly.reactSketchapp.libModuleComponentsSvgMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleComponentsMod {
  
  @JSImport("react-sketchapp/lib/module/components", "Artboard")
  @js.native
  open class Artboard protected ()
    extends typingsJapgolly.reactSketchapp.libModuleComponentsArtboardMod.Artboard {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Artboard {
    
    @JSImport("react-sketchapp/lib/module/components", "Artboard")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components", "Artboard.defaultProps")
    @js.native
    def defaultProps: Name = js.native
    inline def defaultProps_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Artboard.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/module/components", "Document")
  @js.native
  open class Document protected ()
    extends typingsJapgolly.reactSketchapp.libModuleComponentsDocumentMod.Document {
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsDocumentMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsDocumentMod.Props, context: Any) = this()
  }
  /* static members */
  object Document {
    
    @JSImport("react-sketchapp/lib/module/components", "Document")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components", "Document.propTypes")
    @js.native
    def propTypes: ChildrenRequireable = js.native
    inline def propTypes_=(x: ChildrenRequireable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/module/components", "Image")
  @js.native
  open class Image protected ()
    extends typingsJapgolly.reactSketchapp.libModuleComponentsImageMod.Image {
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsImageMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsImageMod.Props, context: Any) = this()
  }
  /* static members */
  object Image {
    
    @JSImport("react-sketchapp/lib/module/components", "Image")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components", "Image.defaultProps")
    @js.native
    def defaultProps: Name = js.native
    inline def defaultProps_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Image.propTypes")
    @js.native
    def propTypes: DefaultSource = js.native
    inline def propTypes_=(x: DefaultSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/module/components", "Page")
  @js.native
  open class Page protected ()
    extends typingsJapgolly.reactSketchapp.libModuleComponentsPageMod.Page {
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsPageMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsPageMod.Props, context: Any) = this()
  }
  /* static members */
  object Page {
    
    @JSImport("react-sketchapp/lib/module/components", "Page")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components", "Page.propTypes")
    @js.native
    def propTypes: Style = js.native
    inline def propTypes_=(x: Style): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/module/components", "RedBox")
  @js.native
  open class RedBox protected ()
    extends typingsJapgolly.reactSketchapp.libModuleComponentsRedBoxMod.RedBox {
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsRedBoxMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsRedBoxMod.Props, context: Any) = this()
  }
  /* static members */
  object RedBox {
    
    @JSImport("react-sketchapp/lib/module/components", "RedBox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components", "RedBox.defaultProps")
    @js.native
    def defaultProps: UseColumns = js.native
    inline def defaultProps_=(x: UseColumns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "RedBox.propTypes")
    @js.native
    def propTypes: Error = js.native
    inline def propTypes_=(x: Error): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/module/components", "Svg")
  @js.native
  open class Svg protected () extends default {
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsSvgSvgMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsSvgSvgMod.Props, context: Any) = this()
  }
  /* static members */
  object Svg {
    
    @JSImport("react-sketchapp/lib/module/components", "Svg")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.Circle")
    @js.native
    def Circle: TypeofCircleInstantiable = js.native
    inline def Circle_=(x: TypeofCircleInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.ClipPath")
    @js.native
    def ClipPath: TypeofClipPathInstantiable = js.native
    inline def ClipPath_=(x: TypeofClipPathInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClipPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.Defs")
    @js.native
    def Defs: TypeofDefsInstantiable = js.native
    inline def Defs_=(x: TypeofDefsInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Defs")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.Ellipse")
    @js.native
    def Ellipse: TypeofEllipseInstantiable = js.native
    inline def Ellipse_=(x: TypeofEllipseInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ellipse")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.G")
    @js.native
    def G: TypeofGInstantiable = js.native
    inline def G_=(x: TypeofGInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("G")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.Image")
    @js.native
    def Image: TypeofImageInstantiable = js.native
    inline def Image_=(x: TypeofImageInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.Line")
    @js.native
    def Line: TypeofLineInstantiable = js.native
    inline def Line_=(x: TypeofLineInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.LinearGradient")
    @js.native
    def LinearGradient: TypeofLinearGradientInstantiable = js.native
    inline def LinearGradient_=(x: TypeofLinearGradientInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LinearGradient")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.Path")
    @js.native
    def Path: TypeofPathInstantiable = js.native
    inline def Path_=(x: TypeofPathInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.Pattern")
    @js.native
    def Pattern: TypeofPatternInstantiable = js.native
    inline def Pattern_=(x: TypeofPatternInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.Polygon")
    @js.native
    def Polygon: TypeofPolygonInstantiable = js.native
    inline def Polygon_=(x: TypeofPolygonInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Polygon")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.Polyline")
    @js.native
    def Polyline: TypeofPolylineInstantiable = js.native
    inline def Polyline_=(x: TypeofPolylineInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Polyline")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.RadialGradient")
    @js.native
    def RadialGradient: TypeofRadialGradientInstantiable = js.native
    inline def RadialGradient_=(x: TypeofRadialGradientInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RadialGradient")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.Rect")
    @js.native
    def Rect: TypeofRectInstantiable = js.native
    inline def Rect_=(x: TypeofRectInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rect")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.Stop")
    @js.native
    def Stop: TypeofStopInstantiable = js.native
    inline def Stop_=(x: TypeofStopInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stop")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.Symbol")
    @js.native
    val Symbol: TypeofSymbolInstantiable = js.native
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.TSpan")
    @js.native
    def TSpan: TypeofTSpanInstantiable = js.native
    inline def TSpan_=(x: TypeofTSpanInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSpan")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.Text")
    @js.native
    def Text: TypeofTextInstantiable = js.native
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.TextPath")
    @js.native
    def TextPath: TypeofTextPathInstantiable = js.native
    inline def TextPath_=(x: TypeofTextPathInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextPath")(x.asInstanceOf[js.Any])
    
    inline def Text_=(x: TypeofTextInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.Use")
    @js.native
    def Use: TypeofUseInstantiable = js.native
    inline def Use_=(x: TypeofUseInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Use")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.defaultProps")
    @js.native
    def defaultProps: PreserveAspectRatioString = js.native
    inline def defaultProps_=(x: PreserveAspectRatioString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "Svg.propTypes")
    @js.native
    def propTypes: Flow = js.native
    inline def propTypes_=(x: Flow): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/module/components", "Text")
  @js.native
  open class Text protected ()
    extends typingsJapgolly.reactSketchapp.libModuleComponentsTextMod.Text {
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsTextMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsTextMod.Props, context: Any) = this()
  }
  /* static members */
  object Text {
    
    @JSImport("react-sketchapp/lib/module/components", "Text")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components", "Text.propTypes")
    @js.native
    def propTypes: ResizingConstraint = js.native
    inline def propTypes_=(x: ResizingConstraint): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/module/components", "View")
  @js.native
  open class View protected ()
    extends typingsJapgolly.reactSketchapp.libModuleComponentsViewMod.View {
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsViewMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsViewMod.Props, context: Any) = this()
  }
  /* static members */
  object View {
    
    @JSImport("react-sketchapp/lib/module/components", "View")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components", "View.defaultProps")
    @js.native
    def defaultProps: Name = js.native
    inline def defaultProps_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components", "View.propTypes")
    @js.native
    def propTypes: Shadows = js.native
    inline def propTypes_=(x: Shadows): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
