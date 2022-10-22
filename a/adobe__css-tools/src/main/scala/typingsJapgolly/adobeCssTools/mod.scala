package typingsJapgolly.adobeCssTools

import typingsJapgolly.adobeCssTools.anon.Column
import typingsJapgolly.adobeCssTools.anon.Silent
import typingsJapgolly.adobeCssTools.distCjsTypeMod.CssStylesheetAST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@adobe/css-tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@adobe/css-tools", JSImport.Default)
  @js.native
  open class default protected ()
    extends typingsJapgolly.adobeCssTools.distCjsCssPositionMod.default {
    def this(start: Column, end: Column, source: String) = this()
  }
  
  @JSImport("@adobe/css-tools", "CssTypes")
  @js.native
  object CssTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes & String] = js.native
    
    /* "charset" */ val charset: typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.charset & String = js.native
    
    /* "comment" */ val comment: typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.comment & String = js.native
    
    /* "custom-media" */ val customMedia: typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.customMedia & String = js.native
    
    /* "declaration" */ val declaration: typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.declaration & String = js.native
    
    /* "document" */ val document: typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.document & String = js.native
    
    /* "font-face" */ val fontFace: typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.fontFace & String = js.native
    
    /* "host" */ val host: typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.host & String = js.native
    
    /* "import" */ val `import`: typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.`import` & String = js.native
    
    /* "keyframe" */ val keyframe: typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.keyframe & String = js.native
    
    /* "keyframes" */ val keyframes: typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.keyframes & String = js.native
    
    /* "media" */ val media: typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.media & String = js.native
    
    /* "namespace" */ val namespace: typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.namespace & String = js.native
    
    /* "page" */ val page: typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.page & String = js.native
    
    /* "rule" */ val rule: typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.rule & String = js.native
    
    /* "stylesheet" */ val stylesheet: typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.stylesheet & String = js.native
    
    /* "supports" */ val supports: typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.supports & String = js.native
  }
  
  inline def parse(css: String): CssStylesheetAST = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(css.asInstanceOf[js.Any]).asInstanceOf[CssStylesheetAST]
  inline def parse(css: String, options: Silent): CssStylesheetAST = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(css.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CssStylesheetAST]
  
  inline def stringify(node: CssStylesheetAST): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringify_0(
    node: CssStylesheetAST,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<new (options : @adobe/css-tools.anon.Compress | undefined): @adobe/css-tools.@adobe/css-tools/dist/cjs/stringify/compiler.default>[0] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
