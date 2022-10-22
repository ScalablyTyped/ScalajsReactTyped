package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import typingsJapgolly.sketchHqSketchFileFormatTs.anon.Data
import typingsJapgolly.sketchHqSketchFileFormatTs.anon.Kerning
import typingsJapgolly.sketchHqSketchFileFormatTs.anon.MSAttributedStringColorAttribute
import typingsJapgolly.sketchHqSketchFileFormatTs.anon.Name
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSFontData
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImageData
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImmutablePage
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSPatch
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.automatic
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.back
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.AssetCollection
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ImageCollection
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ColorAsset
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Color
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.GradientAsset
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Gradient
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.GradientStop
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FileRef
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.DataRef
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ForeignLayerStyle
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SharedStyle
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Style
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Border
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.GraphicsContextSettings
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.BorderOptions
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Blur
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Fill
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.TextStyle
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ParagraphStyle
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FontDescriptor
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Shadow
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.InnerShadow
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ColorControls
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ForeignSymbol
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SymbolMaster
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ExportOptions
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ExportFormat
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Rect
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FlowConnection
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.RulerData
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.LayoutGrid
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SimpleGrid
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FreeformGroupLayout
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.InferredGroupLayout
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.OverrideProperty
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Group
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Oval
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.CurvePoint
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Polygon
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Rectangle
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ShapePath
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Star
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Triangle
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ShapeGroup
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Text
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.AttributedString
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.StringAttribute
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SymbolInstance
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.OverrideValue
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Slice
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Hotspot
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Bitmap
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ForeignTextStyle
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ForeignSwatch
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Swatch
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SharedStyleContainer
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SharedTextStyleContainer
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SymbolContainer
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SwatchContainer
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FontRef
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.PatchInfo
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Page
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Artboard
  - typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.PrototypeViewport
*/
trait AnyObject extends StObject
object AnyObject {
  
  inline def Artboard(
    backgroundColor: Color,
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    frame: Rect,
    hasBackgroundColor: Boolean,
    hasClickThrough: Boolean,
    horizontalRulerData: RulerData,
    includeBackgroundColorInExport: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isFlowHome: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    layers: js.Array[
      Group | Oval | Polygon | Rectangle | ShapePath | Star | Triangle | ShapeGroup | Text | SymbolInstance | Slice | Hotspot | Bitmap
    ],
    name: String,
    nameIsFixed: Boolean,
    resizesContent: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    verticalRulerData: RulerData
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Artboard = {
    val __obj = js.Dynamic.literal(_class = "artboard", backgroundColor = backgroundColor.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasBackgroundColor = hasBackgroundColor.asInstanceOf[js.Any], hasClickThrough = hasClickThrough.asInstanceOf[js.Any], horizontalRulerData = horizontalRulerData.asInstanceOf[js.Any], includeBackgroundColorInExport = includeBackgroundColorInExport.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isFlowHome = isFlowHome.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizesContent = resizesContent.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], verticalRulerData = verticalRulerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Artboard]
  }
  
  inline def AssetCollection(
    colorAssets: js.Array[ColorAsset],
    colors: js.Array[Color],
    do_objectID: Uuid,
    exportPresets: js.Array[Any],
    gradientAssets: js.Array[GradientAsset],
    gradients: js.Array[Gradient],
    images: js.Array[FileRef | DataRef]
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.AssetCollection = {
    val __obj = js.Dynamic.literal(_class = "assetCollection", colorAssets = colorAssets.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportPresets = exportPresets.asInstanceOf[js.Any], gradientAssets = gradientAssets.asInstanceOf[js.Any], gradients = gradients.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.AssetCollection]
  }
  
  inline def AttributedString(attributes: js.Array[StringAttribute], string: String): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.AttributedString = {
    val __obj = js.Dynamic.literal(_class = "attributedString", attributes = attributes.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.AttributedString]
  }
  
  inline def Bitmap(
    booleanOperation: BooleanOperation,
    clippingMask: PointListString,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    fillReplacesImage: Boolean,
    frame: Rect,
    image: FileRef | DataRef,
    intendedDPI: Double,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Bitmap = {
    val __obj = js.Dynamic.literal(_class = "bitmap", booleanOperation = booleanOperation.asInstanceOf[js.Any], clippingMask = clippingMask.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], fillReplacesImage = fillReplacesImage.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], intendedDPI = intendedDPI.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Bitmap]
  }
  
