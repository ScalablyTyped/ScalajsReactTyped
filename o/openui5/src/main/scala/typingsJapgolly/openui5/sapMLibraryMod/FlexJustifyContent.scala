package typingsJapgolly.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlexJustifyContent extends StObject
@JSImport("sap/m/library", "FlexJustifyContent")
@js.native
object FlexJustifyContent extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FlexJustifyContent & String] = js.native
  
  /**
    * Flex items are packed toward the center of the line.
    */
  @js.native
  sealed trait Center
    extends StObject
       with FlexJustifyContent
  /* "Center" */ val Center: typingsJapgolly.openui5.sapMLibraryMod.FlexJustifyContent.Center & String = js.native
  
  /**
    * Flex items are packed toward the end of the line.
    */
  @js.native
  sealed trait End
    extends StObject
       with FlexJustifyContent
  /* "End" */ val End: typingsJapgolly.openui5.sapMLibraryMod.FlexJustifyContent.End & String = js.native
  
  /**
    * Inherits the value from its parent.
    */
  @js.native
  sealed trait Inherit
    extends StObject
       with FlexJustifyContent
  /* "Inherit" */ val Inherit: typingsJapgolly.openui5.sapMLibraryMod.FlexJustifyContent.Inherit & String = js.native
  
  /**
    * Flex items are evenly distributed in the line, with half-size spaces on either end.
    */
  @js.native
  sealed trait SpaceAround
    extends StObject
       with FlexJustifyContent
  /* "SpaceAround" */ val SpaceAround: typingsJapgolly.openui5.sapMLibraryMod.FlexJustifyContent.SpaceAround & String = js.native
  
  /**
    * Flex items are evenly distributed in the line.
    */
  @js.native
  sealed trait SpaceBetween
    extends StObject
       with FlexJustifyContent
  /* "SpaceBetween" */ val SpaceBetween: typingsJapgolly.openui5.sapMLibraryMod.FlexJustifyContent.SpaceBetween & String = js.native
  
  /**
    * Flex items are packed toward the start of the line.
    */
  @js.native
  sealed trait Start
    extends StObject
       with FlexJustifyContent
  /* "Start" */ val Start: typingsJapgolly.openui5.sapMLibraryMod.FlexJustifyContent.Start & String = js.native
}
