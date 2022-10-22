package typingsJapgolly.dashjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineController extends StObject {
  
  def createRecord(manifestURL: String): js.Promise[String]
  
  def deleteRecord(id: String): Unit
  
  def getAllRecords(): js.Array[OfflineRecord]
  
  def getRecordProgression(id: String): Double
  
  def loadRecordsFromStorage(): js.Promise[Unit]
  
  def reset(): Unit
  
  def resetRecords(): Unit
  
  def resumeRecord(id: String): Unit
  
  def startRecord(id: String, mediaInfos: js.Array[MediaInfo]): Unit
  
  def stopRecord(id: String): Unit
}
object OfflineController {
  
  inline def apply(
    createRecord: String => js.Promise[String],
    deleteRecord: String => Callback,
    getAllRecords: CallbackTo[js.Array[OfflineRecord]],
    getRecordProgression: String => Double,
    loadRecordsFromStorage: CallbackTo[js.Promise[Unit]],
    reset: Callback,
    resetRecords: Callback,
    resumeRecord: String => Callback,
    startRecord: (String, js.Array[MediaInfo]) => Callback,
    stopRecord: String => Callback
  ): OfflineController = {
    val __obj = js.Dynamic.literal(createRecord = js.Any.fromFunction1(createRecord), deleteRecord = js.Any.fromFunction1((t0: String) => deleteRecord(t0).runNow()), getAllRecords = getAllRecords.toJsFn, getRecordProgression = js.Any.fromFunction1(getRecordProgression), loadRecordsFromStorage = loadRecordsFromStorage.toJsFn, reset = reset.toJsFn, resetRecords = resetRecords.toJsFn, resumeRecord = js.Any.fromFunction1((t0: String) => resumeRecord(t0).runNow()), startRecord = js.Any.fromFunction2((t0: String, t1: js.Array[MediaInfo]) => (startRecord(t0, t1)).runNow()), stopRecord = js.Any.fromFunction1((t0: String) => stopRecord(t0).runNow()))
    __obj.asInstanceOf[OfflineController]
  }
  
  extension [Self <: OfflineController](x: Self) {
    
    inline def setCreateRecord(value: String => js.Promise[String]): Self = StObject.set(x, "createRecord", js.Any.fromFunction1(value))
    
    inline def setDeleteRecord(value: String => Callback): Self = StObject.set(x, "deleteRecord", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setGetAllRecords(value: CallbackTo[js.Array[OfflineRecord]]): Self = StObject.set(x, "getAllRecords", value.toJsFn)
    
    inline def setGetRecordProgression(value: String => Double): Self = StObject.set(x, "getRecordProgression", js.Any.fromFunction1(value))
    
    inline def setLoadRecordsFromStorage(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "loadRecordsFromStorage", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setResetRecords(value: Callback): Self = StObject.set(x, "resetRecords", value.toJsFn)
    
    inline def setResumeRecord(value: String => Callback): Self = StObject.set(x, "resumeRecord", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStartRecord(value: (String, js.Array[MediaInfo]) => Callback): Self = StObject.set(x, "startRecord", js.Any.fromFunction2((t0: String, t1: js.Array[MediaInfo]) => (value(t0, t1)).runNow()))
    
    inline def setStopRecord(value: String => Callback): Self = StObject.set(x, "stopRecord", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
