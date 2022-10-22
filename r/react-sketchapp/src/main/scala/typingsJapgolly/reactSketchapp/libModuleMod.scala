package typingsJapgolly.reactSketchapp

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactSketchapp.anon.Children
import typingsJapgolly.reactSketchapp.anon.ChildrenRequireable
import typingsJapgolly.reactSketchapp.anon.CssStyle
import typingsJapgolly.reactSketchapp.anon.DefaultSource
import typingsJapgolly.reactSketchapp.anon.Error
import typingsJapgolly.reactSketchapp.anon.Flow
import typingsJapgolly.reactSketchapp.anon.Instantiable
import typingsJapgolly.reactSketchapp.anon.Name
import typingsJapgolly.reactSketchapp.anon.PreserveAspectRatioString
import typingsJapgolly.reactSketchapp.anon.ResizingConstraint
import typingsJapgolly.reactSketchapp.anon.Scale
import typingsJapgolly.reactSketchapp.anon.Shadows
import typingsJapgolly.reactSketchapp.anon.Sketch
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
import typingsJapgolly.reactSketchapp.anon.`1`
import typingsJapgolly.reactSketchapp.libModuleComponentsArtboardMod.Props
import typingsJapgolly.reactSketchapp.libModuleStylesheetTypesMod.RawStyle
import typingsJapgolly.reactSketchapp.libModuleStylesheetTypesMod.RawStyles
import typingsJapgolly.reactSketchapp.libModuleStylesheetTypesMod.StyleSheetInstance
import typingsJapgolly.reactSketchapp.libModuleStylesheetTypesMod.UserStyle
import typingsJapgolly.reactSketchapp.libModuleSymbolMod.SymbolMasterProps
import typingsJapgolly.reactSketchapp.libModuleTypesMod.PlatformBridge
import typingsJapgolly.reactSketchapp.libModuleTypesMod.SketchDocument
import typingsJapgolly.reactSketchapp.libModuleTypesMod.SketchDocumentData
import typingsJapgolly.reactSketchapp.libModuleTypesMod.SketchLayer
import typingsJapgolly.reactSketchapp.libModuleTypesMod.WrappedSketchDocument
import typingsJapgolly.reactSketchapp.libModuleTypesMod.WrappedSketchLayer
import typingsJapgolly.reactSketchapp.libTypesMod.TextStyle
import typingsJapgolly.reactSketchapp.reactSketchappStrings.NodeJS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleMod {
  
  @JSImport("react-sketchapp/lib/module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/module", "Artboard")
  @js.native
  open class Artboard protected ()
    extends typingsJapgolly.reactSketchapp.libModuleComponentsMod.Artboard {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Artboard {
    
    @JSImport("react-sketchapp/lib/module", "Artboard")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module", "Artboard.defaultProps")
    @js.native
    def defaultProps: Name = js.native
    inline def defaultProps_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Artboard.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/module", "Document")
  @js.native
  open class Document protected ()
    extends typingsJapgolly.reactSketchapp.libModuleComponentsMod.Document {
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsDocumentMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsDocumentMod.Props, context: Any) = this()
  }
  /* static members */
  object Document {
    
    @JSImport("react-sketchapp/lib/module", "Document")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module", "Document.propTypes")
    @js.native
    def propTypes: ChildrenRequireable = js.native
    inline def propTypes_=(x: ChildrenRequireable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/module", "Image")
  @js.native
  open class Image protected ()
    extends typingsJapgolly.reactSketchapp.libModuleComponentsMod.Image {
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsImageMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsImageMod.Props, context: Any) = this()
  }
  /* static members */
  object Image {
    
    @JSImport("react-sketchapp/lib/module", "Image")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module", "Image.defaultProps")
    @js.native
    def defaultProps: Name = js.native
    inline def defaultProps_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Image.propTypes")
    @js.native
    def propTypes: DefaultSource = js.native
    inline def propTypes_=(x: DefaultSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/module", "Page")
  @js.native
  open class Page protected ()
    extends typingsJapgolly.reactSketchapp.libModuleComponentsMod.Page {
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsPageMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsPageMod.Props, context: Any) = this()
  }
  /* static members */
  object Page {
    
    @JSImport("react-sketchapp/lib/module", "Page")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module", "Page.propTypes")
    @js.native
    def propTypes: Style = js.native
    inline def propTypes_=(x: Style): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  object Platform {
    
    @JSImport("react-sketchapp/lib/module", "Platform")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module", "Platform.OS")
    @js.native
    def OS: String = js.native
    inline def OS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OS")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Platform.Version")
    @js.native
    def Version: Double | NodeJS = js.native
    inline def Version_=(x: Double | NodeJS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Version")(x.asInstanceOf[js.Any])
    
    inline def select(obj: Sketch): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  @JSImport("react-sketchapp/lib/module", "RedBox")
  @js.native
  open class RedBox protected ()
    extends typingsJapgolly.reactSketchapp.libModuleComponentsMod.RedBox {
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsRedBoxMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsRedBoxMod.Props, context: Any) = this()
  }
  /* static members */
  object RedBox {
    
    @JSImport("react-sketchapp/lib/module", "RedBox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module", "RedBox.defaultProps")
    @js.native
    def defaultProps: UseColumns = js.native
    inline def defaultProps_=(x: UseColumns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "RedBox.propTypes")
    @js.native
    def propTypes: Error = js.native
    inline def propTypes_=(x: Error): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  object StyleSheet {
    
    @JSImport("react-sketchapp/lib/module", "StyleSheet")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module", "StyleSheet.absoluteFill")
    @js.native
    def absoluteFill: Double = js.native
    inline def absoluteFill_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("absoluteFill")(x.asInstanceOf[js.Any])
    
    inline def create(styles: RawStyles): StyleSheetInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any]).asInstanceOf[StyleSheetInstance]
    
    inline def flatten(): js.UndefOr[typingsJapgolly.reactSketchapp.libModuleStylesheetTypesMod.Style] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[js.UndefOr[typingsJapgolly.reactSketchapp.libModuleStylesheetTypesMod.Style]]
    inline def flatten(input: js.Array[UserStyle]): js.UndefOr[typingsJapgolly.reactSketchapp.libModuleStylesheetTypesMod.Style] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.reactSketchapp.libModuleStylesheetTypesMod.Style]]
    inline def flatten(input: Double): js.UndefOr[typingsJapgolly.reactSketchapp.libModuleStylesheetTypesMod.Style] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.reactSketchapp.libModuleStylesheetTypesMod.Style]]
    inline def flatten(input: RawStyle): js.UndefOr[typingsJapgolly.reactSketchapp.libModuleStylesheetTypesMod.Style] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.reactSketchapp.libModuleStylesheetTypesMod.Style]]
    
    @JSImport("react-sketchapp/lib/module", "StyleSheet.hairlineWidth")
    @js.native
    def hairlineWidth: Double = js.native
    inline def hairlineWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hairlineWidth")(x.asInstanceOf[js.Any])
    
    inline def resolve(style: UserStyle): `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(style.asInstanceOf[js.Any]).asInstanceOf[`1`]
  }
  
  @JSImport("react-sketchapp/lib/module", "Svg")
  @js.native
  open class Svg protected ()
    extends typingsJapgolly.reactSketchapp.libModuleComponentsMod.Svg {
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsSvgSvgMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsSvgSvgMod.Props, context: Any) = this()
  }
  /* static members */
  object Svg {
    
    @JSImport("react-sketchapp/lib/module", "Svg")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module", "Svg.Circle")
    @js.native
    def Circle: TypeofCircleInstantiable = js.native
    inline def Circle_=(x: TypeofCircleInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.ClipPath")
    @js.native
    def ClipPath: TypeofClipPathInstantiable = js.native
    inline def ClipPath_=(x: TypeofClipPathInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClipPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.Defs")
    @js.native
    def Defs: TypeofDefsInstantiable = js.native
    inline def Defs_=(x: TypeofDefsInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Defs")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.Ellipse")
    @js.native
    def Ellipse: TypeofEllipseInstantiable = js.native
    inline def Ellipse_=(x: TypeofEllipseInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ellipse")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.G")
    @js.native
    def G: TypeofGInstantiable = js.native
    inline def G_=(x: TypeofGInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("G")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.Image")
    @js.native
    def Image: TypeofImageInstantiable = js.native
    inline def Image_=(x: TypeofImageInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.Line")
    @js.native
    def Line: TypeofLineInstantiable = js.native
    inline def Line_=(x: TypeofLineInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.LinearGradient")
    @js.native
    def LinearGradient: TypeofLinearGradientInstantiable = js.native
    inline def LinearGradient_=(x: TypeofLinearGradientInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LinearGradient")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.Path")
    @js.native
    def Path: TypeofPathInstantiable = js.native
    inline def Path_=(x: TypeofPathInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.Pattern")
    @js.native
    def Pattern: TypeofPatternInstantiable = js.native
    inline def Pattern_=(x: TypeofPatternInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.Polygon")
    @js.native
    def Polygon: TypeofPolygonInstantiable = js.native
    inline def Polygon_=(x: TypeofPolygonInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Polygon")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.Polyline")
    @js.native
    def Polyline: TypeofPolylineInstantiable = js.native
    inline def Polyline_=(x: TypeofPolylineInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Polyline")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.RadialGradient")
    @js.native
    def RadialGradient: TypeofRadialGradientInstantiable = js.native
    inline def RadialGradient_=(x: TypeofRadialGradientInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RadialGradient")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.Rect")
    @js.native
    def Rect: TypeofRectInstantiable = js.native
    inline def Rect_=(x: TypeofRectInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rect")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.Stop")
    @js.native
    def Stop: TypeofStopInstantiable = js.native
    inline def Stop_=(x: TypeofStopInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stop")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.Symbol")
    @js.native
    val Symbol: TypeofSymbolInstantiable = js.native
    
    @JSImport("react-sketchapp/lib/module", "Svg.TSpan")
    @js.native
    def TSpan: TypeofTSpanInstantiable = js.native
    inline def TSpan_=(x: TypeofTSpanInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSpan")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.Text")
    @js.native
    def Text: TypeofTextInstantiable = js.native
    
    @JSImport("react-sketchapp/lib/module", "Svg.TextPath")
    @js.native
    def TextPath: TypeofTextPathInstantiable = js.native
    inline def TextPath_=(x: TypeofTextPathInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextPath")(x.asInstanceOf[js.Any])
    
    inline def Text_=(x: TypeofTextInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.Use")
    @js.native
    def Use: TypeofUseInstantiable = js.native
    inline def Use_=(x: TypeofUseInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Use")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.defaultProps")
    @js.native
    def defaultProps: PreserveAspectRatioString = js.native
    inline def defaultProps_=(x: PreserveAspectRatioString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "Svg.propTypes")
    @js.native
    def propTypes: Flow = js.native
    inline def propTypes_=(x: Flow): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/module", "Text")
  @js.native
  open class Text protected ()
    extends typingsJapgolly.reactSketchapp.libModuleComponentsMod.Text {
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsTextMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsTextMod.Props, context: Any) = this()
  }
  /* static members */
  object Text {
    
    @JSImport("react-sketchapp/lib/module", "Text")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module", "Text.propTypes")
    @js.native
    def propTypes: ResizingConstraint = js.native
    inline def propTypes_=(x: ResizingConstraint): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  object TextStyles {
    
    @JSImport("react-sketchapp/lib/module", "TextStyles")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    inline def create(styles: StringDictionary[TextStyle]): StringDictionary[CssStyle] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[CssStyle]]
    inline def create(styles: StringDictionary[TextStyle], options: Unit, platformBridge: PlatformBridge): StringDictionary[CssStyle] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], platformBridge.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[CssStyle]]
    inline def create(styles: StringDictionary[TextStyle], options: typingsJapgolly.reactSketchapp.anon.Document): StringDictionary[CssStyle] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[CssStyle]]
    inline def create(
      styles: StringDictionary[TextStyle],
      options: typingsJapgolly.reactSketchapp.anon.Document,
      platformBridge: PlatformBridge
    ): StringDictionary[CssStyle] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], platformBridge.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[CssStyle]]
    
    inline def get(name: String): js.UndefOr[TextStyle] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TextStyle]]
    inline def get(name: String, document: SketchDocument): js.UndefOr[TextStyle] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TextStyle]]
    inline def get(name: String, document: SketchDocumentData): js.UndefOr[TextStyle] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TextStyle]]
    inline def get(name: String, document: WrappedSketchDocument): js.UndefOr[TextStyle] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TextStyle]]
    
    inline def registerStyle(name: String, style: TextStyle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerStyle")(name.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerStyle(name: String, style: TextStyle, platformBridge: PlatformBridge): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerStyle")(name.asInstanceOf[js.Any], style.asInstanceOf[js.Any], platformBridge.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def resolve(): js.UndefOr[CssStyle] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[js.UndefOr[CssStyle]]
    inline def resolve(style: TextStyle): js.UndefOr[CssStyle] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(style.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CssStyle]]
    
    inline def styles(): StringDictionary[CssStyle] = ^.asInstanceOf[js.Dynamic].applyDynamic("styles")().asInstanceOf[StringDictionary[CssStyle]]
    
    inline def toJSON(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_v1-types.SharedStyle */ Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")().asInstanceOf[js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_v1-types.SharedStyle */ Any
      ]]
  }
  
  @JSImport("react-sketchapp/lib/module", "View")
  @js.native
  open class View protected ()
    extends typingsJapgolly.reactSketchapp.libModuleComponentsMod.View {
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsViewMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libModuleComponentsViewMod.Props, context: Any) = this()
  }
  /* static members */
  object View {
    
    @JSImport("react-sketchapp/lib/module", "View")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module", "View.defaultProps")
    @js.native
    def defaultProps: Name = js.native
    inline def defaultProps_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module", "View.propTypes")
    @js.native
    def propTypes: Shadows = js.native
    inline def propTypes_=(x: Shadows): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  inline def getSymbolComponentByName(masterName: String): js.UndefOr[Instantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSymbolComponentByName")(masterName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Instantiable]]
  inline def getSymbolComponentByName(masterName: String, document: SketchDocument): js.UndefOr[Instantiable] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSymbolComponentByName")(masterName.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Instantiable]]
  inline def getSymbolComponentByName(masterName: String, document: SketchDocumentData): js.UndefOr[Instantiable] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSymbolComponentByName")(masterName.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Instantiable]]
  inline def getSymbolComponentByName(masterName: String, document: WrappedSketchDocument): js.UndefOr[Instantiable] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSymbolComponentByName")(masterName.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Instantiable]]
  
  inline def getSymbolMasterByName(name: String): js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSymbolMasterByName")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
  ]]
  inline def getSymbolMasterByName(name: String, document: SketchDocument): js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSymbolMasterByName")(name.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
  ]]
  inline def getSymbolMasterByName(name: String, document: SketchDocumentData): js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSymbolMasterByName")(name.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
  ]]
  inline def getSymbolMasterByName(name: String, document: WrappedSketchDocument): js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSymbolMasterByName")(name.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
  ]]
  
  inline def injectSymbols(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectSymbols")().asInstanceOf[Unit]
  inline def injectSymbols(document: SketchDocument): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectSymbols")(document.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def injectSymbols(document: SketchDocumentData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectSymbols")(document.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def injectSymbols(document: WrappedSketchDocument): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectSymbols")(document.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: String): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: String, document: Unit, bridge: PlatformBridge): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any], bridge.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: String, document: SketchDocument): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: String, document: SketchDocumentData): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(
    Component: ComponentType[Any],
    symbolProps: String,
    document: SketchDocumentData,
    bridge: PlatformBridge
  ): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any], bridge.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(
    Component: ComponentType[Any],
    symbolProps: String,
    document: SketchDocument,
    bridge: PlatformBridge
  ): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any], bridge.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: String, document: WrappedSketchDocument): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(
    Component: ComponentType[Any],
    symbolProps: String,
    document: WrappedSketchDocument,
    bridge: PlatformBridge
  ): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any], bridge.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: SymbolMasterProps): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(
    Component: ComponentType[Any],
    symbolProps: SymbolMasterProps,
    document: Unit,
    bridge: PlatformBridge
  ): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any], bridge.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: SymbolMasterProps, document: SketchDocument): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: SymbolMasterProps, document: SketchDocumentData): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(
    Component: ComponentType[Any],
    symbolProps: SymbolMasterProps,
    document: SketchDocumentData,
    bridge: PlatformBridge
  ): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any], bridge.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(
    Component: ComponentType[Any],
    symbolProps: SymbolMasterProps,
    document: SketchDocument,
    bridge: PlatformBridge
  ): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any], bridge.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: SymbolMasterProps, document: WrappedSketchDocument): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(
    Component: ComponentType[Any],
    symbolProps: SymbolMasterProps,
    document: WrappedSketchDocument,
    bridge: PlatformBridge
  ): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any], bridge.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  
  inline def render(element: Element): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def render(element: Element, container: Unit, platformBridge: PlatformBridge): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], platformBridge.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def render(element: Element, container: SketchLayer): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def render(element: Element, container: SketchLayer, platformBridge: PlatformBridge): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], platformBridge.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def render(element: Element, container: WrappedSketchLayer): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def render(element: Element, container: WrappedSketchLayer, platformBridge: PlatformBridge): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], platformBridge.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def renderToJSON(element: Element): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToJSON")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def renderToJSON(element: Element, platformBridge: PlatformBridge): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToJSON")(element.asInstanceOf[js.Any], platformBridge.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def useWindowDimensions(): Scale = ^.asInstanceOf[js.Dynamic].applyDynamic("useWindowDimensions")().asInstanceOf[Scale]
}
