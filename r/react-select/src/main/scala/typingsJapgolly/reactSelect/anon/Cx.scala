package typingsJapgolly.reactSelect.anon

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsMenuMod.ChildrenProps
import typingsJapgolly.reactSelect.distDeclarationsSrcSelectMod.Props
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CX
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CoercedMenuPlacement
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GetStyles
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.MenuPlacement
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.MenuPosition
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.OnChangeValue
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.OptionsOrGroups
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.SetValueAction
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cx[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends StObject {
  
  var children: (js.Function1[/* childrenProps */ ChildrenProps, Node]) & Node = js.native
  
  def clearValue(): Unit = js.native
  
  var cx: CX = js.native
  
  var getStyles: GetStyles[Option, IsMulti, Group] = js.native
  
  def getValue(): typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.Options[Option] = js.native
  
  var hasValue: Boolean = js.native
  
  var isMulti: Boolean = js.native
  
  var isRtl: Boolean = js.native
  
  var maxHeight: Double = js.native
  
  var maxMenuHeight: Double = js.native
  
  var menuPlacement: MenuPlacement = js.native
  
  var menuPosition: MenuPosition = js.native
  
  var menuShouldScrollIntoView: Boolean = js.native
  
  var minMenuHeight: Double = js.native
  
  var options: OptionsOrGroups[Option, Group] = js.native
  
  var placement: CoercedMenuPlacement = js.native
  
  def selectOption(newValue: Option): Unit = js.native
  
  var selectProps: Props[Option, IsMulti, Group] = js.native
  
  def setValue(newValue: OnChangeValue[Option, IsMulti], action: SetValueAction): Unit = js.native
  def setValue(newValue: OnChangeValue[Option, IsMulti], action: SetValueAction, option: Option): Unit = js.native
  
  var theme: Theme = js.native
}
