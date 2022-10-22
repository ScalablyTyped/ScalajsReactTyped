package typingsJapgolly.pixiJs.mod

import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.pixiAccessibility.mod.IAccessibleTarget
import typingsJapgolly.pixiCompressedTextures.anon.Compressed
import typingsJapgolly.pixiCore.anon.Size
import typingsJapgolly.pixiCore.anon.SyncFunc
import typingsJapgolly.pixiCore.mod.IRendererOptionsAuto
import typingsJapgolly.pixiCore.mod.IRenderingContext
import typingsJapgolly.pixiCore.mod.IResourcePlugin
import typingsJapgolly.pixiCore.mod.IUniformData
import typingsJapgolly.pixiCore.mod.IUniformParser
import typingsJapgolly.pixiGraphics.mod.IGraphicsCurvesSettings
import typingsJapgolly.pixiInteraction.mod.InteractiveTarget_
import typingsJapgolly.pixiJs.mod.^
import typingsJapgolly.pixiSettings.mod.IAdapter
import typingsJapgolly.pixiSettings.mod.ISettings
import typingsJapgolly.pixiSettings.mod.isMobileResult
import typingsJapgolly.pixiUtils.mod.Dict
import typingsJapgolly.std.WebGL2RenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def BrowserAdapter: IAdapter = ^.asInstanceOf[js.Dynamic].selectDynamic("BrowserAdapter").asInstanceOf[IAdapter]

inline def DEG_TO_RAD: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEG_TO_RAD").asInstanceOf[Double]

inline def GRAPHICS_CURVES: IGraphicsCurvesSettings = ^.asInstanceOf[js.Dynamic].selectDynamic("GRAPHICS_CURVES").asInstanceOf[IGraphicsCurvesSettings]

inline def INSTALLED: js.Array[IResourcePlugin[Any, Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("INSTALLED").asInstanceOf[js.Array[IResourcePlugin[Any, Any]]]

inline def PI_2: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PI_2").asInstanceOf[Double]

inline def RAD_TO_DEG: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("RAD_TO_DEG").asInstanceOf[Double]

inline def VERSION: /* "$_VERSION" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[/* "$_VERSION" */ String]

inline def accessibleTarget: IAccessibleTarget = ^.asInstanceOf[js.Dynamic].selectDynamic("accessibleTarget").asInstanceOf[IAccessibleTarget]

inline def autoDetectFormat(data: Any): (/* import warning: importer.ImportType#apply Failed type conversion: typeof TextFormat */ js.Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectFormat")(data.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: typeof TextFormat */ js.Any) | Null]

inline def autoDetectRenderer(): typingsJapgolly.pixiCore.mod.AbstractRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectRenderer")().asInstanceOf[typingsJapgolly.pixiCore.mod.AbstractRenderer]
inline def autoDetectRenderer(options: IRendererOptionsAuto): typingsJapgolly.pixiCore.mod.AbstractRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectRenderer")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.pixiCore.mod.AbstractRenderer]

inline def autoDetectResource[R /* <: typingsJapgolly.pixiCore.mod.Resource */, RO](source: Any): R = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any]).asInstanceOf[R]
inline def autoDetectResource[R /* <: typingsJapgolly.pixiCore.mod.Resource */, RO](source: Any, options: RO): R = (^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[R]

inline def checkMaxIfStatementsInShader(maxIfs: Double, gl: IRenderingContext): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checkMaxIfStatementsInShader")(maxIfs.asInstanceOf[js.Any], gl.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def createUBOElements(uniformData: js.Array[IUniformData]): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("createUBOElements")(uniformData.asInstanceOf[js.Any]).asInstanceOf[Size]

inline def defaultFilterVertex: String = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultFilterVertex").asInstanceOf[String]

inline def defaultVertex: String = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultVertex").asInstanceOf[String]

inline def generateProgram(gl: IRenderingContext, program: typingsJapgolly.pixiCore.mod.Program): typingsJapgolly.pixiCore.mod.GLProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("generateProgram")(gl.asInstanceOf[js.Any], program.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.GLProgram]

inline def generateUniformBufferSync(group: typingsJapgolly.pixiCore.mod.UniformGroup[Dict[Any]], uniformData: Dict[Any]): SyncFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("generateUniformBufferSync")(group.asInstanceOf[js.Any], uniformData.asInstanceOf[js.Any])).asInstanceOf[SyncFunc]

inline def getTestContext(): WebGLRenderingContext | WebGL2RenderingContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestContext")().asInstanceOf[WebGLRenderingContext | WebGL2RenderingContext]

inline def getUBOData(uniforms: Dict[Any], uniformData: Dict[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUBOData")(uniforms.asInstanceOf[js.Any], uniformData.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def interactiveTarget: InteractiveTarget_ = ^.asInstanceOf[js.Dynamic].selectDynamic("interactiveTarget").asInstanceOf[InteractiveTarget_]

inline def isMobile: isMobileResult = ^.asInstanceOf[js.Dynamic].selectDynamic("isMobile").asInstanceOf[isMobileResult]

inline def parseDDS(arrayBuffer: js.typedarray.ArrayBuffer): js.Array[typingsJapgolly.pixiCompressedTextures.mod.CompressedTextureResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDDS")(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.pixiCompressedTextures.mod.CompressedTextureResource]]

inline def parseKTX(url: String, arrayBuffer: js.typedarray.ArrayBuffer): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKTX")(url.asInstanceOf[js.Any], arrayBuffer.asInstanceOf[js.Any])).asInstanceOf[Compressed]
inline def parseKTX(url: String, arrayBuffer: js.typedarray.ArrayBuffer, loadKeyValueData: Boolean): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKTX")(url.asInstanceOf[js.Any], arrayBuffer.asInstanceOf[js.Any], loadKeyValueData.asInstanceOf[js.Any])).asInstanceOf[Compressed]

inline def settings: ISettings = ^.asInstanceOf[js.Dynamic].selectDynamic("settings").asInstanceOf[ISettings]

inline def uniformParsers: js.Array[IUniformParser] = ^.asInstanceOf[js.Dynamic].selectDynamic("uniformParsers").asInstanceOf[js.Array[IUniformParser]]
