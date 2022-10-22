package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMath extends StObject {
  
  var AlignPoint: Double
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val ArgIndex: Double
  
  var ArgSize: Double
  
  val Breaks: OMathBreaks
  
  def BuildUp(): Unit
  
  def ConvertToLiteralText(): Unit
  
  def ConvertToMathText(): Unit
  
  def ConvertToNormalText(): Unit
  
  val Creator: Double
  
  val Functions: OMathFunctions
  
  var Justification: WdOMathJc
  
  def Linearize(): Unit
  
  val NestingLevel: Double
  
  val Parent: Any
  
  val ParentArg: OMath
  
  val ParentCol: OMathMatCol
  
  val ParentFunction: OMathFunction
  
  val ParentOMath: OMath
  
  val ParentRow: OMathMatRow
  
  val Range: typingsJapgolly.activexWord.Word.Range
  
  def Remove(): Unit
  
  var Type: WdOMathType
  
  /* private */ @JSName("Word.OMath_typekey")
  var WordDotOMath_typekey: OMath
}
object OMath {
  
  inline def apply(
    AlignPoint: Double,
    Application: Application,
    ArgIndex: Double,
    ArgSize: Double,
    Breaks: OMathBreaks,
    BuildUp: Callback,
    ConvertToLiteralText: Callback,
    ConvertToMathText: Callback,
    ConvertToNormalText: Callback,
    Creator: Double,
    Functions: OMathFunctions,
    Justification: WdOMathJc,
    Linearize: Callback,
    NestingLevel: Double,
    Parent: Any,
    ParentArg: OMath,
    ParentCol: OMathMatCol,
    ParentFunction: OMathFunction,
    ParentOMath: OMath,
    ParentRow: OMathMatRow,
    Range: Range,
    Remove: Callback,
    Type: WdOMathType,
    WordDotOMath_typekey: OMath
  ): OMath = {
    val __obj = js.Dynamic.literal(AlignPoint = AlignPoint.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ArgIndex = ArgIndex.asInstanceOf[js.Any], ArgSize = ArgSize.asInstanceOf[js.Any], Breaks = Breaks.asInstanceOf[js.Any], BuildUp = BuildUp.toJsFn, ConvertToLiteralText = ConvertToLiteralText.toJsFn, ConvertToMathText = ConvertToMathText.toJsFn, ConvertToNormalText = ConvertToNormalText.toJsFn, Creator = Creator.asInstanceOf[js.Any], Functions = Functions.asInstanceOf[js.Any], Justification = Justification.asInstanceOf[js.Any], Linearize = Linearize.toJsFn, NestingLevel = NestingLevel.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ParentArg = ParentArg.asInstanceOf[js.Any], ParentCol = ParentCol.asInstanceOf[js.Any], ParentFunction = ParentFunction.asInstanceOf[js.Any], ParentOMath = ParentOMath.asInstanceOf[js.Any], ParentRow = ParentRow.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Remove = Remove.toJsFn, Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMath_typekey")(WordDotOMath_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMath]
  }
  
  extension [Self <: OMath](x: Self) {
    
    inline def setAlignPoint(value: Double): Self = StObject.set(x, "AlignPoint", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setArgIndex(value: Double): Self = StObject.set(x, "ArgIndex", value.asInstanceOf[js.Any])
    
    inline def setArgSize(value: Double): Self = StObject.set(x, "ArgSize", value.asInstanceOf[js.Any])
    
    inline def setBreaks(value: OMathBreaks): Self = StObject.set(x, "Breaks", value.asInstanceOf[js.Any])
    
    inline def setBuildUp(value: Callback): Self = StObject.set(x, "BuildUp", value.toJsFn)
    
    inline def setConvertToLiteralText(value: Callback): Self = StObject.set(x, "ConvertToLiteralText", value.toJsFn)
    
    inline def setConvertToMathText(value: Callback): Self = StObject.set(x, "ConvertToMathText", value.toJsFn)
    
    inline def setConvertToNormalText(value: Callback): Self = StObject.set(x, "ConvertToNormalText", value.toJsFn)
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFunctions(value: OMathFunctions): Self = StObject.set(x, "Functions", value.asInstanceOf[js.Any])
    
    inline def setJustification(value: WdOMathJc): Self = StObject.set(x, "Justification", value.asInstanceOf[js.Any])
    
    inline def setLinearize(value: Callback): Self = StObject.set(x, "Linearize", value.toJsFn)
    
    inline def setNestingLevel(value: Double): Self = StObject.set(x, "NestingLevel", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setParentArg(value: OMath): Self = StObject.set(x, "ParentArg", value.asInstanceOf[js.Any])
    
    inline def setParentCol(value: OMathMatCol): Self = StObject.set(x, "ParentCol", value.asInstanceOf[js.Any])
    
    inline def setParentFunction(value: OMathFunction): Self = StObject.set(x, "ParentFunction", value.asInstanceOf[js.Any])
    
    inline def setParentOMath(value: OMath): Self = StObject.set(x, "ParentOMath", value.asInstanceOf[js.Any])
    
    inline def setParentRow(value: OMathMatRow): Self = StObject.set(x, "ParentRow", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "Remove", value.toJsFn)
    
    inline def setType(value: WdOMathType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMath_typekey(value: OMath): Self = StObject.set(x, "Word.OMath_typekey", value.asInstanceOf[js.Any])
  }
}
