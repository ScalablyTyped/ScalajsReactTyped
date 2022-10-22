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

trait ScopeFire extends StObject {
  
  var pointerType: js.UndefOr[String] = js.undefined
  
  def scopeFire(
    name: `autoStartColonbefore-start`,
    arg: (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/auto-start/base.@interactjs/core/scope.SignalArgs['interactions:move'] */ js.Any, 
      interaction
    ]) & Interaction
  ): Unit | `false`
  def scopeFire(name: `interactionsColonaction-inertiastart`, arg: DoPhaseArg[ActionName, inertiastart]): Unit | `false`
  def scopeFire(name: `interactionsColonaction-resume`, arg: DoPhaseArg[ActionName, resume]): Unit | `false`
  def scopeFire(name: `interactionsColonafter-action-inertiastart`, arg: DoPhaseArg[ActionName, inertiastart]): Unit | `false`
  def scopeFire(name: `interactionsColonafter-action-resume`, arg: DoPhaseArg[ActionName, resume]): Unit | `false`
  def scopeFire(
    name: interactionsColoncancel,
    arg: (/* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/core/Interaction.@interactjs/core/scope.SignalArgs['interactions:up'] */ js.Any) & CurEventTarget
  ): Unit | `false`
  @JSName("scopeFire")
  var scopeFire_Original: FnCall
  @JSName("scopeFire")
  def scopeFire_actionsdropend(name: actionsSlashdropColonend, arg: DropSignalArg): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_actionsdropmove(name: actionsSlashdropColonmove, arg: DropSignalArg): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_actionsdropstart(name: actionsSlashdropColonstart, arg: DropSignalArg): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_autoStartprepared(name: autoStartColonprepared, arg: Interaction): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_autostartcheck(name: `auto-startColoncheck`, arg: CheckSignalArg): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactablenew(name: interactableColonnew, arg: Target): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactableset(name: interactableColonset, arg: Options): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactableunset(name: interactableColonunset, arg: InteractableInteractableBackCompatOption): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsactionend(name: `interactionsColonaction-end`, arg: DoAnyPhaseArg): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsactionmove(name: `interactionsColonaction-move`, arg: DoAnyPhaseArg): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsactionreflow(name: `interactionsColonaction-reflow`, arg: DoAnyPhaseArg): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsactionstart(name: `interactionsColonaction-start`, arg: DoAnyPhaseArg): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsafteractionend(name: `interactionsColonafter-action-end`, arg: DoAnyPhaseArg): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsafteractionmove(name: `interactionsColonafter-action-move`, arg: DoAnyPhaseArg): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsafteractionreflow(name: `interactionsColonafter-action-reflow`, arg: DoAnyPhaseArg): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsafteractionstart(name: `interactionsColonafter-action-start`, arg: DoAnyPhaseArg): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsbeforeactionend(name: `interactionsColonbefore-action-end`, arg: OmitDoAnyPhaseArgiEvent): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsbeforeactioninertiastart(name: `interactionsColonbefore-action-inertiastart`, arg: OmitDoPhaseArgActionNamei): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsbeforeactionmove(name: `interactionsColonbefore-action-move`, arg: OmitDoAnyPhaseArgiEvent): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsbeforeactionreflow(name: `interactionsColonbefore-action-reflow`, arg: OmitDoAnyPhaseArgiEvent): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsbeforeactionresume(name: `interactionsColonbefore-action-resume`, arg: OmitDoPhaseArgActionNamer): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsbeforeactionstart(name: `interactionsColonbefore-action-start`, arg: OmitDoAnyPhaseArgiEvent): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsblur(name: interactionsColonblur, arg: Event): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsdestroy(name: interactionsColondestroy, arg: Interaction): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsdown(name: interactionsColondown, arg: PointerArgPropstypedown): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsfind(name: interactionsColonfind, arg: SearchDetails): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsmove(name: interactionsColonmove, arg: PointerArgPropstypemovedx): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsnew(name: interactionsColonnew, arg: Interaction): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsremovepointer(name: `interactionsColonremove-pointer`, arg: PointerArgProps): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsstop(name: interactionsColonstop, arg: Interaction): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsup(name: interactionsColonup, arg: PointerArgPropstypeupcurE): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_interactionsupdatepointer(name: `interactionsColonupdate-pointer`, arg: PointerArgPropsdownboolea): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_pointerEventscollecttargets(name: `pointerEventsColoncollect-targets`, arg: Node): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_pointerEventsfired(name: pointerEventsColonfired, arg: EventTarget): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_pointerEventsnew(name: pointerEventsColonnew, arg: PointerEvent): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_scopeadddocument(name: `scopeColonadd-document`, arg: DocSignalArg): Unit | `false`
  @JSName("scopeFire")
  def scopeFire_scoperemovedocument(name: `scopeColonremove-document`, arg: DocSignalArg): Unit | `false`
}
object ScopeFire {
  
  inline def apply(scopeFire: FnCall): ScopeFire = {
    val __obj = js.Dynamic.literal(scopeFire = scopeFire.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeFire]
  }
  
  extension [Self <: ScopeFire](x: Self) {
    
    inline def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPointerTypeUndefined: Self = StObject.set(x, "pointerType", js.undefined)
    
    inline def setScopeFire(value: FnCall): Self = StObject.set(x, "scopeFire", value.asInstanceOf[js.Any])
  }
}
