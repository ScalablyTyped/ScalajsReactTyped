package typingsJapgolly.winrt.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintOptionType extends StObject
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintOptionType")
@js.native
object PrintOptionType extends StObject {
  
  @js.native
  sealed trait itemList
    extends StObject
       with PrintOptionType
  
  @js.native
  sealed trait number
    extends StObject
       with PrintOptionType
  
  @js.native
  sealed trait text
    extends StObject
       with PrintOptionType
  
  @js.native
  sealed trait unknown
    extends StObject
       with PrintOptionType
}
