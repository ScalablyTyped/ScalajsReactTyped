package typingsJapgolly.ecmarkup

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalajs.dom.Text
import typingsJapgolly.ecmarkup.mod.Options
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSpecMod {
  
  @JSImport("ecmarkup/lib/Spec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maybeAddClauseToEffectWorklist(
    effectName: String,
    clause: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ Any,
    worklist: js.Array[WorklistItem]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("maybeAddClauseToEffectWorklist")(effectName.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], worklist.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Spec extends StObject {
    
    def exportBiblio(): Any
    
    var generatedFiles: Map[String | Null, String]
    
    var namespace: String
    
    var opts: Options
    
    var rootDir: String
    
    var rootPath: String
    
    var spec: this.type
  }
  object Spec {
    
    inline def apply(
      exportBiblio: CallbackTo[Any],
      generatedFiles: Map[String | Null, String],
      namespace: String,
      opts: Options,
      rootDir: String,
      rootPath: String,
      spec: Spec
    ): Spec = {
      val __obj = js.Dynamic.literal(exportBiblio = exportBiblio.toJsFn, generatedFiles = generatedFiles.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], rootPath = rootPath.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spec]
    }
    
    extension [Self <: Spec](x: Self) {
      
      inline def setExportBiblio(value: CallbackTo[Any]): Self = StObject.set(x, "exportBiblio", value.toJsFn)
      
      inline def setGeneratedFiles(value: Map[String | Null, String]): Self = StObject.set(x, "generatedFiles", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setOpts(value: Options): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: Spec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ecmarkup.anon.Message
    - typingsJapgolly.ecmarkup.anon.Node
    - typingsJapgolly.ecmarkup.anon.Attr
    - typingsJapgolly.ecmarkup.anon.RuleId
    - typingsJapgolly.ecmarkup.anon.NodeRelativeColumn
    - typingsJapgolly.ecmarkup.anon.Column
  */
  trait Warning extends StObject
  object Warning {
    
    inline def Attr(attr: String, message: String, node: Element, ruleId: String): typingsJapgolly.ecmarkup.anon.Attr = {
      val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("attr")
      __obj.asInstanceOf[typingsJapgolly.ecmarkup.anon.Attr]
    }
    
    inline def Column(column: Double, line: Double, message: String, ruleId: String): typingsJapgolly.ecmarkup.anon.Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("raw")
      __obj.asInstanceOf[typingsJapgolly.ecmarkup.anon.Column]
    }
    
    inline def Message(message: String, ruleId: String): typingsJapgolly.ecmarkup.anon.Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("global")
      __obj.asInstanceOf[typingsJapgolly.ecmarkup.anon.Message]
    }
    
    inline def Node(message: String, node: Text | Element, ruleId: String): typingsJapgolly.ecmarkup.anon.Node = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("node")
      __obj.asInstanceOf[typingsJapgolly.ecmarkup.anon.Node]
    }
    
    inline def NodeRelativeColumn(
      message: String,
      node: Text | Element,
      nodeRelativeColumn: Double,
      nodeRelativeLine: Double,
      ruleId: String
    ): typingsJapgolly.ecmarkup.anon.NodeRelativeColumn = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeRelativeColumn = nodeRelativeColumn.asInstanceOf[js.Any], nodeRelativeLine = nodeRelativeLine.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("contents")
      __obj.asInstanceOf[typingsJapgolly.ecmarkup.anon.NodeRelativeColumn]
    }
    
    inline def RuleId(attr: String, message: String, node: Element, ruleId: String): typingsJapgolly.ecmarkup.anon.RuleId = {
      val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("attr-value")
      __obj.asInstanceOf[typingsJapgolly.ecmarkup.anon.RuleId]
    }
  }
  
  trait WorklistItem extends StObject {
    
    var aoid: String | Null
    
    var effects: js.Array[String]
  }
  object WorklistItem {
    
    inline def apply(effects: js.Array[String]): WorklistItem = {
      val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], aoid = null)
      __obj.asInstanceOf[WorklistItem]
    }
    
    extension [Self <: WorklistItem](x: Self) {
      
      inline def setAoid(value: String): Self = StObject.set(x, "aoid", value.asInstanceOf[js.Any])
      
      inline def setAoidNull: Self = StObject.set(x, "aoid", null)
      
      inline def setEffects(value: js.Array[String]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      inline def setEffectsVarargs(value: String*): Self = StObject.set(x, "effects", js.Array(value*))
    }
  }
}
