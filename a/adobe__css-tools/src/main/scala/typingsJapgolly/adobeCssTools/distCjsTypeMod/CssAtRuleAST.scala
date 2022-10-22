package typingsJapgolly.adobeCssTools.distCjsTypeMod

import typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.`import`
import typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.charset
import typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.comment
import typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.customMedia
import typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.document
import typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.fontFace
import typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.host
import typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.keyframes
import typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.media
import typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.namespace
import typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.page
import typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.rule
import typingsJapgolly.adobeCssTools.distCjsTypeMod.CssTypes.supports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.adobeCssTools.distCjsTypeMod.CssRuleAST
  - typingsJapgolly.adobeCssTools.distCjsTypeMod.CssCommentAST
  - typingsJapgolly.adobeCssTools.distCjsTypeMod.CssCharsetAST
  - typingsJapgolly.adobeCssTools.distCjsTypeMod.CssCustomMediaAST
  - typingsJapgolly.adobeCssTools.distCjsTypeMod.CssDocumentAST
  - typingsJapgolly.adobeCssTools.distCjsTypeMod.CssFontFaceAST
  - typingsJapgolly.adobeCssTools.distCjsTypeMod.CssHostAST
  - typingsJapgolly.adobeCssTools.distCjsTypeMod.CssImportAST
  - typingsJapgolly.adobeCssTools.distCjsTypeMod.CssKeyframesAST
  - typingsJapgolly.adobeCssTools.distCjsTypeMod.CssMediaAST
  - typingsJapgolly.adobeCssTools.distCjsTypeMod.CssNamespaceAST
  - typingsJapgolly.adobeCssTools.distCjsTypeMod.CssPageAST
  - typingsJapgolly.adobeCssTools.distCjsTypeMod.CssSupportsAST
*/
trait CssAtRuleAST
  extends StObject
     with CssAllNodesAST
object CssAtRuleAST {
  
  inline def CssCharsetAST(charset: String, `type`: charset): typingsJapgolly.adobeCssTools.distCjsTypeMod.CssCharsetAST = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.adobeCssTools.distCjsTypeMod.CssCharsetAST]
  }
  
  inline def CssCommentAST(comment: String, `type`: comment): typingsJapgolly.adobeCssTools.distCjsTypeMod.CssCommentAST = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.adobeCssTools.distCjsTypeMod.CssCommentAST]
  }
  
  inline def CssCustomMediaAST(media: String, name: String, `type`: customMedia): typingsJapgolly.adobeCssTools.distCjsTypeMod.CssCustomMediaAST = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.adobeCssTools.distCjsTypeMod.CssCustomMediaAST]
  }
  
  inline def CssDocumentAST(document: String, rules: js.Array[CssAtRuleAST], `type`: document): typingsJapgolly.adobeCssTools.distCjsTypeMod.CssDocumentAST = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.adobeCssTools.distCjsTypeMod.CssDocumentAST]
  }
  
  inline def CssFontFaceAST(declarations: js.Array[CssDeclarationAST | CssCommentAST], `type`: fontFace): typingsJapgolly.adobeCssTools.distCjsTypeMod.CssFontFaceAST = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.adobeCssTools.distCjsTypeMod.CssFontFaceAST]
  }
  
  inline def CssHostAST(rules: js.Array[CssAtRuleAST], `type`: host): typingsJapgolly.adobeCssTools.distCjsTypeMod.CssHostAST = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.adobeCssTools.distCjsTypeMod.CssHostAST]
  }
  
  inline def CssImportAST(`import`: String, `type`: `import`): typingsJapgolly.adobeCssTools.distCjsTypeMod.CssImportAST = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.adobeCssTools.distCjsTypeMod.CssImportAST]
  }
  
  inline def CssKeyframesAST(keyframes: js.Array[CssKeyframeAST | CssCommentAST], name: String, `type`: keyframes): typingsJapgolly.adobeCssTools.distCjsTypeMod.CssKeyframesAST = {
    val __obj = js.Dynamic.literal(keyframes = keyframes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.adobeCssTools.distCjsTypeMod.CssKeyframesAST]
  }
  
  inline def CssMediaAST(media: String, rules: js.Array[CssAtRuleAST], `type`: media): typingsJapgolly.adobeCssTools.distCjsTypeMod.CssMediaAST = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.adobeCssTools.distCjsTypeMod.CssMediaAST]
  }
  
  inline def CssNamespaceAST(namespace: String, `type`: namespace): typingsJapgolly.adobeCssTools.distCjsTypeMod.CssNamespaceAST = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.adobeCssTools.distCjsTypeMod.CssNamespaceAST]
  }
  
  inline def CssPageAST(
    declarations: js.Array[CssDeclarationAST | CssCommentAST],
    selectors: js.Array[String],
    `type`: page
  ): typingsJapgolly.adobeCssTools.distCjsTypeMod.CssPageAST = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.adobeCssTools.distCjsTypeMod.CssPageAST]
  }
  
  inline def CssRuleAST(
    declarations: js.Array[CssDeclarationAST | CssCommentAST],
    selectors: js.Array[String],
    `type`: rule
  ): typingsJapgolly.adobeCssTools.distCjsTypeMod.CssRuleAST = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.adobeCssTools.distCjsTypeMod.CssRuleAST]
  }
  
  inline def CssSupportsAST(rules: js.Array[CssAtRuleAST], supports: String, `type`: supports): typingsJapgolly.adobeCssTools.distCjsTypeMod.CssSupportsAST = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.adobeCssTools.distCjsTypeMod.CssSupportsAST]
  }
}