  inline def Blur(center: PointString, isEnabled: Boolean, saturation: Double, `type`: BlurType): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Blur = {
    val __obj = js.Dynamic.literal(_class = "blur", center = center.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Blur]
  }
  
  inline def Border(
    color: Color,
    contextSettings: GraphicsContextSettings,
    fillType: FillType,
    gradient: Gradient,
    isEnabled: Boolean,
    position: BorderPosition,
    thickness: Double
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Border = {
    val __obj = js.Dynamic.literal(_class = "border", color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Border]
  }
  
  inline def BorderOptions(
    dashPattern: js.Array[Double],
    isEnabled: Boolean,
    lineCapStyle: LineCapStyle,
    lineJoinStyle: LineJoinStyle
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.BorderOptions = {
    val __obj = js.Dynamic.literal(_class = "borderOptions", dashPattern = dashPattern.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], lineCapStyle = lineCapStyle.asInstanceOf[js.Any], lineJoinStyle = lineJoinStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.BorderOptions]
  }
  
  inline def Color(alpha: UnitInterval, blue: UnitInterval, green: UnitInterval, red: UnitInterval): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Color = {
    val __obj = js.Dynamic.literal(_class = "color", alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Color]
  }
  
  inline def ColorAsset(color: Color, do_objectID: Uuid, name: String): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ColorAsset = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableColorAsset", color = color.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ColorAsset]
  }
  
  inline def ColorControls(brightness: Double, contrast: Double, hue: Double, isEnabled: Boolean, saturation: Double): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ColorControls = {
    val __obj = js.Dynamic.literal(_class = "colorControls", brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ColorControls]
  }
  
