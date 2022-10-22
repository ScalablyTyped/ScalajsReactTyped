package typingsJapgolly.materializeCss

import org.scalajs.dom.Element
import typingsJapgolly.materializeCss.M.AutocompleteData
import typingsJapgolly.materializeCss.M.ChipData
import typingsJapgolly.materializeCss.anon.PartialAutocompleteOption
import typingsJapgolly.materializeCss.anon.PartialCarouselOptions
import typingsJapgolly.materializeCss.anon.PartialChipsOptions
import typingsJapgolly.materializeCss.anon.PartialCollapsibleOptions
import typingsJapgolly.materializeCss.anon.PartialDatepickerOptions
import typingsJapgolly.materializeCss.anon.PartialDropdownOptions
import typingsJapgolly.materializeCss.anon.PartialFloatingActionButt
import typingsJapgolly.materializeCss.anon.PartialFormSelectOptions
import typingsJapgolly.materializeCss.anon.PartialMaterialboxOptions
import typingsJapgolly.materializeCss.anon.PartialModalOptions
import typingsJapgolly.materializeCss.anon.PartialParallaxOptions
import typingsJapgolly.materializeCss.anon.PartialPushpinOptions
import typingsJapgolly.materializeCss.anon.PartialScrollSpyOptions
import typingsJapgolly.materializeCss.anon.PartialSidenavOptions
import typingsJapgolly.materializeCss.anon.PartialSliderOptions
import typingsJapgolly.materializeCss.anon.PartialTabsOptions
import typingsJapgolly.materializeCss.anon.PartialTapTargetOptions
import typingsJapgolly.materializeCss.anon.PartialTimepickerOptions
import typingsJapgolly.materializeCss.anon.PartialTooltipOptions
import typingsJapgolly.materializeCss.materializeCssStrings.addChip
import typingsJapgolly.materializeCss.materializeCssStrings.close
import typingsJapgolly.materializeCss.materializeCssStrings.deleteChip
import typingsJapgolly.materializeCss.materializeCssStrings.destroy
import typingsJapgolly.materializeCss.materializeCssStrings.getSelectedValues
import typingsJapgolly.materializeCss.materializeCssStrings.gotoDate
import typingsJapgolly.materializeCss.materializeCssStrings.hours
import typingsJapgolly.materializeCss.materializeCssStrings.minutes
import typingsJapgolly.materializeCss.materializeCssStrings.next
import typingsJapgolly.materializeCss.materializeCssStrings.open
import typingsJapgolly.materializeCss.materializeCssStrings.pause
import typingsJapgolly.materializeCss.materializeCssStrings.prev
import typingsJapgolly.materializeCss.materializeCssStrings.recalculateDimensions
import typingsJapgolly.materializeCss.materializeCssStrings.select
import typingsJapgolly.materializeCss.materializeCssStrings.selectChip
import typingsJapgolly.materializeCss.materializeCssStrings.selectOption
import typingsJapgolly.materializeCss.materializeCssStrings.set
import typingsJapgolly.materializeCss.materializeCssStrings.setDate
import typingsJapgolly.materializeCss.materializeCssStrings.showView
import typingsJapgolly.materializeCss.materializeCssStrings.start
import typingsJapgolly.materializeCss.materializeCssStrings.updateData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def autocomplete(): JQuery = js.native
  // Pick<T,K> to check methods exist.
  def autocomplete(method: /* keyof materialize-css.anon.PickAutocompleteopenclose */ open | close | destroy): JQuery = js.native
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
  def datepicker(method: /* keyof materialize-css.anon.PickDatepickeropenclosede */ open | close | destroy): JQuery = js.native
  def datepicker(method: gotoDate, date: js.Date): JQuery = js.native
  def datepicker(method: setDate): JQuery = js.native
  def datepicker(method: setDate, date: js.Date): JQuery = js.native
  def datepicker(options: PartialDatepickerOptions): JQuery = js.native
  
  def dropdown(): JQuery = js.native
  def dropdown(
    method: /* keyof materialize-css.anon.PickDropdownrecalculateDi */ recalculateDimensions | open | close | destroy
  ): JQuery = js.native
  def dropdown(options: PartialDropdownOptions): JQuery = js.native
  
  def floatingActionButton(): JQuery = js.native
  def floatingActionButton(method: /* keyof materialize-css.anon.PickFloatingActionButtono */ open | close | destroy): JQuery = js.native
  def floatingActionButton(options: PartialFloatingActionButt): JQuery = js.native
  
  def formSelect(): JQuery = js.native
  def formSelect(method: /* keyof materialize-css.anon.PickFormSelectgetSelected */ getSelectedValues | destroy): JQuery = js.native
  def formSelect(options: PartialFormSelectOptions): JQuery = js.native
  
  def materialbox(): JQuery = js.native
  def materialbox(method: /* keyof materialize-css.anon.PickMaterialboxdestroyope */ destroy | open | close): JQuery = js.native
  def materialbox(options: PartialMaterialboxOptions): JQuery = js.native
  
  def modal(): JQuery = js.native
  def modal(method: /* keyof materialize-css.anon.PickModalopenclosedestroy */ open | close | destroy): JQuery = js.native
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
  def sidenav(method: /* keyof materialize-css.anon.PickSidenavopenclosedestr */ open | close | destroy): JQuery = js.native
  def sidenav(options: PartialSidenavOptions): JQuery = js.native
  
  def slider(): JQuery = js.native
  def slider(
    method: /* keyof materialize-css.anon.PickSliderpausestartnextp */ next | pause | start | destroy | prev
  ): JQuery = js.native
  def slider(options: PartialSliderOptions): JQuery = js.native
  
  def tabs(): JQuery = js.native
  def tabs(method: destroy): JQuery = js.native
  def tabs(method: select, tabId: String): JQuery = js.native
  def tabs(options: PartialTabsOptions): JQuery = js.native
  
  def tapTarget(): JQuery = js.native
  def tapTarget(method: /* keyof materialize-css.anon.PickTapTargetopenclosedes */ open | close | destroy): JQuery = js.native
  def tapTarget(options: PartialTapTargetOptions): JQuery = js.native
  
  def timepicker(): JQuery = js.native
  def timepicker(method: /* keyof materialize-css.anon.PickTimepickeropenclosede */ open | close | destroy): JQuery = js.native
  def timepicker(method: showView, view: hours | minutes): JQuery = js.native
  def timepicker(options: PartialTimepickerOptions): JQuery = js.native
  
  def tooltip(): JQuery = js.native
  def tooltip(method: /* keyof materialize-css.anon.PickTooltipopenclosedestr */ open | close | destroy): JQuery = js.native
  def tooltip(options: PartialTooltipOptions): JQuery = js.native
}
