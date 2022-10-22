package typingsJapgolly.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftwarePackage extends StObject {
  
  /** Details of an APT package. For details about the apt package manager, see https://wiki.debian.org/Apt. */
  var aptPackage: js.UndefOr[VersionedPackage] = js.undefined
  
  /** Details of a COS package. */
  var cosPackage: js.UndefOr[VersionedPackage] = js.undefined
  
  /** Details of a Googet package. For details about the googet package manager, see https://github.com/google/googet. */
  var googetPackage: js.UndefOr[VersionedPackage] = js.undefined
  
  /**
    * Details of a Windows Quick Fix engineering package. See https://docs.microsoft.com/en-us/windows/win32/cimwin32prov/win32-quickfixengineering for info in Windows Quick Fix
    * Engineering.
    */
  var qfePackage: js.UndefOr[WindowsQuickFixEngineeringPackage] = js.undefined
  
  /** Details of Windows Application. */
  var windowsApplication: js.UndefOr[WindowsApplication] = js.undefined
  
  /** Details of a Windows Update package. See https://docs.microsoft.com/en-us/windows/win32/api/_wua/ for information about Windows Update. */
  var wuaPackage: js.UndefOr[WindowsUpdatePackage] = js.undefined
  
  /** Yum package info. For details about the yum package manager, see https://access.redhat.com/documentation/en-us/red_hat_enterprise_linux/6/html/deployment_guide/ch-yum. */
  var yumPackage: js.UndefOr[VersionedPackage] = js.undefined
  
  /** Details of a Zypper package. For details about the Zypper package manager, see https://en.opensuse.org/SDB:Zypper_manual. */
  var zypperPackage: js.UndefOr[VersionedPackage] = js.undefined
  
  /** Details of a Zypper patch. For details about the Zypper package manager, see https://en.opensuse.org/SDB:Zypper_manual. */
  var zypperPatch: js.UndefOr[ZypperPatch] = js.undefined
}
object SoftwarePackage {
  
  inline def apply(): SoftwarePackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwarePackage]
  }
  
  extension [Self <: SoftwarePackage](x: Self) {
    
    inline def setAptPackage(value: VersionedPackage): Self = StObject.set(x, "aptPackage", value.asInstanceOf[js.Any])
    
    inline def setAptPackageUndefined: Self = StObject.set(x, "aptPackage", js.undefined)
    
    inline def setCosPackage(value: VersionedPackage): Self = StObject.set(x, "cosPackage", value.asInstanceOf[js.Any])
    
    inline def setCosPackageUndefined: Self = StObject.set(x, "cosPackage", js.undefined)
    
    inline def setGoogetPackage(value: VersionedPackage): Self = StObject.set(x, "googetPackage", value.asInstanceOf[js.Any])
    
    inline def setGoogetPackageUndefined: Self = StObject.set(x, "googetPackage", js.undefined)
    
    inline def setQfePackage(value: WindowsQuickFixEngineeringPackage): Self = StObject.set(x, "qfePackage", value.asInstanceOf[js.Any])
    
    inline def setQfePackageUndefined: Self = StObject.set(x, "qfePackage", js.undefined)
    
    inline def setWindowsApplication(value: WindowsApplication): Self = StObject.set(x, "windowsApplication", value.asInstanceOf[js.Any])
    
    inline def setWindowsApplicationUndefined: Self = StObject.set(x, "windowsApplication", js.undefined)
    
    inline def setWuaPackage(value: WindowsUpdatePackage): Self = StObject.set(x, "wuaPackage", value.asInstanceOf[js.Any])
    
    inline def setWuaPackageUndefined: Self = StObject.set(x, "wuaPackage", js.undefined)
    
    inline def setYumPackage(value: VersionedPackage): Self = StObject.set(x, "yumPackage", value.asInstanceOf[js.Any])
    
    inline def setYumPackageUndefined: Self = StObject.set(x, "yumPackage", js.undefined)
    
    inline def setZypperPackage(value: VersionedPackage): Self = StObject.set(x, "zypperPackage", value.asInstanceOf[js.Any])
    
    inline def setZypperPackageUndefined: Self = StObject.set(x, "zypperPackage", js.undefined)
    
    inline def setZypperPatch(value: ZypperPatch): Self = StObject.set(x, "zypperPatch", value.asInstanceOf[js.Any])
    
    inline def setZypperPatchUndefined: Self = StObject.set(x, "zypperPatch", js.undefined)
  }
}
