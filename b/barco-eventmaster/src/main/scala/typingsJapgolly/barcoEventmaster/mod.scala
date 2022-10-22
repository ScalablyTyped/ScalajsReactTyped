package typingsJapgolly.barcoEventmaster

import typingsJapgolly.barcoEventmaster.anon.Add
import typingsJapgolly.barcoEventmaster.anon.Id
import typingsJapgolly.barcoEventmaster.barcoEventmasterBooleans.`true`
import typingsJapgolly.barcoEventmaster.barcoEventmasterInts.`0`
import typingsJapgolly.barcoEventmaster.barcoEventmasterInts.`1`
import typingsJapgolly.barcoEventmaster.barcoEventmasterInts.`2`
import typingsJapgolly.barcoEventmaster.barcoEventmasterInts.`3`
import typingsJapgolly.barcoEventmaster.barcoEventmasterInts.`4`
import typingsJapgolly.barcoEventmaster.barcoEventmasterInts.`5`
import typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.destGroupId
import typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.destGroupName
import typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.destGroupSno
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("barco-eventmaster", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with EventMaster {
    def this(ip: String) = this()
  }
  
  type Callback[T] = js.Function2[/* err */ `true` | Null, /* data */ T, Unit]
  
  @js.native
  trait EventMaster extends StObject {
    
    def activateCueByCueName(cueName: String, `type`: `1` | `2`): Unit = js.native
    def activateCueByCueName(cueName: String, `type`: `1` | `2`, cb: Callback[Any]): Unit = js.native
    
    def activateCueByCueSerialNo(cueSerialNo: Double, `type`: `1` | `2`): Unit = js.native
    def activateCueByCueSerialNo(cueSerialNo: Double, `type`: `1` | `2`, cb: Callback[Any]): Unit = js.native
    
    def activateCueById(id: Double, `type`: `1` | `2`): Unit = js.native
    def activateCueById(id: Double, `type`: `1` | `2`, cb: Callback[Any]): Unit = js.native
    
    def activateDestGroup(id: Double): Unit = js.native
    def activateDestGroup(id: Double, cb: Callback[Any]): Unit = js.native
    
    def activatePresetById(presetId: Double, recallInProgramInt: `0` | `1`, `type`: UserType, passwordOrOperatorId: String): Unit = js.native
    def activatePresetById(
      presetId: Double,
      recallInProgramInt: `0` | `1`,
      `type`: UserType,
      passwordOrOperatorId: String,
      cb: Callback[Any]
    ): Unit = js.native
    
    def activatePresetByName(presetName: String, recallInProgramInt: `0` | `1`, `type`: UserType, passwordOrOperatorId: String): Unit = js.native
    def activatePresetByName(
      presetName: String,
      recallInProgramInt: `0` | `1`,
      `type`: UserType,
      passwordOrOperatorId: String,
      cb: Callback[Any]
    ): Unit = js.native
    
    def activatePresetBySno(presetSno: Double, recallInProgramInt: `0` | `1`, `type`: UserType, passwordOrOperatorId: String): Unit = js.native
    def activatePresetBySno(
      presetSno: Double,
      recallInProgramInt: `0` | `1`,
      `type`: UserType,
      passwordOrOperatorId: String,
      cb: Callback[Any]
    ): Unit = js.native
    
    def activateSourceMainBackup(): Unit = js.native
    
    def allTrans(`type`: UserType, passwordOrOperatorId: String): Unit = js.native
    def allTrans(`type`: UserType, passwordOrOperatorId: String, cb: Callback[Any]): Unit = js.native
    
    def armUnarmDestination(arm: `0` | `1`, screenDestinations: js.Array[Id], auxDestinations: js.Array[Id]): Unit = js.native
    def armUnarmDestination(arm: `0` | `1`, screenDestinations: js.Array[Id], auxDestinations: js.Array[Id], cb: Callback[Any]): Unit = js.native
    
    def changeAuxContent(id: Double, pvwLastSrcIndex: Double, pgmLastSrcIndex: Double): Unit = js.native
    def changeAuxContent(id: Double, pvwLastSrcIndex: Double, pgmLastSrcIndex: Double, cb: Callback[Any]): Unit = js.native
    
    def changeAuxContentName(id: Double, name: String, pvwLastSrcIndex: Double, pgmLastSrcIndex: Double): Unit = js.native
    def changeAuxContentName(id: Double, name: String, pvwLastSrcIndex: Double, pgmLastSrcIndex: Double, cb: Callback[Any]): Unit = js.native
    
    def changeAuxContentTestPattern(id: Double, testPattern: Double): Unit = js.native
    def changeAuxContentTestPattern(id: Double, testPattern: Double, cb: Callback[Any]): Unit = js.native
    
    def changeContent(screenDestIndex: Double, bgLayer: Double, Layers: Any): Unit = js.native
    def changeContent(screenDestIndex: Double, bgLayer: Double, Layers: Any, cb: Callback[Any]): Unit = js.native
    
    def changeContentTestPattern(id: Double, testPattern: Double): Unit = js.native
    def changeContentTestPattern(id: Double, testPattern: Double, cb: Callback[Any]): Unit = js.native
    
    def clearLayers(screenId: Double, Layers: js.Array[Id]): Unit = js.native
    def clearLayers(screenId: Double, Layers: js.Array[Id], cb: Callback[Any]): Unit = js.native
    
    def configureOperator(params: Add): Unit = js.native
    def configureOperator(params: Add, cb: Callback[Any]): Unit = js.native
    
    def control3d(id: Double, `type`: `0` | `1`, syncSource: `1` | `2` | `3` | `4`, syncInvert: `0` | `1`): Unit = js.native
    def control3d(
      id: Double,
      `type`: `0` | `1`,
      syncSource: `1` | `2` | `3` | `4`,
      syncInvert: `0` | `1`,
      cb: Callback[Any]
    ): Unit = js.native
    
    def cut(`type`: UserType, passwordOrOperatorId: String): Unit = js.native
    def cut(`type`: UserType, passwordOrOperatorId: String, cb: Callback[Any]): Unit = js.native
    
    def deletePresetById(presetId: Double, `type`: UserType, passwordOrOperatorId: String): Unit = js.native
    def deletePresetById(presetId: Double, `type`: UserType, passwordOrOperatorId: String, cb: Callback[Any]): Unit = js.native
    
    def deletePresetByName(presetName: String, `type`: UserType, passwordOrOperatorId: String): Unit = js.native
    def deletePresetByName(presetName: String, `type`: UserType, passwordOrOperatorId: String, cb: Callback[Any]): Unit = js.native
    
    def deletePresetBySno(presetSno: Double, `type`: UserType, passwordOrOperatorId: String): Unit = js.native
    def deletePresetBySno(presetSno: Double, `type`: UserType, passwordOrOperatorId: String, cb: Callback[Any]): Unit = js.native
    
    def deleteStill(stillIndex: Double): Unit = js.native
    def deleteStill(stillIndex: Double, cb: Callback[Any]): Unit = js.native
    
    def fillHV(screenId: Double, Layers: js.Array[Id]): Unit = js.native
    def fillHV(screenId: Double, Layers: js.Array[Id], cb: Callback[Any]): Unit = js.native
    
    def freezeDestSource(`type`: `0` | `1` | `2` | `3`, id: Double, screenGroup: `0`, mode: `0` | `1`): Unit = js.native
    def freezeDestSource(`type`: `0` | `1` | `2` | `3`, id: Double, screenGroup: `0`, mode: `0` | `1`, cb: Callback[Any]): Unit = js.native
    
    def getFrameSettings(): Unit = js.native
    def getFrameSettings(cb: Callback[Any]): Unit = js.native
    
    def listAuxContent(auxDestIndex: Double): Unit = js.native
    def listAuxContent(auxDestIndex: Double, cb: Callback[Any]): Unit = js.native
    
    def listContent(id: Double): Unit = js.native
    def listContent(id: Double, cb: Callback[Any]): Unit = js.native
    
    def listCues(`type`: `0` | `1` | `2`): Unit = js.native
    def listCues(`type`: `0` | `1` | `2`, cb: Callback[Any]): Unit = js.native
    
    def listDestGroups(): Unit = js.native
    def listDestGroups(cb: Callback[Any]): Unit = js.native
    
    def listDestGroupsPerType(`type`: destGroupId | destGroupSno | destGroupName): Unit = js.native
    def listDestGroupsPerType(`type`: destGroupId | destGroupSno | destGroupName, cb: Callback[Any]): Unit = js.native
    
    def listDestinations(`type`: `0` | `1` | `2`): Unit = js.native
    def listDestinations(`type`: `0` | `1` | `2`, cb: Callback[Any]): Unit = js.native
    
    def listDestinationsForPreset(presetId: Double): Unit = js.native
    
    def listInputs(index: Double): Unit = js.native
    def listInputs(index: Double, cb: Callback[Any]): Unit = js.native
    
    def listOperators(): Unit = js.native
    def listOperators(cb: Callback[Any]): Unit = js.native
    
    def listOutputs(index: Double): Unit = js.native
    def listOutputs(index: Double, cb: Callback[Any]): Unit = js.native
    
    def listPresets(ScreenDest: Double, AuxDest: Double): Unit = js.native
    def listPresets(ScreenDest: Double, AuxDest: Double, cb: Callback[Any]): Unit = js.native
    
    def listSourceMainBackup(): Unit = js.native
    def listSourceMainBackup(inputType: `0` | `1`): Unit = js.native
    def listSourceMainBackup(inputType: `0` | `1`, cb: Callback[Any]): Unit = js.native
    def listSourceMainBackup(inputType: Unit, cb: Callback[Any]): Unit = js.native
    
    def listSources(`type`: `0` | `1` | `2` | `3` | `4`): Unit = js.native
    def listSources(`type`: `0` | `1` | `2` | `3` | `4`, cb: Callback[Any]): Unit = js.native
    
    def listStill(): Unit = js.native
    def listStill(cb: Callback[Any]): Unit = js.native
    
    def listSuperAuxContent(id: Double): Unit = js.native
    def listSuperAuxContent(id: Double, cb: Callback[Any]): Unit = js.native
    
    def listSuperDestContent(id: Double): Unit = js.native
    def listSuperDestContent(id: Double, cb: Callback[Any]): Unit = js.native
    
    def listUserKeys(): Unit = js.native
    def listUserKeys(cb: Callback[Any]): Unit = js.native
    
    def mvrLayoutChange(frameUnitId: Double, mvrLayoutId: Double): Unit = js.native
    def mvrLayoutChange(frameUnitId: Double, mvrLayoutId: Double, cb: Callback[Any]): Unit = js.native
    
    def powerStatus(): Unit = js.native
    def powerStatus(cb: Callback[Any]): Unit = js.native
    
    /** Query the E2 directly */
    def query(method: String, params: Any): Unit = js.native
    def query(method: String, params: Any, cb: Callback[Any]): Unit = js.native
    
    def recallNextPreset(): Unit = js.native
    def recallNextPreset(cb: Callback[Any]): Unit = js.native
    
    def recallUserKey(userkeyName: String, ScreenDestination: js.Array[Any], Layer: js.Array[Id]): Unit = js.native
    def recallUserKey(userkeyName: String, ScreenDestination: js.Array[Any], Layer: js.Array[Id], cb: Callback[Any]): Unit = js.native
    
    def renamePresetById(presetId: Double, newPresetName: String): Unit = js.native
    def renamePresetById(presetId: Double, newPresetName: String, cb: Callback[Any]): Unit = js.native
    
    def renamePresetByName(presetName: String, newPresetName: String): Unit = js.native
    def renamePresetByName(presetName: String, newPresetName: String, cb: Callback[Any]): Unit = js.native
    
    def renamePresetBySno(presetSno: Double, newPresetName: String): Unit = js.native
    def renamePresetBySno(presetSno: Double, newPresetName: String, cb: Callback[Any]): Unit = js.native
    
    def resetFrameSettings(resetKind: `0` | `1` | `2` | `3` | `4` | `5`): Unit = js.native
    def resetFrameSettings(resetKind: `0` | `1` | `2` | `3` | `4` | `5`, cb: Callback[Any]): Unit = js.native
    
    def resetSourceMainBackup(source: Double): Unit = js.native
    def resetSourceMainBackup(source: Double, cb: Callback[Any]): Unit = js.native
    
    def savePreset(): Unit = js.native
    
    def subscribe(hostname: String, port: Double, notificationTypes: js.Array[NotificationType]): Unit = js.native
    def subscribe(hostname: String, port: Double, notificationTypes: js.Array[NotificationType], cb: Callback[Any]): Unit = js.native
    
    def takeStill(`type`: `0` | `1`, id: Double, fileid: Double): Unit = js.native
    def takeStill(`type`: `0` | `1`, id: Double, fileid: Double, cb: Callback[Any]): Unit = js.native
    
    def unsubscribe(hostname: String, port: Double, notificationTypes: js.Array[NotificationType]): Unit = js.native
    def unsubscribe(hostname: String, port: Double, notificationTypes: js.Array[NotificationType], cb: Callback[Any]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.ScreenDestChanged
    - typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.AUXDestChanged
    - typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.FrameChanged
    - typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.NativeRateChanged
    - typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.InputCfgChanged
    - typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.SourceChanged
    - typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.BGSourceChanged
    - typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.PresetChanged
    - typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.StillChanged
    - typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.OutputCfgChanged
    - typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.CueChanged
  */
  trait NotificationType extends StObject
  object NotificationType {
    
    inline def AUXDestChanged: typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.AUXDestChanged = "AUXDestChanged".asInstanceOf[typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.AUXDestChanged]
    
    inline def BGSourceChanged: typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.BGSourceChanged = "BGSourceChanged".asInstanceOf[typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.BGSourceChanged]
    
    inline def CueChanged: typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.CueChanged = "CueChanged".asInstanceOf[typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.CueChanged]
    
    inline def FrameChanged: typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.FrameChanged = "FrameChanged".asInstanceOf[typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.FrameChanged]
    
    inline def InputCfgChanged: typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.InputCfgChanged = "InputCfgChanged".asInstanceOf[typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.InputCfgChanged]
    
    inline def NativeRateChanged: typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.NativeRateChanged = "NativeRateChanged".asInstanceOf[typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.NativeRateChanged]
    
    inline def OutputCfgChanged: typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.OutputCfgChanged = "OutputCfgChanged".asInstanceOf[typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.OutputCfgChanged]
    
    inline def PresetChanged: typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.PresetChanged = "PresetChanged".asInstanceOf[typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.PresetChanged]
    
    inline def ScreenDestChanged: typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.ScreenDestChanged = "ScreenDestChanged".asInstanceOf[typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.ScreenDestChanged]
    
    inline def SourceChanged: typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.SourceChanged = "SourceChanged".asInstanceOf[typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.SourceChanged]
    
    inline def StillChanged: typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.StillChanged = "StillChanged".asInstanceOf[typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.StillChanged]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.operator
    - typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.super_user
  */
  trait UserType extends StObject
  object UserType {
    
    inline def operator: typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.operator = "operator".asInstanceOf[typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.operator]
    
    inline def super_user: typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.super_user = "super_user".asInstanceOf[typingsJapgolly.barcoEventmaster.barcoEventmasterStrings.super_user]
  }
}
