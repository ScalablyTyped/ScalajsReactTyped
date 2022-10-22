package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectFileAndObjVer extends StObject {
  
  def Clone(): IObjectFileAndObjVer
  
  val ObjVer: IObjVer
  
  val ObjectFile: IObjectFile
  
  def ToJSON(): String
}
object IObjectFileAndObjVer {
  
  inline def apply(
    Clone: CallbackTo[IObjectFileAndObjVer],
    ObjVer: IObjVer,
    ObjectFile: IObjectFile,
    ToJSON: CallbackTo[String]
  ): IObjectFileAndObjVer = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, ObjVer = ObjVer.asInstanceOf[js.Any], ObjectFile = ObjectFile.asInstanceOf[js.Any], ToJSON = ToJSON.toJsFn)
    __obj.asInstanceOf[IObjectFileAndObjVer]
  }
  
  extension [Self <: IObjectFileAndObjVer](x: Self) {
    
    inline def setClone(value: CallbackTo[IObjectFileAndObjVer]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
    
    inline def setObjectFile(value: IObjectFile): Self = StObject.set(x, "ObjectFile", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: CallbackTo[String]): Self = StObject.set(x, "ToJSON", value.toJsFn)
  }
}
