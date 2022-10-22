package typingsJapgolly.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The RowColumnDefinition class describes constraints on a row or a column
  * in a Panel of type Panel.Table.
  * It also provides information about the actual layout after the
  * Table Panel has been arranged.
  */
@JSGlobal("go.RowColumnDefinition")
@js.native
/**
  * You do not need to use this constructor, because calls to Panel.getRowDefinition or Panel.getColumnDefinition will automatically create and remember a RowColumnDefinition for you.
  */
open class RowColumnDefinition ()
  extends typingsJapgolly.go.mod.RowColumnDefinition
object RowColumnDefinition {
  
  @JSGlobal("go.RowColumnDefinition")
  @js.native
  val ^ : js.Any = js.native
  
  /**The default .sizing, which resolves to RowColumnDefinition.None or else the Table Panel's rowSizing and columnSizing if present.*/
  /* static member */
  @JSGlobal("go.RowColumnDefinition.Default")
  @js.native
  def Default: typingsJapgolly.go.mod.EnumValue = js.native
  inline def Default_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
  
  /**The default .sizing if none is specified on the Table Panel's rowSizing and columnSizing.*/
  /* static member */
  @JSGlobal("go.RowColumnDefinition.None")
  @js.native
  def None: typingsJapgolly.go.mod.EnumValue = js.native
  inline def None_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /**If a Table Panel is larger than all the rows then this .sizing grants this row and any others with the same value the extra space, apportioned proportionally between them*/
  /* static member */
  @JSGlobal("go.RowColumnDefinition.ProportionalExtra")
  @js.native
  def ProportionalExtra: typingsJapgolly.go.mod.EnumValue = js.native
  inline def ProportionalExtra_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProportionalExtra")(x.asInstanceOf[js.Any])
}
