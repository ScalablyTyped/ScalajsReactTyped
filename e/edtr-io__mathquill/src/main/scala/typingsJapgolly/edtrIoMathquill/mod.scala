package typingsJapgolly.edtrIoMathquill

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.edtrIoMathquill.anon.Edit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Config extends StObject {
    
    var autoCommands: js.UndefOr[String] = js.undefined
    
    var autoOperatorNames: js.UndefOr[String] = js.undefined
    
    var autoSubscriptNumerals: js.UndefOr[Boolean] = js.undefined
    
    var charsThatBreakOutOfSupSub: js.UndefOr[String] = js.undefined
    
    var handlers: js.UndefOr[Edit] = js.undefined
    
    var leftRightIntoCmdGoes: js.UndefOr[String] = js.undefined
    
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    var restrictMismatchedBrackets: js.UndefOr[Boolean] = js.undefined
    
    var spaceBehavesLikeTab: js.UndefOr[Boolean] = js.undefined
    
    var substituteTextarea: js.UndefOr[js.Function0[HTMLTextAreaElement]] = js.undefined
    
    var sumStartsWithNEquals: js.UndefOr[Boolean] = js.undefined
    
    var supSubsRequireOperand: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAutoCommands(value: String): Self = StObject.set(x, "autoCommands", value.asInstanceOf[js.Any])
      
      inline def setAutoCommandsUndefined: Self = StObject.set(x, "autoCommands", js.undefined)
      
      inline def setAutoOperatorNames(value: String): Self = StObject.set(x, "autoOperatorNames", value.asInstanceOf[js.Any])
      
      inline def setAutoOperatorNamesUndefined: Self = StObject.set(x, "autoOperatorNames", js.undefined)
      
      inline def setAutoSubscriptNumerals(value: Boolean): Self = StObject.set(x, "autoSubscriptNumerals", value.asInstanceOf[js.Any])
      
      inline def setAutoSubscriptNumeralsUndefined: Self = StObject.set(x, "autoSubscriptNumerals", js.undefined)
      
      inline def setCharsThatBreakOutOfSupSub(value: String): Self = StObject.set(x, "charsThatBreakOutOfSupSub", value.asInstanceOf[js.Any])
      
      inline def setCharsThatBreakOutOfSupSubUndefined: Self = StObject.set(x, "charsThatBreakOutOfSupSub", js.undefined)
      
      inline def setHandlers(value: Edit): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setLeftRightIntoCmdGoes(value: String): Self = StObject.set(x, "leftRightIntoCmdGoes", value.asInstanceOf[js.Any])
      
      inline def setLeftRightIntoCmdGoesUndefined: Self = StObject.set(x, "leftRightIntoCmdGoes", js.undefined)
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      inline def setRestrictMismatchedBrackets(value: Boolean): Self = StObject.set(x, "restrictMismatchedBrackets", value.asInstanceOf[js.Any])
      
      inline def setRestrictMismatchedBracketsUndefined: Self = StObject.set(x, "restrictMismatchedBrackets", js.undefined)
      
      inline def setSpaceBehavesLikeTab(value: Boolean): Self = StObject.set(x, "spaceBehavesLikeTab", value.asInstanceOf[js.Any])
      
      inline def setSpaceBehavesLikeTabUndefined: Self = StObject.set(x, "spaceBehavesLikeTab", js.undefined)
      
      inline def setSubstituteTextarea(value: CallbackTo[HTMLTextAreaElement]): Self = StObject.set(x, "substituteTextarea", value.toJsFn)
      
      inline def setSubstituteTextareaUndefined: Self = StObject.set(x, "substituteTextarea", js.undefined)
      
      inline def setSumStartsWithNEquals(value: Boolean): Self = StObject.set(x, "sumStartsWithNEquals", value.asInstanceOf[js.Any])
      
      inline def setSumStartsWithNEqualsUndefined: Self = StObject.set(x, "sumStartsWithNEquals", js.undefined)
      
      inline def setSupSubsRequireOperand(value: Boolean): Self = StObject.set(x, "supSubsRequireOperand", value.asInstanceOf[js.Any])
      
      inline def setSupSubsRequireOperandUndefined: Self = StObject.set(x, "supSubsRequireOperand", js.undefined)
    }
  }
  
  @js.native
  trait MQ
    extends StObject
       with MathField {
    
    var L: Double = js.native
    
    var R: Double = js.native
    
    def el(): HTMLElement = js.native
    
    def latex(): String = js.native
    def latex(latex: String): MQ = js.native
    
    def reflow(): MQ = js.native
    
    def revert(): MQ = js.native
  }
  
  trait MathField extends StObject {
    
    def blur(): MQ
    
    def clearSelection(): MQ
    
    def cmd(latex: String): MQ
    
    def config(config: Config): MQ
    
    def focus(): MQ
    
    def keystroke(keys: String): MQ
    
    def moveToDirEnd(direction: Double): MQ
    
    def moveToLeftEnd(): MQ
    
    def moveToRightEnd(): MQ
    
    def select(): MQ
    
    def typedText(text: String): MQ
    
    def write(latex: String): MQ
  }
  object MathField {
    
    inline def apply(
      blur: CallbackTo[MQ],
      clearSelection: CallbackTo[MQ],
      cmd: String => MQ,
      config: Config => MQ,
      focus: CallbackTo[MQ],
      keystroke: String => MQ,
      moveToDirEnd: Double => MQ,
      moveToLeftEnd: CallbackTo[MQ],
      moveToRightEnd: CallbackTo[MQ],
      select: CallbackTo[MQ],
      typedText: String => MQ,
      write: String => MQ
    ): MathField = {
      val __obj = js.Dynamic.literal(blur = blur.toJsFn, clearSelection = clearSelection.toJsFn, cmd = js.Any.fromFunction1(cmd), config = js.Any.fromFunction1(config), focus = focus.toJsFn, keystroke = js.Any.fromFunction1(keystroke), moveToDirEnd = js.Any.fromFunction1(moveToDirEnd), moveToLeftEnd = moveToLeftEnd.toJsFn, moveToRightEnd = moveToRightEnd.toJsFn, select = select.toJsFn, typedText = js.Any.fromFunction1(typedText), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[MathField]
    }
    
    extension [Self <: MathField](x: Self) {
      
      inline def setBlur(value: CallbackTo[MQ]): Self = StObject.set(x, "blur", value.toJsFn)
      
      inline def setClearSelection(value: CallbackTo[MQ]): Self = StObject.set(x, "clearSelection", value.toJsFn)
      
      inline def setCmd(value: String => MQ): Self = StObject.set(x, "cmd", js.Any.fromFunction1(value))
      
      inline def setConfig(value: Config => MQ): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
      
      inline def setFocus(value: CallbackTo[MQ]): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setKeystroke(value: String => MQ): Self = StObject.set(x, "keystroke", js.Any.fromFunction1(value))
      
      inline def setMoveToDirEnd(value: Double => MQ): Self = StObject.set(x, "moveToDirEnd", js.Any.fromFunction1(value))
      
      inline def setMoveToLeftEnd(value: CallbackTo[MQ]): Self = StObject.set(x, "moveToLeftEnd", value.toJsFn)
      
      inline def setMoveToRightEnd(value: CallbackTo[MQ]): Self = StObject.set(x, "moveToRightEnd", value.toJsFn)
      
      inline def setSelect(value: CallbackTo[MQ]): Self = StObject.set(x, "select", value.toJsFn)
      
      inline def setTypedText(value: String => MQ): Self = StObject.set(x, "typedText", js.Any.fromFunction1(value))
      
      inline def setWrite(value: String => MQ): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
