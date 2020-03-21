package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.ikeytiptransitionkeyMod.IKeytipTransitionKey
import typingsJapgolly.officeUiFabricReact.keytipConfigMod.IKeytipConfig
import typingsJapgolly.officeUiFabricReact.keytipConfigMod.IKeytipConfigItem
import typingsJapgolly.officeUiFabricReact.keytipConfigMod.IKeytipConfigMap
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.`-_`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.`Comma `
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.`data-ktp-execute-target`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.`data-ktp-target`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.`ktp-layer-id`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.enterKeytipMode
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.exitKeytipMode
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.keytipAdded
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.keytipRemoved
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.keytipUpdated
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.ktp
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.persistedKeytipAdded
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.persistedKeytipExecute
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.persistedKeytipRemoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/keytips", JSImport.Namespace)
@js.native
object keytipsMod extends js.Object {
  @js.native
  class KeytipManager ()
    extends typingsJapgolly.officeUiFabricReact.keytipManagerMod.KeytipManager
  
  val DATAKTP_EXECUTE_TARGET: `data-ktp-execute-target` = js.native
  val DATAKTP_TARGET: `data-ktp-target` = js.native
  val KTP_ARIA_SEPARATOR: `Comma ` = js.native
  val KTP_FULL_PREFIX: String = js.native
  val KTP_LAYER_ID: `ktp-layer-id` = js.native
  val KTP_PREFIX: ktp = js.native
  val KTP_SEPARATOR: `-_` = js.native
  def buildKeytipConfigMap(config: IKeytipConfig): IKeytipConfigMap = js.native
  def constructKeytip(configMap: IKeytipConfigMap, parentSequence: js.Array[String], keytip: IKeytipConfigItem): Unit = js.native
  def getAriaDescribedBy(keySequences: js.Array[String]): String = js.native
  def ktpTargetFromId(keytipId: String): String = js.native
  def ktpTargetFromSequences(keySequences: js.Array[String]): String = js.native
  def mergeOverflows(keySequences: js.Array[String], overflowKeySequences: js.Array[String]): js.Array[String] = js.native
  def sequencesToID(keySequences: js.Array[String]): String = js.native
  def transitionKeysAreEqual(key1: IKeytipTransitionKey, key2: IKeytipTransitionKey): Boolean = js.native
  def transitionKeysContain(keys: js.Array[IKeytipTransitionKey], key: IKeytipTransitionKey): Boolean = js.native
  @js.native
  object KeytipEvents extends js.Object {
    val ENTER_KEYTIP_MODE: enterKeytipMode = js.native
    val EXIT_KEYTIP_MODE: exitKeytipMode = js.native
    val KEYTIP_ADDED: keytipAdded = js.native
    val KEYTIP_REMOVED: keytipRemoved = js.native
    val KEYTIP_UPDATED: keytipUpdated = js.native
    val PERSISTED_KEYTIP_ADDED: persistedKeytipAdded = js.native
    val PERSISTED_KEYTIP_EXECUTE: persistedKeytipExecute = js.native
    val PERSISTED_KEYTIP_REMOVED: persistedKeytipRemoved = js.native
  }
  
  /* static members */
  @js.native
  object KeytipManager extends js.Object {
    var _instance: js.Any = js.native
    /**
      * Static function to get singleton KeytipManager instance
      *
      * @returns {KeytipManager} Singleton KeytipManager instance
      */
    def getInstance(): typingsJapgolly.officeUiFabricReact.keytipManagerMod.KeytipManager = js.native
  }
  
  @js.native
  object KeytipTransitionModifier extends js.Object {
    /* 2 */ val alt: typingsJapgolly.officeUiFabricReact.ikeytiptransitionkeyMod.KeytipTransitionModifier.alt with Double = js.native
    /* 1 */ val ctrl: typingsJapgolly.officeUiFabricReact.ikeytiptransitionkeyMod.KeytipTransitionModifier.ctrl with Double = js.native
    /* 3 */ val meta: typingsJapgolly.officeUiFabricReact.ikeytiptransitionkeyMod.KeytipTransitionModifier.meta with Double = js.native
    /* 0 */ val shift: typingsJapgolly.officeUiFabricReact.ikeytiptransitionkeyMod.KeytipTransitionModifier.shift with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.ikeytiptransitionkeyMod.KeytipTransitionModifier with Double
      ] = js.native
  }
  
}

