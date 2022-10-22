package typingsJapgolly.morrisJs

import typingsJapgolly.morrisJs.morris.IAreaOptions
import typingsJapgolly.morrisJs.morris.IBarOptions
import typingsJapgolly.morrisJs.morris.IDonutOptions
import typingsJapgolly.morrisJs.morris.ILineOptions
import typingsJapgolly.morrisJs.morris.MorrisStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Morris")
  @js.native
  def Morris_ : MorrisStatic = js.native
  
  inline def Morris__=(x: MorrisStatic): Unit = js.Dynamic.global.updateDynamic("Morris")(x.asInstanceOf[js.Any])
  
  object morris {
    
    @JSGlobal("morris.DonutChart")
    @js.native
    open class DonutChart ()
      extends StObject
         with typingsJapgolly.morrisJs.morris.DonutChart
    
    @JSGlobal("morris.GridChart")
    @js.native
    open class GridChart ()
      extends StObject
         with typingsJapgolly.morrisJs.morris.GridChart
    
    @JSGlobal("morris.MorrisStatic")
    @js.native
    open class MorrisStatic ()
      extends StObject
         with typingsJapgolly.morrisJs.morris.MorrisStatic {
      
      /** Create an area chart. */
      /* CompleteClass */
      override def Area(options: IAreaOptions): typingsJapgolly.morrisJs.morris.GridChart = js.native
      
      /** Create a bar chart. */
      /* CompleteClass */
      override def Bar(options: IBarOptions): typingsJapgolly.morrisJs.morris.GridChart = js.native
      
      /** Create a Donut chart. */
      /* CompleteClass */
      override def Donut(options: IDonutOptions): typingsJapgolly.morrisJs.morris.DonutChart = js.native
      
      /** Create a line chart. */
      /* CompleteClass */
      override def Line(options: ILineOptions): typingsJapgolly.morrisJs.morris.GridChart = js.native
    }
  }
}
