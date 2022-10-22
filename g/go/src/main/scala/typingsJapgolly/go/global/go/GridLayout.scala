package typingsJapgolly.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This simple layout places all of the Parts in a grid-like arrangement, ordered, spaced apart,
  * and wrapping as needed.  It ignores any Links connecting the Nodes being laid out.
  */
@JSGlobal("go.GridLayout")
@js.native
/**
  * This simple layout places all of the Parts in a grid-like arrangement, ordered, spaced apart,
  * and wrapping as needed.  It ignores any Links connecting the Nodes being laid out.
  */
open class GridLayout ()
  extends typingsJapgolly.go.mod.GridLayout
object GridLayout {
  
  @JSGlobal("go.GridLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**Lay out each child according to the sort order given by GridLayout.comparer; This value is used for GridLayout.sorting.*/
  /* static member */
  @JSGlobal("go.GridLayout.Ascending")
  @js.native
  def Ascending: typingsJapgolly.go.mod.EnumValue = js.native
  inline def Ascending_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ascending")(x.asInstanceOf[js.Any])
  
  /**Lay out each child in reverse sort order given by GridLayout.comparer; This value is used for GridLayout.sorting.*/
  /* static member */
  @JSGlobal("go.GridLayout.Descending")
  @js.native
  def Descending: typingsJapgolly.go.mod.EnumValue = js.native
  inline def Descending_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Descending")(x.asInstanceOf[js.Any])
  
  /**Lay out each child in the order in which they were found; This value is used for GridLayout.sorting.*/
  /* static member */
  @JSGlobal("go.GridLayout.Forward")
  @js.native
  def Forward: typingsJapgolly.go.mod.EnumValue = js.native
  inline def Forward_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Forward")(x.asInstanceOf[js.Any])
  
  /**Fill each row from left to right; This value is used for GridLayout.arrangement.*/
  /* static member */
  @JSGlobal("go.GridLayout.LeftToRight")
  @js.native
  def LeftToRight: typingsJapgolly.go.mod.EnumValue = js.native
  inline def LeftToRight_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LeftToRight")(x.asInstanceOf[js.Any])
  
  /**Position the part's Part.location at a grid point; This value is used for GridLayout.alignment.*/
  /* static member */
  @JSGlobal("go.GridLayout.Location")
  @js.native
  def Location: typingsJapgolly.go.mod.EnumValue = js.native
  inline def Location_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Location")(x.asInstanceOf[js.Any])
  
  /**Position the top-left corner of each part at a grid point; This value is used for GridLayout.alignment.*/
  /* static member */
  @JSGlobal("go.GridLayout.Position")
  @js.native
  def Position: typingsJapgolly.go.mod.EnumValue = js.native
  inline def Position_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Position")(x.asInstanceOf[js.Any])
  
  /**Lay out each child in reverse order from which they were found; This value is used for GridLayout.sorting.*/
  /* static member */
  @JSGlobal("go.GridLayout.Reverse")
  @js.native
  def Reverse: typingsJapgolly.go.mod.EnumValue = js.native
  inline def Reverse_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reverse")(x.asInstanceOf[js.Any])
  
  /**Fill each row from right to left; This value is used for GridLayout.arrangement.*/
  /* static member */
  @JSGlobal("go.GridLayout.RightToLeft")
  @js.native
  def RightToLeft: typingsJapgolly.go.mod.EnumValue = js.native
  inline def RightToLeft_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RightToLeft")(x.asInstanceOf[js.Any])
}
