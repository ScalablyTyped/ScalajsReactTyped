package typingsJapgolly.reactSketchapp

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactSketchapp.anon.Children
import typingsJapgolly.reactSketchapp.anon.ChildrenRequireable
import typingsJapgolly.reactSketchapp.anon.ClearExistingStyles
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
import typingsJapgolly.reactSketchapp.anon.TypeofCircle
import typingsJapgolly.reactSketchapp.anon.TypeofClipPath
import typingsJapgolly.reactSketchapp.anon.TypeofDefs
import typingsJapgolly.reactSketchapp.anon.TypeofEllipse
import typingsJapgolly.reactSketchapp.anon.TypeofG
import typingsJapgolly.reactSketchapp.anon.TypeofImage
import typingsJapgolly.reactSketchapp.anon.TypeofLine
import typingsJapgolly.reactSketchapp.anon.TypeofLinearGradient
import typingsJapgolly.reactSketchapp.anon.TypeofPath
import typingsJapgolly.reactSketchapp.anon.TypeofPattern
import typingsJapgolly.reactSketchapp.anon.TypeofPolygon
import typingsJapgolly.reactSketchapp.anon.TypeofPolyline
import typingsJapgolly.reactSketchapp.anon.TypeofRadialGradient
import typingsJapgolly.reactSketchapp.anon.TypeofRect
import typingsJapgolly.reactSketchapp.anon.TypeofStop
import typingsJapgolly.reactSketchapp.anon.TypeofSymbol
import typingsJapgolly.reactSketchapp.anon.TypeofTSpan
import typingsJapgolly.reactSketchapp.anon.TypeofText
import typingsJapgolly.reactSketchapp.anon.TypeofTextPath
import typingsJapgolly.reactSketchapp.anon.TypeofUse
import typingsJapgolly.reactSketchapp.anon.UseColumns
import typingsJapgolly.reactSketchapp.anon.`0`
import typingsJapgolly.reactSketchapp.libComponentsArtboardMod.Props
import typingsJapgolly.reactSketchapp.libStylesheetTypesMod.RawStyle
import typingsJapgolly.reactSketchapp.libStylesheetTypesMod.RawStyles
import typingsJapgolly.reactSketchapp.libStylesheetTypesMod.StyleSheetInstance
import typingsJapgolly.reactSketchapp.libStylesheetTypesMod.UserStyle
import typingsJapgolly.reactSketchapp.libSymbolMod.SymbolMasterProps
import typingsJapgolly.reactSketchapp.libTypesMod.PlatformBridge
import typingsJapgolly.reactSketchapp.libTypesMod.SketchDocument
import typingsJapgolly.reactSketchapp.libTypesMod.SketchDocumentData
import typingsJapgolly.reactSketchapp.libTypesMod.SketchLayer
import typingsJapgolly.reactSketchapp.libTypesMod.TextStyle
import typingsJapgolly.reactSketchapp.libTypesMod.WrappedSketchDocument
import typingsJapgolly.reactSketchapp.libTypesMod.WrappedSketchLayer
import typingsJapgolly.reactSketchapp.reactSketchappStrings.NodeJS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-sketchapp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp", "Artboard")
  @js.native
  open class Artboard protected ()
    extends typingsJapgolly.reactSketchapp.libComponentsMod.Artboard {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Artboard {
    
    @JSImport("react-sketchapp", "Artboard")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp", "Artboard.defaultProps")
    @js.native
    def defaultProps: Name = js.native
    inline def defaultProps_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Artboard.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp", "Document")
  @js.native
  open class Document protected ()
    extends typingsJapgolly.reactSketchapp.libComponentsMod.Document {
    def this(props: typingsJapgolly.reactSketchapp.libComponentsDocumentMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libComponentsDocumentMod.Props, context: Any) = this()
  }
  /* static members */
  object Document {
    
    @JSImport("react-sketchapp", "Document")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp", "Document.propTypes")
    @js.native
    def propTypes: ChildrenRequireable = js.native
    inline def propTypes_=(x: ChildrenRequireable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp", "Image")
  @js.native
  open class Image protected ()
    extends typingsJapgolly.reactSketchapp.libComponentsMod.Image {
    def this(props: typingsJapgolly.reactSketchapp.libComponentsImageMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libComponentsImageMod.Props, context: Any) = this()
  }
  /* static members */
  object Image {
    
    @JSImport("react-sketchapp", "Image")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp", "Image.defaultProps")
    @js.native
    def defaultProps: Name = js.native
    inline def defaultProps_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Image.propTypes")
    @js.native
    def propTypes: DefaultSource = js.native
    inline def propTypes_=(x: DefaultSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp", "Page")
  @js.native
  open class Page protected ()
    extends typingsJapgolly.reactSketchapp.libComponentsMod.Page {
    def this(props: typingsJapgolly.reactSketchapp.libComponentsPageMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libComponentsPageMod.Props, context: Any) = this()
  }
  /* static members */
  object Page {
    
    @JSImport("react-sketchapp", "Page")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp", "Page.propTypes")
    @js.native
    def propTypes: Style = js.native
    inline def propTypes_=(x: Style): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  object Platform {
    
    @JSImport("react-sketchapp", "Platform")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp", "Platform.OS")
    @js.native
    def OS: String = js.native
    inline def OS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OS")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Platform.Version")
    @js.native
    def Version: Double | NodeJS = js.native
    inline def Version_=(x: Double | NodeJS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Version")(x.asInstanceOf[js.Any])
    
    inline def select(obj: Sketch): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  @JSImport("react-sketchapp", "RedBox")
  @js.native
  open class RedBox protected ()
    extends typingsJapgolly.reactSketchapp.libComponentsMod.RedBox {
    def this(props: typingsJapgolly.reactSketchapp.libComponentsRedBoxMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libComponentsRedBoxMod.Props, context: Any) = this()
  }
  /* static members */
  object RedBox {
    
    @JSImport("react-sketchapp", "RedBox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp", "RedBox.defaultProps")
    @js.native
    def defaultProps: UseColumns = js.native
    inline def defaultProps_=(x: UseColumns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "RedBox.propTypes")
    @js.native
    def propTypes: Error = js.native
    inline def propTypes_=(x: Error): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  object StyleSheet {
    
    @JSImport("react-sketchapp", "StyleSheet")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp", "StyleSheet.absoluteFill")
    @js.native
    def absoluteFill: Double = js.native
    inline def absoluteFill_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("absoluteFill")(x.asInstanceOf[js.Any])
    
    inline def create(styles: RawStyles): StyleSheetInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any]).asInstanceOf[StyleSheetInstance]
    
    inline def flatten(): js.UndefOr[typingsJapgolly.reactSketchapp.libStylesheetTypesMod.Style] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[js.UndefOr[typingsJapgolly.reactSketchapp.libStylesheetTypesMod.Style]]
    inline def flatten(input: js.Array[UserStyle]): js.UndefOr[typingsJapgolly.reactSketchapp.libStylesheetTypesMod.Style] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.reactSketchapp.libStylesheetTypesMod.Style]]
    inline def flatten(input: Double): js.UndefOr[typingsJapgolly.reactSketchapp.libStylesheetTypesMod.Style] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.reactSketchapp.libStylesheetTypesMod.Style]]
    inline def flatten(input: RawStyle): js.UndefOr[typingsJapgolly.reactSketchapp.libStylesheetTypesMod.Style] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.reactSketchapp.libStylesheetTypesMod.Style]]
    
    @JSImport("react-sketchapp", "StyleSheet.hairlineWidth")
    @js.native
    def hairlineWidth: Double = js.native
    inline def hairlineWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hairlineWidth")(x.asInstanceOf[js.Any])
    
    inline def resolve(style: UserStyle): `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(style.asInstanceOf[js.Any]).asInstanceOf[`0`]
  }
  
  @JSImport("react-sketchapp", "Svg")
  @js.native
  open class Svg protected ()
    extends typingsJapgolly.reactSketchapp.libComponentsMod.Svg {
    def this(props: typingsJapgolly.reactSketchapp.libComponentsSvgSvgMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libComponentsSvgSvgMod.Props, context: Any) = this()
  }
  /* static members */
  object Svg {
    
    @JSImport("react-sketchapp", "Svg")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp", "Svg.Circle")
    @js.native
    def Circle: TypeofCircle = js.native
    inline def Circle_=(x: TypeofCircle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.ClipPath")
    @js.native
    def ClipPath: TypeofClipPath = js.native
    inline def ClipPath_=(x: TypeofClipPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClipPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.Defs")
    @js.native
    def Defs: TypeofDefs = js.native
    inline def Defs_=(x: TypeofDefs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Defs")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.Ellipse")
    @js.native
    def Ellipse: TypeofEllipse = js.native
    inline def Ellipse_=(x: TypeofEllipse): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ellipse")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.G")
    @js.native
    def G: TypeofG = js.native
    inline def G_=(x: TypeofG): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("G")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.Image")
    @js.native
    def Image: TypeofImage = js.native
    inline def Image_=(x: TypeofImage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.Line")
    @js.native
    def Line: TypeofLine = js.native
    inline def Line_=(x: TypeofLine): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.LinearGradient")
    @js.native
    def LinearGradient: TypeofLinearGradient = js.native
    inline def LinearGradient_=(x: TypeofLinearGradient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LinearGradient")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.Path")
    @js.native
    def Path: TypeofPath = js.native
    inline def Path_=(x: TypeofPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.Pattern")
    @js.native
    def Pattern: TypeofPattern = js.native
    inline def Pattern_=(x: TypeofPattern): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.Polygon")
    @js.native
    def Polygon: TypeofPolygon = js.native
    inline def Polygon_=(x: TypeofPolygon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Polygon")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.Polyline")
    @js.native
    def Polyline: TypeofPolyline = js.native
    inline def Polyline_=(x: TypeofPolyline): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Polyline")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.RadialGradient")
    @js.native
    def RadialGradient: TypeofRadialGradient = js.native
    inline def RadialGradient_=(x: TypeofRadialGradient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RadialGradient")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.Rect")
    @js.native
    def Rect: TypeofRect = js.native
    inline def Rect_=(x: TypeofRect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rect")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.Stop")
    @js.native
    def Stop: TypeofStop = js.native
    inline def Stop_=(x: TypeofStop): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stop")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.Symbol")
    @js.native
    val Symbol: TypeofSymbol = js.native
    
    @JSImport("react-sketchapp", "Svg.TSpan")
    @js.native
    def TSpan: TypeofTSpan = js.native
    inline def TSpan_=(x: TypeofTSpan): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSpan")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.Text")
    @js.native
    def Text: TypeofText = js.native
    
    @JSImport("react-sketchapp", "Svg.TextPath")
    @js.native
    def TextPath: TypeofTextPath = js.native
    inline def TextPath_=(x: TypeofTextPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextPath")(x.asInstanceOf[js.Any])
    
    inline def Text_=(x: TypeofText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.Use")
    @js.native
    def Use: TypeofUse = js.native
    inline def Use_=(x: TypeofUse): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Use")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.defaultProps")
    @js.native
    def defaultProps: PreserveAspectRatioString = js.native
    inline def defaultProps_=(x: PreserveAspectRatioString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "Svg.propTypes")
    @js.native
    def propTypes: Flow = js.native
    inline def propTypes_=(x: Flow): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp", "Text")
  @js.native
  open class Text protected ()
    extends typingsJapgolly.reactSketchapp.libComponentsMod.Text {
    def this(props: typingsJapgolly.reactSketchapp.libComponentsTextMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libComponentsTextMod.Props, context: Any) = this()
  }
  /* static members */
  object Text {
    
    @JSImport("react-sketchapp", "Text")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp", "Text.propTypes")
    @js.native
    def propTypes: ResizingConstraint = js.native
    inline def propTypes_=(x: ResizingConstraint): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  object TextStyles {
    
    @JSImport("react-sketchapp", "TextStyles")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    inline def create(styles: StringDictionary[TextStyle]): StringDictionary[CssStyle] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[CssStyle]]
    inline def create(styles: StringDictionary[TextStyle], options: Unit, platformBridge: PlatformBridge): StringDictionary[CssStyle] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], platformBridge.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[CssStyle]]
    inline def create(styles: StringDictionary[TextStyle], options: ClearExistingStyles): StringDictionary[CssStyle] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[CssStyle]]
    inline def create(styles: StringDictionary[TextStyle], options: ClearExistingStyles, platformBridge: PlatformBridge): StringDictionary[CssStyle] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], platformBridge.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[CssStyle]]
    
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
  
  @JSImport("react-sketchapp", "View")
  @js.native
  open class View protected ()
    extends typingsJapgolly.reactSketchapp.libComponentsMod.View {
    def this(props: typingsJapgolly.reactSketchapp.libComponentsViewMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactSketchapp.libComponentsViewMod.Props, context: Any) = this()
  }
  /* static members */
  object View {
    
    @JSImport("react-sketchapp", "View")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp", "View.defaultProps")
    @js.native
    def defaultProps: Name = js.native
    inline def defaultProps_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp", "View.propTypes")
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
