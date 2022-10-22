package typingsJapgolly.inferno.distCoreTypesMod.Inferno

import org.scalajs.dom.HTMLElement
import typingsJapgolly.inferno.distCoreTypesMod.IComponent
import typingsJapgolly.inferno.distCoreTypesMod.Inferno.^
import typingsJapgolly.inferno.distCoreTypesMod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.inferno.infernoStrings.alert
  - typingsJapgolly.inferno.infernoStrings.alertdialog
  - typingsJapgolly.inferno.infernoStrings.application
  - typingsJapgolly.inferno.infernoStrings.article
  - typingsJapgolly.inferno.infernoStrings.banner
  - typingsJapgolly.inferno.infernoStrings.button
  - typingsJapgolly.inferno.infernoStrings.cell
  - typingsJapgolly.inferno.infernoStrings.checkbox
  - typingsJapgolly.inferno.infernoStrings.columnheader
  - typingsJapgolly.inferno.infernoStrings.combobox
  - typingsJapgolly.inferno.infernoStrings.complementary
  - typingsJapgolly.inferno.infernoStrings.contentinfo
  - typingsJapgolly.inferno.infernoStrings.definition
  - typingsJapgolly.inferno.infernoStrings.dialog
  - typingsJapgolly.inferno.infernoStrings.directory
  - typingsJapgolly.inferno.infernoStrings.document
  - typingsJapgolly.inferno.infernoStrings.feed
  - typingsJapgolly.inferno.infernoStrings.figure
  - typingsJapgolly.inferno.infernoStrings.form
  - typingsJapgolly.inferno.infernoStrings.grid
  - typingsJapgolly.inferno.infernoStrings.gridcell
  - typingsJapgolly.inferno.infernoStrings.group
  - typingsJapgolly.inferno.infernoStrings.heading
  - typingsJapgolly.inferno.infernoStrings.img
  - typingsJapgolly.inferno.infernoStrings.link
  - typingsJapgolly.inferno.infernoStrings.list
  - typingsJapgolly.inferno.infernoStrings.listbox
  - typingsJapgolly.inferno.infernoStrings.listitem
  - typingsJapgolly.inferno.infernoStrings.log
  - typingsJapgolly.inferno.infernoStrings.main
  - typingsJapgolly.inferno.infernoStrings.marquee
  - typingsJapgolly.inferno.infernoStrings.math
  - typingsJapgolly.inferno.infernoStrings.menu
  - typingsJapgolly.inferno.infernoStrings.menubar
  - typingsJapgolly.inferno.infernoStrings.menuitem
  - typingsJapgolly.inferno.infernoStrings.menuitemcheckbox
  - typingsJapgolly.inferno.infernoStrings.menuitemradio
  - typingsJapgolly.inferno.infernoStrings.navigation
  - typingsJapgolly.inferno.infernoStrings.none
  - typingsJapgolly.inferno.infernoStrings.note
  - typingsJapgolly.inferno.infernoStrings.option
  - typingsJapgolly.inferno.infernoStrings.presentation
  - typingsJapgolly.inferno.infernoStrings.progressbar
  - typingsJapgolly.inferno.infernoStrings.radio
  - typingsJapgolly.inferno.infernoStrings.radiogroup
  - typingsJapgolly.inferno.infernoStrings.region
  - typingsJapgolly.inferno.infernoStrings.row
  - typingsJapgolly.inferno.infernoStrings.rowgroup
  - typingsJapgolly.inferno.infernoStrings.rowheader
  - typingsJapgolly.inferno.infernoStrings.scrollbar
  - typingsJapgolly.inferno.infernoStrings.search
  - typingsJapgolly.inferno.infernoStrings.searchbox
  - typingsJapgolly.inferno.infernoStrings.separator
  - typingsJapgolly.inferno.infernoStrings.slider
  - typingsJapgolly.inferno.infernoStrings.spinbutton
  - typingsJapgolly.inferno.infernoStrings.status
  - typingsJapgolly.inferno.infernoStrings.switch
  - typingsJapgolly.inferno.infernoStrings.tab
  - typingsJapgolly.inferno.infernoStrings.table
  - typingsJapgolly.inferno.infernoStrings.tablist
  - typingsJapgolly.inferno.infernoStrings.tabpanel
  - typingsJapgolly.inferno.infernoStrings.term
  - typingsJapgolly.inferno.infernoStrings.textbox
  - typingsJapgolly.inferno.infernoStrings.timer
  - typingsJapgolly.inferno.infernoStrings.toolbar
  - typingsJapgolly.inferno.infernoStrings.tooltip
  - typingsJapgolly.inferno.infernoStrings.tree
  - typingsJapgolly.inferno.infernoStrings.treegrid
  - typingsJapgolly.inferno.infernoStrings.treeitem
  - java.lang.String