  inline def CurvePoint(
    cornerRadius: Double,
    cornerStyle: CornerStyle,
    curveFrom: PointString,
    curveMode: CurveMode,
    curveTo: PointString,
    hasCurveFrom: Boolean,
    hasCurveTo: Boolean,
    point: PointString
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.CurvePoint = {
    val __obj = js.Dynamic.literal(_class = "curvePoint", cornerRadius = cornerRadius.asInstanceOf[js.Any], cornerStyle = cornerStyle.asInstanceOf[js.Any], curveFrom = curveFrom.asInstanceOf[js.Any], curveMode = curveMode.asInstanceOf[js.Any], curveTo = curveTo.asInstanceOf[js.Any], hasCurveFrom = hasCurveFrom.asInstanceOf[js.Any], hasCurveTo = hasCurveTo.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.CurvePoint]
  }
  
  inline def DataRef(_ref: String, _ref_class: MSImageData | MSFontData, data: Data, sha1: Data): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.DataRef = {
    val __obj = js.Dynamic.literal(_class = "MSJSONOriginalDataReference", _ref = _ref.asInstanceOf[js.Any], _ref_class = _ref_class.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.DataRef]
  }
  
  inline def ExportFormat(
    absoluteSize: Double,
    fileFormat: ExportFileFormat,
    name: String,
    scale: Double,
    visibleScaleType: VisibleScaleType
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ExportFormat = {
    val __obj = js.Dynamic.literal(_class = "exportFormat", absoluteSize = absoluteSize.asInstanceOf[js.Any], fileFormat = fileFormat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], visibleScaleType = visibleScaleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ExportFormat]
  }
  
  inline def ExportOptions(
    exportFormats: js.Array[ExportFormat],
    includedLayerIds: js.Array[Uuid],
    layerOptions: Double,
    shouldTrim: Boolean
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ExportOptions = {
    val __obj = js.Dynamic.literal(_class = "exportOptions", exportFormats = exportFormats.asInstanceOf[js.Any], includedLayerIds = includedLayerIds.asInstanceOf[js.Any], layerOptions = layerOptions.asInstanceOf[js.Any], shouldTrim = shouldTrim.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ExportOptions]
  }
  
  inline def FileRef(_ref: String, _ref_class: MSImageData | MSImmutablePage | MSPatch): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FileRef = {
    val __obj = js.Dynamic.literal(_class = "MSJSONFileReference", _ref = _ref.asInstanceOf[js.Any], _ref_class = _ref_class.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FileRef]
  }
  
  inline def Fill(
    color: Color,
    contextSettings: GraphicsContextSettings,
    fillType: FillType,
    gradient: Gradient,
    isEnabled: Boolean,
    noiseIndex: Double,
    noiseIntensity: Double,
    patternFillType: PatternFillType,
    patternTileScale: Double
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Fill = {
    val __obj = js.Dynamic.literal(_class = "fill", color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], noiseIndex = noiseIndex.asInstanceOf[js.Any], noiseIntensity = noiseIntensity.asInstanceOf[js.Any], patternFillType = patternFillType.asInstanceOf[js.Any], patternTileScale = patternTileScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Fill]
  }
  
  inline def FlowConnection(animationType: AnimationType, destinationArtboardID: Uuid | back | automatic): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FlowConnection = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableFlowConnection", animationType = animationType.asInstanceOf[js.Any], destinationArtboardID = destinationArtboardID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FlowConnection]
  }
  
  inline def FontDescriptor(attributes: Name): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FontDescriptor = {
    val __obj = js.Dynamic.literal(_class = "fontDescriptor", attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FontDescriptor]
  }
  
  inline def FontRef(
    fontData: DataRef,
    fontFamilyName: String,
    fontFileName: String,
    options: Double,
    postscriptNames: js.Array[String]
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FontRef = {
    val __obj = js.Dynamic.literal(_class = "fontReference", fontData = fontData.asInstanceOf[js.Any], fontFamilyName = fontFamilyName.asInstanceOf[js.Any], fontFileName = fontFileName.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], postscriptNames = postscriptNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FontRef]
  }
  
  inline def ForeignLayerStyle(
    do_objectID: Uuid,
    libraryID: Uuid,
    localSharedStyle: SharedStyle,
    remoteStyleID: Uuid,
    sourceLibraryName: String,
    symbolPrivate: Boolean
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ForeignLayerStyle = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableForeignLayerStyle", do_objectID = do_objectID.asInstanceOf[js.Any], libraryID = libraryID.asInstanceOf[js.Any], localSharedStyle = localSharedStyle.asInstanceOf[js.Any], remoteStyleID = remoteStyleID.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolPrivate = symbolPrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ForeignLayerStyle]
  }
  
  inline def ForeignSwatch(
    do_objectID: Uuid,
    libraryID: Uuid,
    localSwatch: Swatch,
    remoteSwatchID: Uuid,
    sourceLibraryName: String,
    symbolPrivate: Boolean
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ForeignSwatch = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableForeignSwatch", do_objectID = do_objectID.asInstanceOf[js.Any], libraryID = libraryID.asInstanceOf[js.Any], localSwatch = localSwatch.asInstanceOf[js.Any], remoteSwatchID = remoteSwatchID.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolPrivate = symbolPrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ForeignSwatch]
  }
  
  inline def ForeignSymbol(
    do_objectID: Uuid,
    libraryID: Uuid,
    originalMaster: SymbolMaster,
    sourceLibraryName: String,
    symbolMaster: SymbolMaster,
    symbolPrivate: Boolean
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ForeignSymbol = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableForeignSymbol", do_objectID = do_objectID.asInstanceOf[js.Any], libraryID = libraryID.asInstanceOf[js.Any], originalMaster = originalMaster.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolMaster = symbolMaster.asInstanceOf[js.Any], symbolPrivate = symbolPrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ForeignSymbol]
  }
  
  inline def ForeignTextStyle(
    libraryID: Uuid,
    localSharedStyle: SharedStyle,
    remoteStyleID: Uuid,
    sourceLibraryName: String,
    symbolPrivate: Boolean
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ForeignTextStyle = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableForeignTextStyle", libraryID = libraryID.asInstanceOf[js.Any], localSharedStyle = localSharedStyle.asInstanceOf[js.Any], remoteStyleID = remoteStyleID.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolPrivate = symbolPrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ForeignTextStyle]
  }
  
  inline def FreeformGroupLayout(): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FreeformGroupLayout = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableFreeformGroupLayout")
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FreeformGroupLayout]
  }
  
  inline def Gradient(
    elipseLength: Double,
    from: PointString,
    gradientType: GradientType,
    stops: js.Array[GradientStop],
    to: PointString
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Gradient = {
    val __obj = js.Dynamic.literal(_class = "gradient", elipseLength = elipseLength.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gradientType = gradientType.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Gradient]
  }
  
  inline def GradientAsset(do_objectID: Uuid, gradient: Gradient, name: String): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.GradientAsset = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableGradientAsset", do_objectID = do_objectID.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.GradientAsset]
  }
  
  inline def GradientStop(color: Color, position: UnitInterval): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.GradientStop = {
    val __obj = js.Dynamic.literal(_class = "gradientStop", color = color.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.GradientStop]
  }
  
  inline def GraphicsContextSettings(blendMode: BlendMode, opacity: Double): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.GraphicsContextSettings = {
    val __obj = js.Dynamic.literal(_class = "graphicsContextSettings", blendMode = blendMode.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.GraphicsContextSettings]
  }
  
  inline def Group(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    frame: Rect,
    hasClickThrough: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    layers: js.Array[
      typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Group | Oval | Polygon | Rectangle | ShapePath | Star | Triangle | ShapeGroup | Text | SymbolInstance | Slice | Hotspot | Bitmap
    ],
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Group = {
    val __obj = js.Dynamic.literal(_class = "group", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasClickThrough = hasClickThrough.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Group]
  }
  
  inline def Hotspot(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    frame: Rect,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Hotspot = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableHotspotLayer", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Hotspot]
  }
  
  inline def ImageCollection(images: Any): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ImageCollection = {
    val __obj = js.Dynamic.literal(_class = "imageCollection", images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ImageCollection]
  }
  
  inline def InferredGroupLayout(axis: InferredLayoutAxis, layoutAnchor: InferredLayoutAnchor): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.InferredGroupLayout = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableInferredGroupLayout", axis = axis.asInstanceOf[js.Any], layoutAnchor = layoutAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.InferredGroupLayout]
  }
  
  inline def InnerShadow(
    blurRadius: Double,
    color: Color,
    contextSettings: GraphicsContextSettings,
    isEnabled: Boolean,
    offsetX: Double,
    offsetY: Double,
    spread: Double
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.InnerShadow = {
    val __obj = js.Dynamic.literal(_class = "innerShadow", blurRadius = blurRadius.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], spread = spread.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.InnerShadow]
  }
  
  inline def LayoutGrid(
    columnWidth: Double,
    drawHorizontal: Boolean,
    drawHorizontalLines: Boolean,
    drawVertical: Boolean,
    gutterHeight: Double,
    gutterWidth: Double,
    guttersOutside: Boolean,
    horizontalOffset: Double,
    isEnabled: Boolean,
    numberOfColumns: Double,
    rowHeightMultiplication: Double,
    totalWidth: Double
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.LayoutGrid = {
    val __obj = js.Dynamic.literal(_class = "layoutGrid", columnWidth = columnWidth.asInstanceOf[js.Any], drawHorizontal = drawHorizontal.asInstanceOf[js.Any], drawHorizontalLines = drawHorizontalLines.asInstanceOf[js.Any], drawVertical = drawVertical.asInstanceOf[js.Any], gutterHeight = gutterHeight.asInstanceOf[js.Any], gutterWidth = gutterWidth.asInstanceOf[js.Any], guttersOutside = guttersOutside.asInstanceOf[js.Any], horizontalOffset = horizontalOffset.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], numberOfColumns = numberOfColumns.asInstanceOf[js.Any], rowHeightMultiplication = rowHeightMultiplication.asInstanceOf[js.Any], totalWidth = totalWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.LayoutGrid]
  }
  
  inline def Oval(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    edited: Boolean,
    exportOptions: ExportOptions,
    frame: Rect,
    isClosed: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    pointRadiusBehaviour: PointsRadiusBehaviour,
    points: js.Array[CurvePoint],
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Oval = {
    val __obj = js.Dynamic.literal(_class = "oval", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], pointRadiusBehaviour = pointRadiusBehaviour.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Oval]
  }
  
  inline def OverrideProperty(canOverride: Boolean, overrideName: OverrideName): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.OverrideProperty = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableOverrideProperty", canOverride = canOverride.asInstanceOf[js.Any], overrideName = overrideName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.OverrideProperty]
  }
  
  inline def OverrideValue(overrideName: OverrideName, value: String | Uuid | FileRef | DataRef): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.OverrideValue = {
    val __obj = js.Dynamic.literal(_class = "overrideValue", overrideName = overrideName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.OverrideValue]
  }
  
  inline def Page(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    frame: Rect,
    hasClickThrough: Boolean,
    horizontalRulerData: RulerData,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    layers: js.Array[
      Artboard | Group | Oval | Polygon | Rectangle | ShapePath | Star | Triangle | ShapeGroup | Text | SymbolMaster | SymbolInstance | Slice | Hotspot | Bitmap
    ],
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    verticalRulerData: RulerData
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Page = {
    val __obj = js.Dynamic.literal(_class = "page", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasClickThrough = hasClickThrough.asInstanceOf[js.Any], horizontalRulerData = horizontalRulerData.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], verticalRulerData = verticalRulerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Page]
  }
  
  inline def ParagraphStyle(): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ParagraphStyle = {
    val __obj = js.Dynamic.literal(_class = "paragraphStyle")
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ParagraphStyle]
  }
  
  inline def PatchInfo(
    baseVersionID: Uuid,
    lastIntegratedPatchID: Uuid,
    localPatches: js.Array[FileRef],
    receivedPatches: js.Array[FileRef]
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.PatchInfo = {
    val __obj = js.Dynamic.literal(_class = "MSImmutablePatchInfo", baseVersionID = baseVersionID.asInstanceOf[js.Any], lastIntegratedPatchID = lastIntegratedPatchID.asInstanceOf[js.Any], localPatches = localPatches.asInstanceOf[js.Any], receivedPatches = receivedPatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.PatchInfo]
  }
  
  inline def Polygon(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    edited: Boolean,
    exportOptions: ExportOptions,
    frame: Rect,
    isClosed: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    numberOfPoints: Double,
    pointRadiusBehaviour: PointsRadiusBehaviour,
    points: js.Array[CurvePoint],
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Polygon = {
    val __obj = js.Dynamic.literal(_class = "polygon", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], numberOfPoints = numberOfPoints.asInstanceOf[js.Any], pointRadiusBehaviour = pointRadiusBehaviour.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Polygon]
  }
  
  inline def PrototypeViewport(name: String, size: SizeString): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.PrototypeViewport = {
    val __obj = js.Dynamic.literal(_class = "MSImmutablePrototypeViewport", name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.PrototypeViewport]
  }
  
  inline def Rect(constrainProportions: Boolean, height: Double, width: Double, x: Double, y: Double): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Rect = {
    val __obj = js.Dynamic.literal(_class = "rect", constrainProportions = constrainProportions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Rect]
  }
  
  inline def Rectangle(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    edited: Boolean,
    exportOptions: ExportOptions,
    fixedRadius: Double,
    frame: Rect,
    hasConvertedToNewRoundCorners: Boolean,
    isClosed: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    needsConvertionToNewRoundCorners: Boolean,
    pointRadiusBehaviour: PointsRadiusBehaviour,
    points: js.Array[CurvePoint],
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Rectangle = {
    val __obj = js.Dynamic.literal(_class = "rectangle", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], fixedRadius = fixedRadius.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasConvertedToNewRoundCorners = hasConvertedToNewRoundCorners.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], needsConvertionToNewRoundCorners = needsConvertionToNewRoundCorners.asInstanceOf[js.Any], pointRadiusBehaviour = pointRadiusBehaviour.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Rectangle]
  }
  
  inline def RulerData(base: Double, guides: js.Array[Double]): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.RulerData = {
    val __obj = js.Dynamic.literal(_class = "rulerData", base = base.asInstanceOf[js.Any], guides = guides.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.RulerData]
  }
  
  inline def Shadow(
    blurRadius: Double,
    color: Color,
    contextSettings: GraphicsContextSettings,
    isEnabled: Boolean,
    offsetX: Double,
    offsetY: Double,
    spread: Double
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Shadow = {
    val __obj = js.Dynamic.literal(_class = "shadow", blurRadius = blurRadius.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], spread = spread.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Shadow]
  }
  
  inline def ShapeGroup(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    frame: Rect,
    hasClickThrough: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    layers: js.Array[
      Group | Oval | Polygon | Rectangle | ShapePath | Star | Triangle | typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ShapeGroup | Text | SymbolInstance | Slice | Hotspot | Bitmap
    ],
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    windingRule: WindingRule
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ShapeGroup = {
    val __obj = js.Dynamic.literal(_class = "shapeGroup", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasClickThrough = hasClickThrough.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], windingRule = windingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ShapeGroup]
  }
  
  inline def ShapePath(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    edited: Boolean,
    exportOptions: ExportOptions,
    frame: Rect,
    isClosed: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    pointRadiusBehaviour: PointsRadiusBehaviour,
    points: js.Array[CurvePoint],
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ShapePath = {
    val __obj = js.Dynamic.literal(_class = "shapePath", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], pointRadiusBehaviour = pointRadiusBehaviour.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.ShapePath]
  }
  
  inline def SharedStyle(do_objectID: Uuid, name: String, value: Style): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SharedStyle = {
    val __obj = js.Dynamic.literal(_class = "sharedStyle", do_objectID = do_objectID.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SharedStyle]
  }
  
  inline def SharedStyleContainer(objects: js.Array[SharedStyle]): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SharedStyleContainer = {
    val __obj = js.Dynamic.literal(_class = "sharedStyleContainer", objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SharedStyleContainer]
  }
  
  inline def SharedTextStyleContainer(objects: js.Array[SharedStyle]): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SharedTextStyleContainer = {
    val __obj = js.Dynamic.literal(_class = "sharedTextStyleContainer", objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SharedTextStyleContainer]
  }
  
  inline def SimpleGrid(gridSize: Double, isEnabled: Boolean, thickGridTimes: Double): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SimpleGrid = {
    val __obj = js.Dynamic.literal(_class = "simpleGrid", gridSize = gridSize.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], thickGridTimes = thickGridTimes.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SimpleGrid]
  }
  
  inline def Slice(
    backgroundColor: Color,
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    frame: Rect,
    hasBackgroundColor: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Slice = {
    val __obj = js.Dynamic.literal(_class = "slice", backgroundColor = backgroundColor.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasBackgroundColor = hasBackgroundColor.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Slice]
  }
  
  inline def Star(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    edited: Boolean,
    exportOptions: ExportOptions,
    frame: Rect,
    isClosed: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    numberOfPoints: Double,
    pointRadiusBehaviour: PointsRadiusBehaviour,
    points: js.Array[CurvePoint],
    radius: Double,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Star = {
    val __obj = js.Dynamic.literal(_class = "star", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], numberOfPoints = numberOfPoints.asInstanceOf[js.Any], pointRadiusBehaviour = pointRadiusBehaviour.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Star]
  }
  
  inline def StringAttribute(attributes: Kerning, length: Double, location: Double): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.StringAttribute = {
    val __obj = js.Dynamic.literal(_class = "stringAttribute", attributes = attributes.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.StringAttribute]
  }
  
  inline def Style(
    borderOptions: BorderOptions,
    colorControls: ColorControls,
    do_objectID: Uuid,
    endMarkerType: MarkerType,
    innerShadows: js.Array[InnerShadow],
    miterLimit: Double,
    startMarkerType: MarkerType,
    windingRule: WindingRule
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Style = {
    val __obj = js.Dynamic.literal(_class = "style", borderOptions = borderOptions.asInstanceOf[js.Any], colorControls = colorControls.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], endMarkerType = endMarkerType.asInstanceOf[js.Any], innerShadows = innerShadows.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], startMarkerType = startMarkerType.asInstanceOf[js.Any], windingRule = windingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Style]
  }
  
  inline def Swatch(do_objectID: Uuid, name: String, value: Color): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Swatch = {
    val __obj = js.Dynamic.literal(_class = "swatch", do_objectID = do_objectID.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Swatch]
  }
  
  inline def SwatchContainer(objects: js.Array[Swatch]): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SwatchContainer = {
    val __obj = js.Dynamic.literal(_class = "swatchContainer", objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SwatchContainer]
  }
  
  inline def SymbolContainer(objects: js.Array[Any]): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SymbolContainer = {
    val __obj = js.Dynamic.literal(_class = "symbolContainer", objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SymbolContainer]
  }
  
  inline def SymbolInstance(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    frame: Rect,
    horizontalSpacing: Double,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    overrideValues: js.Array[OverrideValue],
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    scale: Double,
    shouldBreakMaskChain: Boolean,
    symbolID: Uuid,
    verticalSpacing: Double
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SymbolInstance = {
    val __obj = js.Dynamic.literal(_class = "symbolInstance", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], horizontalSpacing = horizontalSpacing.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], overrideValues = overrideValues.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], symbolID = symbolID.asInstanceOf[js.Any], verticalSpacing = verticalSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SymbolInstance]
  }
  
  inline def SymbolMaster(
    allowsOverrides: Boolean,
    backgroundColor: Color,
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    frame: Rect,
    hasBackgroundColor: Boolean,
    hasClickThrough: Boolean,
    horizontalRulerData: RulerData,
    includeBackgroundColorInExport: Boolean,
    includeBackgroundColorInInstance: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isFlowHome: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    layers: js.Array[
      Group | Oval | Polygon | Rectangle | ShapePath | Star | Triangle | ShapeGroup | Text | SymbolInstance | Slice | Hotspot | Bitmap
    ],
    name: String,
    nameIsFixed: Boolean,
    overrideProperties: js.Array[OverrideProperty],
    resizesContent: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    symbolID: Uuid,
    verticalRulerData: RulerData
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SymbolMaster = {
    val __obj = js.Dynamic.literal(_class = "symbolMaster", allowsOverrides = allowsOverrides.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasBackgroundColor = hasBackgroundColor.asInstanceOf[js.Any], hasClickThrough = hasClickThrough.asInstanceOf[js.Any], horizontalRulerData = horizontalRulerData.asInstanceOf[js.Any], includeBackgroundColorInExport = includeBackgroundColorInExport.asInstanceOf[js.Any], includeBackgroundColorInInstance = includeBackgroundColorInInstance.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isFlowHome = isFlowHome.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], overrideProperties = overrideProperties.asInstanceOf[js.Any], resizesContent = resizesContent.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], symbolID = symbolID.asInstanceOf[js.Any], verticalRulerData = verticalRulerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.SymbolMaster]
  }
  
  inline def Text(
    attributedString: AttributedString,
    automaticallyDrawOnUnderlyingPath: Boolean,
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    dontSynchroniseWithSymbol: Boolean,
    exportOptions: ExportOptions,
    frame: Rect,
    glyphBounds: PointListString,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    lineSpacingBehaviour: LineSpacingBehaviour,
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    textBehaviour: TextBehaviour
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Text = {
    val __obj = js.Dynamic.literal(_class = "text", attributedString = attributedString.asInstanceOf[js.Any], automaticallyDrawOnUnderlyingPath = automaticallyDrawOnUnderlyingPath.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], dontSynchroniseWithSymbol = dontSynchroniseWithSymbol.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], glyphBounds = glyphBounds.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], lineSpacingBehaviour = lineSpacingBehaviour.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], textBehaviour = textBehaviour.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Text]
  }
  
  inline def TextStyle(encodedAttributes: MSAttributedStringColorAttribute, verticalAlignment: TextVerticalAlignment): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.TextStyle = {
    val __obj = js.Dynamic.literal(_class = "textStyle", encodedAttributes = encodedAttributes.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.TextStyle]
  }
  
  inline def Triangle(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    edited: Boolean,
    exportOptions: ExportOptions,
    frame: Rect,
    isClosed: Boolean,
    isEquilateral: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    pointRadiusBehaviour: PointsRadiusBehaviour,
    points: js.Array[CurvePoint],
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Triangle = {
    val __obj = js.Dynamic.literal(_class = "triangle", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isEquilateral = isEquilateral.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], pointRadiusBehaviour = pointRadiusBehaviour.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.Triangle]
  }
}
