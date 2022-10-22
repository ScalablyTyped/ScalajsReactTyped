package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectVersionAndProperties extends StObject {
  
  def Clone(): IObjectVersionAndProperties
  
  val ObjVer: IObjVer
  
  val Properties: IPropertyValues
  
  val Vault: IVault
  
  val VersionData: IObjectVersion
}
object IObjectVersionAndProperties {
  
  inline def apply(
    Clone: CallbackTo[IObjectVersionAndProperties],
    ObjVer: IObjVer,
    Properties: IPropertyValues,
    Vault: IVault,
    VersionData: IObjectVersion
  ): IObjectVersionAndProperties = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, ObjVer = ObjVer.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Vault = Vault.asInstanceOf[js.Any], VersionData = VersionData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectVersionAndProperties]
  }
  
  extension [Self <: IObjectVersionAndProperties](x: Self) {
    
    inline def setClone(value: CallbackTo[IObjectVersionAndProperties]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IPropertyValues): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setVault(value: IVault): Self = StObject.set(x, "Vault", value.asInstanceOf[js.Any])
    
    inline def setVersionData(value: IObjectVersion): Self = StObject.set(x, "VersionData", value.asInstanceOf[js.Any])
  }
}
