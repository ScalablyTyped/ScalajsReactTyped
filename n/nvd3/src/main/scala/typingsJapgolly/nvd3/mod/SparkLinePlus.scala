package typingsJapgolly.nvd3.mod

import typingsJapgolly.d3Selection.mod.BaseType
import typingsJapgolly.d3Selection.mod.Selection_
import typingsJapgolly.d3Transition.mod.Transition_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparkLinePlus
  extends StObject
     with SparkLine {
  
  def alignValue(): Boolean = js.native
  def alignValue(value: Boolean): this.type = js.native
  
  /*Message to display if no data is provided*/
  def noData(): String = js.native
  /*Message to display if no data is provided*/
  def noData(value: String): this.type = js.native
  
  def rightAlignValue(): Boolean = js.native
  def rightAlignValue(value: Boolean): this.type = js.native
  
  /*Shows the last value in the sparkline to the right of the line.*/
  def showLastValue(): Boolean = js.native
  /*Shows the last value in the sparkline to the right of the line.*/
  def showLastValue(value: Boolean): this.type = js.native
  
  def sparkline(
    selection: Selection_[
      Any | js.Array[Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
    ],
    args: Any*
  ): Any = js.native
  def sparkline(
    transition: Transition_[
      Any | js.Array[Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
    ],
    args: Any*
  ): Any = js.native
  @JSName("sparkline")
  var sparkline_Original: SparkLine = js.native
  
  def xTickFormat(format: String): this.type = js.native
  def xTickFormat(format: js.Function1[/* d */ Any, String]): this.type = js.native
  def xTickFormat(format: js.Function2[/* d */ Any, /* i */ Any, String]): this.type = js.native
  
  def yTickFormat(format: String): this.type = js.native
  def yTickFormat(format: js.Function1[/* d */ Any, String]): this.type = js.native
  def yTickFormat(format: js.Function2[/* d */ Any, /* i */ Any, String]): this.type = js.native
}
