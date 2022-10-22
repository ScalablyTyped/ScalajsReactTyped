package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.actionsDropPluginMod.DropSignalArg
import typingsJapgolly.interactjsTypes.autoStartBaseMod.CheckSignalArg
import typingsJapgolly.interactjsTypes.coreInteractionMod.DoAnyPhaseArg
import typingsJapgolly.interactjsTypes.coreInteractionMod.DoPhaseArg
import typingsJapgolly.interactjsTypes.coreScopeMod.DocSignalArg
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionName
import typingsJapgolly.interactjsTypes.interactjsTypesBooleans.`false`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`auto-startColoncheck`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`autoStartColonbefore-start`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonaction-end`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonaction-inertiastart`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonaction-move`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonaction-reflow`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonaction-resume`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonaction-start`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonafter-action-end`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonafter-action-inertiastart`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonafter-action-move`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonafter-action-reflow`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonafter-action-resume`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonafter-action-start`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonbefore-action-end`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonbefore-action-inertiastart`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonbefore-action-move`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonbefore-action-reflow`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonbefore-action-resume`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonbefore-action-start`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonremove-pointer`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`interactionsColonupdate-pointer`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`pointerEventsColoncollect-targets`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`scopeColonadd-document`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.`scopeColonremove-document`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.actionsSlashdropColonend
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.actionsSlashdropColonmove
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.actionsSlashdropColonstart
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.autoStartColonprepared
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.inertiastart
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.interactableColonnew
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.interactableColonset
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.interactableColonunset
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.interaction
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.interactionsColonblur
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.interactionsColoncancel
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.interactionsColondestroy
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.interactionsColondown
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.interactionsColonfind
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.interactionsColonmove
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.interactionsColonnew
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.interactionsColonstop
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.interactionsColonup
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.pointerEventsColonfired
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.pointerEventsColonnew
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.resume
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply(name: `auto-startColoncheck`, arg: CheckSignalArg): Unit | `false` = js.native
  def apply(
    name: `autoStartColonbefore-start`,
    arg: (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/auto-start/base.@interactjs/core/scope.SignalArgs['interactions:move'] */ js.Any, 
      interaction
    ]) & Interaction
  ): Unit | `false` = js.native
  def apply(name: `interactionsColonaction-end`, arg: DoAnyPhaseArg): Unit | `false` = js.native
  def apply(name: `interactionsColonaction-inertiastart`, arg: DoPhaseArg[ActionName, inertiastart]): Unit | `false` = js.native
  def apply(name: `interactionsColonaction-move`, arg: DoAnyPhaseArg): Unit | `false` = js.native
  def apply(name: `interactionsColonaction-reflow`, arg: DoAnyPhaseArg): Unit | `false` = js.native
  def apply(name: `interactionsColonaction-resume`, arg: DoPhaseArg[ActionName, resume]): Unit | `false` = js.native
  def apply(name: `interactionsColonaction-start`, arg: DoAnyPhaseArg): Unit | `false` = js.native
  def apply(name: `interactionsColonafter-action-end`, arg: DoAnyPhaseArg): Unit | `false` = js.native
  def apply(name: `interactionsColonafter-action-inertiastart`, arg: DoPhaseArg[ActionName, inertiastart]): Unit | `false` = js.native
  def apply(name: `interactionsColonafter-action-move`, arg: DoAnyPhaseArg): Unit | `false` = js.native
  def apply(name: `interactionsColonafter-action-reflow`, arg: DoAnyPhaseArg): Unit | `false` = js.native
  def apply(name: `interactionsColonafter-action-resume`, arg: DoPhaseArg[ActionName, resume]): Unit | `false` = js.native
  def apply(name: `interactionsColonafter-action-start`, arg: DoAnyPhaseArg): Unit | `false` = js.native
  def apply(name: `interactionsColonbefore-action-end`, arg: OmitDoAnyPhaseArgiEvent): Unit | `false` = js.native
  def apply(name: `interactionsColonbefore-action-inertiastart`, arg: OmitDoPhaseArgActionNamei): Unit | `false` = js.native
  def apply(name: `interactionsColonbefore-action-move`, arg: OmitDoAnyPhaseArgiEvent): Unit | `false` = js.native
  def apply(name: `interactionsColonbefore-action-reflow`, arg: OmitDoAnyPhaseArgiEvent): Unit | `false` = js.native
  def apply(name: `interactionsColonbefore-action-resume`, arg: OmitDoPhaseArgActionNamer): Unit | `false` = js.native
  def apply(name: `interactionsColonbefore-action-start`, arg: OmitDoAnyPhaseArgiEvent): Unit | `false` = js.native
  def apply(name: `interactionsColonremove-pointer`, arg: PointerArgProps): Unit | `false` = js.native
  def apply(name: `interactionsColonupdate-pointer`, arg: PointerArgPropsdownboolea): Unit | `false` = js.native
  def apply(name: `pointerEventsColoncollect-targets`, arg: Node): Unit | `false` = js.native
  def apply(name: `scopeColonadd-document`, arg: DocSignalArg): Unit | `false` = js.native
  def apply(name: `scopeColonremove-document`, arg: DocSignalArg): Unit | `false` = js.native
  def apply(name: actionsSlashdropColonend, arg: DropSignalArg): Unit | `false` = js.native
  def apply(name: actionsSlashdropColonmove, arg: DropSignalArg): Unit | `false` = js.native
  def apply(name: actionsSlashdropColonstart, arg: DropSignalArg): Unit | `false` = js.native
  def apply(name: autoStartColonprepared, arg: Interaction): Unit | `false` = js.native
  def apply(name: interactableColonnew, arg: Target): Unit | `false` = js.native
  def apply(name: interactableColonset, arg: Options): Unit | `false` = js.native
  def apply(name: interactableColonunset, arg: InteractableInteractableBackCompatOption): Unit | `false` = js.native
  def apply(name: interactionsColonblur, arg: Event): Unit | `false` = js.native
  def apply(
    name: interactionsColoncancel,
    arg: (/* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/core/Interaction.@interactjs/core/scope.SignalArgs['interactions:up'] */ js.Any) & CurEventTarget
  ): Unit | `false` = js.native
  def apply(name: interactionsColondestroy, arg: Interaction): Unit | `false` = js.native
  def apply(name: interactionsColondown, arg: PointerArgPropstypedown): Unit | `false` = js.native
  def apply(name: interactionsColonfind, arg: SearchDetails): Unit | `false` = js.native
  def apply(name: interactionsColonmove, arg: PointerArgPropstypemovedx): Unit | `false` = js.native
  def apply(name: interactionsColonnew, arg: Interaction): Unit | `false` = js.native
  def apply(name: interactionsColonstop, arg: Interaction): Unit | `false` = js.native
  def apply(name: interactionsColonup, arg: PointerArgPropstypeupcurE): Unit | `false` = js.native
  def apply(name: pointerEventsColonfired, arg: EventTarget): Unit | `false` = js.native
  def apply(name: pointerEventsColonnew, arg: PointerEvent): Unit | `false` = js.native
}
