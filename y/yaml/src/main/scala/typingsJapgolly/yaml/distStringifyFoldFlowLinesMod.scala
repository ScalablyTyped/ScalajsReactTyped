package typingsJapgolly.yaml

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStringifyFoldFlowLinesMod {
  
  @JSImport("yaml/dist/stringify/foldFlowLines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yaml/dist/stringify/foldFlowLines", "FOLD_BLOCK")
  @js.native
  val FOLD_BLOCK: /* "block" */ String = js.native
  
  @JSImport("yaml/dist/stringify/foldFlowLines", "FOLD_FLOW")
  @js.native
  val FOLD_FLOW: /* "flow" */ String = js.native
  
  @JSImport("yaml/dist/stringify/foldFlowLines", "FOLD_QUOTED")
  @js.native
  val FOLD_QUOTED: /* "quoted" */ String = js.native
  
  inline def foldFlowLines(text: String, indent: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldFlowLines")(text.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def foldFlowLines(
    text: String,
    indent: String,
    mode: Unit,
    hasIndentAtStartLineWidthMinContentWidthOnFoldOnOverflow: FoldOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldFlowLines")(text.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], hasIndentAtStartLineWidthMinContentWidthOnFoldOnOverflow.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def foldFlowLines(text: String, indent: String, mode: FoldMode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldFlowLines")(text.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def foldFlowLines(
    text: String,
    indent: String,
    mode: FoldMode,
    hasIndentAtStartLineWidthMinContentWidthOnFoldOnOverflow: FoldOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldFlowLines")(text.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], hasIndentAtStartLineWidthMinContentWidthOnFoldOnOverflow.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.yaml.yamlStrings.flow
    - typingsJapgolly.yaml.yamlStrings.block
    - typingsJapgolly.yaml.yamlStrings.quoted
  */
  trait FoldMode extends StObject
  object FoldMode {
    
    inline def block: typingsJapgolly.yaml.yamlStrings.block = "block".asInstanceOf[typingsJapgolly.yaml.yamlStrings.block]
    
    inline def flow: typingsJapgolly.yaml.yamlStrings.flow = "flow".asInstanceOf[typingsJapgolly.yaml.yamlStrings.flow]
    
    inline def quoted: typingsJapgolly.yaml.yamlStrings.quoted = "quoted".asInstanceOf[typingsJapgolly.yaml.yamlStrings.quoted]
  }
  
  trait FoldOptions extends StObject {
    
    /**
      * Accounts for leading contents on the first line, defaulting to
      * `indent.length`
      */
    var indentAtStart: js.UndefOr[Double] = js.undefined
    
    /** Default: `80` */
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Allow highly indented lines to stretch the line width or indent content
      * from the start.
      *
      * Default: `20`
      */
    var minContentWidth: js.UndefOr[Double] = js.undefined
    
    /** Called once if the text is folded */
    var onFold: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Called once if any line of text exceeds lineWidth characters */
    var onOverflow: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object FoldOptions {
    
    inline def apply(): FoldOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FoldOptions]
    }
    
    extension [Self <: FoldOptions](x: Self) {
      
      inline def setIndentAtStart(value: Double): Self = StObject.set(x, "indentAtStart", value.asInstanceOf[js.Any])
      
      inline def setIndentAtStartUndefined: Self = StObject.set(x, "indentAtStart", js.undefined)
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      inline def setMinContentWidth(value: Double): Self = StObject.set(x, "minContentWidth", value.asInstanceOf[js.Any])
      
      inline def setMinContentWidthUndefined: Self = StObject.set(x, "minContentWidth", js.undefined)
      
      inline def setOnFold(value: Callback): Self = StObject.set(x, "onFold", value.toJsFn)
      
      inline def setOnFoldUndefined: Self = StObject.set(x, "onFold", js.undefined)
      
      inline def setOnOverflow(value: Callback): Self = StObject.set(x, "onOverflow", value.toJsFn)
      
      inline def setOnOverflowUndefined: Self = StObject.set(x, "onOverflow", js.undefined)
    }
  }
}
