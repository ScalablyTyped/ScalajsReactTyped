package typingsJapgolly.materializecssMaterialize

import org.scalajs.dom.Element
import typingsJapgolly.materializecssMaterialize.M.AutocompleteData
import typingsJapgolly.materializecssMaterialize.M.ChipData
import typingsJapgolly.materializecssMaterialize.anon.PartialAutocompleteOption
import typingsJapgolly.materializecssMaterialize.anon.PartialCarouselOptions
import typingsJapgolly.materializecssMaterialize.anon.PartialChipsOptions
import typingsJapgolly.materializecssMaterialize.anon.PartialCollapsibleOptions
import typingsJapgolly.materializecssMaterialize.anon.PartialDatepickerOptions
import typingsJapgolly.materializecssMaterialize.anon.PartialDropdownOptions
import typingsJapgolly.materializecssMaterialize.anon.PartialFloatingActionButt
import typingsJapgolly.materializecssMaterialize.anon.PartialFormSelectOptions
import typingsJapgolly.materializecssMaterialize.anon.PartialMaterialboxOptions
import typingsJapgolly.materializecssMaterialize.anon.PartialModalOptions
import typingsJapgolly.materializecssMaterialize.anon.PartialParallaxOptions
import typingsJapgolly.materializecssMaterialize.anon.PartialPushpinOptions
import typingsJapgolly.materializecssMaterialize.anon.PartialScrollSpyOptions
import typingsJapgolly.materializecssMaterialize.anon.PartialSidenavOptions
import typingsJapgolly.materializecssMaterialize.anon.PartialSliderOptions
import typingsJapgolly.materializecssMaterialize.anon.PartialTabsOptions
import typingsJapgolly.materializecssMaterialize.anon.PartialTapTargetOptions
import typingsJapgolly.materializecssMaterialize.anon.PartialTimepickerOptions
import typingsJapgolly.materializecssMaterialize.anon.PartialTooltipOptions
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.addChip
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.close
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.deleteChip
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.destroy
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.getSelectedValues
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.gotoDate
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.hours
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.minutes
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.next
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.open
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.pause
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.prev
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.recalculateDimensions
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.select
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.selectChip
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.selectOption
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.set
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.setDate
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.showView
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.start
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.updateData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def autocomplete(): JQuery = js.native
  // Pick<T,K> to check methods exist.
  def autocomplete(
    method: /* keyof @materializecss/materialize.anon.PickAutocompleteopenclose */ open | close | destroy
  ): JQuery = js.native
  def autocomplete(method: selectOption, el: Element): JQuery = js.native
  def autocomplete(method: updateData, data: AutocompleteData): JQuery = js.native
  def autocomplete(options: PartialAutocompleteOption): JQuery = js.native
  
  def carousel(): JQuery = js.native
  def carousel(method: destroy): JQuery = js.native
  def carousel(method: next): JQuery = js.native
  def carousel(method: next, n: Double): JQuery = js.native
  def carousel(method: prev): JQuery = js.native
  def carousel(method: prev, n: Double): JQuery = js.native
  def carousel(method: set): JQuery = js.native
  def carousel(method: set, n: Double): JQuery = js.native
  def carousel(options: PartialCarouselOptions): JQuery = js.native
  
  def characterCounter(): JQuery = js.native
  def characterCounter(method: destroy): JQuery = js.native
  
  def chips(): JQuery = js.native
  def chips(method: addChip, chip: ChipData): JQuery = js.native
  def chips(method: deleteChip): JQuery = js.native
  def chips(method: deleteChip, n: Double): JQuery = js.native
  def chips(method: destroy): JQuery = js.native
  def chips(method: selectChip, n: Double): JQuery = js.native
  def chips(options: PartialChipsOptions): JQuery = js.native
  
  def collapsible(): JQuery = js.native
  def collapsible(method: close, n: Double): JQuery = js.native
  def collapsible(method: destroy): JQuery = js.native
  def collapsible(method: open, n: Double): JQuery = js.native
  def collapsible(options: PartialCollapsibleOptions): JQuery = js.native
  
  def datepicker(): JQuery = js.native
  def datepicker(
    method: /* keyof @materializecss/materialize.anon.PickDatepickeropenclosede */ open | close | destroy
  ): JQuery = js.native
  def datepicker(method: gotoDate, date: js.Date): JQuery = js.native
  def datepicker(method: setDate): JQuery = js.native
  def datepicker(method: setDate, date: js.Date): JQuery = js.native
  def datepicker(options: PartialDatepickerOptions): JQuery = js.native
  
  def dropdown(): JQuery = js.native
  def dropdown(
    method: /* keyof @materializecss/materialize.anon.PickDropdownrecalculateDi */ recalculateDimensions | open | close | destroy
  ): JQuery = js.native
  def dropdown(options: PartialDropdownOptions): JQuery = js.native
  
  def floatingActionButton(): JQuery = js.native
  def floatingActionButton(
    method: /* keyof @materializecss/materialize.anon.PickFloatingActionButtono */ open | close | destroy
  ): JQuery = js.native
  def floatingActionButton(options: PartialFloatingActionButt): JQuery = js.native
  
  def formSelect(): JQuery = js.native
  def formSelect(
    method: /* keyof @materializecss/materialize.anon.PickFormSelectgetSelected */ getSelectedValues | destroy
  ): JQuery = js.native
  def formSelect(options: PartialFormSelectOptions): JQuery = js.native
  
  def materialbox(): JQuery = js.native
  def materialbox(
    method: /* keyof @materializecss/materialize.anon.PickMaterialboxdestroyope */ destroy | open | close
  ): JQuery = js.native
  def materialbox(options: PartialMaterialboxOptions): JQuery = js.native
  
  def modal(): JQuery = js.native
  def modal(
    method: /* keyof @materializecss/materialize.anon.PickModalopenclosedestroy */ open | close | destroy
  ): JQuery = js.native
  def modal(options: PartialModalOptions): JQuery = js.native
  
  def parallax(): JQuery = js.native
  def parallax(method: destroy): JQuery = js.native
  def parallax(options: PartialParallaxOptions): JQuery = js.native
  
  def pushpin(): JQuery = js.native
  def pushpin(method: destroy): JQuery = js.native
  def pushpin(options: PartialPushpinOptions): JQuery = js.native
  
  def range(): JQuery = js.native
  def range(method: destroy): JQuery = js.native
  
  def scrollSpy(): JQuery = js.native
  def scrollSpy(method: destroy): JQuery = js.native
  def scrollSpy(options: PartialScrollSpyOptions): JQuery = js.native
  
  def sidenav(): JQuery = js.native
  def sidenav(
    method: /* keyof @materializecss/materialize.anon.PickSidenavopenclosedestr */ open | close | destroy
  ): JQuery = js.native
  def sidenav(options: PartialSidenavOptions): JQuery = js.native
  
  def slider(): JQuery = js.native
  def slider(
    method: /* keyof @materializecss/materialize.anon.PickSliderpausestartnextp */ next | pause | start | destroy | prev
  ): JQuery = js.native
  def slider(options: PartialSliderOptions): JQuery = js.native
  
  def tabs(): JQuery = js.native
  def tabs(method: destroy): JQuery = js.native
  def tabs(method: select, tabId: String): JQuery = js.native
  def tabs(options: PartialTabsOptions): JQuery = js.native
  
  def tapTarget(): JQuery = js.native
  def tapTarget(
    method: /* keyof @materializecss/materialize.anon.PickTapTargetopenclosedes */ open | close | destroy
  ): JQuery = js.native
  def tapTarget(options: PartialTapTargetOptions): JQuery = js.native
  
  def timepicker(): JQuery = js.native
  def timepicker(
    method: /* keyof @materializecss/materialize.anon.PickTimepickeropenclosede */ open | close | destroy
  ): JQuery = js.native
  def timepicker(method: showView, view: hours | minutes): JQuery = js.native
  def timepicker(options: PartialTimepickerOptions): JQuery = js.native
  
  def tooltip(): JQuery = js.native
  def tooltip(
    method: /* keyof @materializecss/materialize.anon.PickTooltipopenclosedestr */ open | close | destroy
  ): JQuery = js.native
  def tooltip(options: PartialTooltipOptions): JQuery = js.native
}