*/
type AriaRole = _AriaRole | String

type AudioHTMLAttributes[T] = MediaHTMLAttributes[T]

type CElement[P, T /* <: IComponent[P, ComponentState] */] = ComponentElement[P, T]

type CFactory[P, T /* <: IComponent[P, ComponentState] */] = ComponentFactory[P, T]

type ClassicElement[P] = CElement[P, ClassicComponent[P, ComponentState]]

type ClassicFactory[P] = CFactory[P, ClassicComponent[P, ComponentState]]

type ComponentState = js.Object

type DetailedHTMLProps[E /* <: HTMLAttributes[T] */, T] = ClassAttributes[T] & E

type ExoticComponent[P] = js.Function1[/* props */ P, InfernoElement[Any]]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.inferno.infernoStrings._self
  - typingsJapgolly.inferno.infernoStrings._blank
  - typingsJapgolly.inferno.infernoStrings._parent
  - typingsJapgolly.inferno.infernoStrings._top
  - java.lang.String
*/
type HTMLAttributeAnchorTarget = _HTMLAttributeAnchorTarget | String

type HTMLFactory[T /* <: HTMLElement */] = DetailedHTMLFactory[AllHTMLAttributes[T], T]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.inferno.infernoStrings.button
  - typingsJapgolly.inferno.infernoStrings.checkbox
  - typingsJapgolly.inferno.infernoStrings.color
  - typingsJapgolly.inferno.infernoStrings.date
  - typingsJapgolly.inferno.infernoStrings.`datetime-local`
  - typingsJapgolly.inferno.infernoStrings.email
  - typingsJapgolly.inferno.infernoStrings.file
  - typingsJapgolly.inferno.infernoStrings.hidden
  - typingsJapgolly.inferno.infernoStrings.image
  - typingsJapgolly.inferno.infernoStrings.month
  - typingsJapgolly.inferno.infernoStrings.number
  - typingsJapgolly.inferno.infernoStrings.password
  - typingsJapgolly.inferno.infernoStrings.radio
  - typingsJapgolly.inferno.infernoStrings.range
  - typingsJapgolly.inferno.infernoStrings.reset
  - typingsJapgolly.inferno.infernoStrings.search
  - typingsJapgolly.inferno.infernoStrings.submit
  - typingsJapgolly.inferno.infernoStrings.tel
  - typingsJapgolly.inferno.infernoStrings.text
  - typingsJapgolly.inferno.infernoStrings.time
  - typingsJapgolly.inferno.infernoStrings.url
  - typingsJapgolly.inferno.infernoStrings.week
  - java.lang.String
*/
type HTMLInputTypeAttribute = _HTMLInputTypeAttribute | String

type InfernoChild = InfernoElement[Any] | InfernoText

type InfernoFragment = js.Object | InfernoNodeArray

type InfernoHTMLElement[T /* <: HTMLElement */] = DetailedInfernoHTMLElement[AllHTMLAttributes[T], T]

type InfernoNode = js.UndefOr[InfernoChild | InfernoFragment | Boolean | Null]

type InfernoText = String | Double

type Key = String | Double

type Ref[T] = String | (js.Function1[/* instance */ T | Null, Any]) | RefObject[T]

type SFC[P] = StatelessComponent[P]
