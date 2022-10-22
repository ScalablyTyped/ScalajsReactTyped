package typingsJapgolly.activexLibreoffice

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object org_ {
  
  object freedesktop {
    
    object PackageKit {
      
      type SyncDbusSessionHelper = XSyncDbusSessionHelper
      
      /**
        * The interface used for modifying the package database.
        * @see https://git.gnome.org/browse/gnome-software/tree/src/org.freedesktop.PackageKit.xml for documentation of the corresponding D-Bus interface
        */
      trait XModify
        extends StObject
           with XInterface {
        
        /**
          * Installs sequence< string > packages to provide sequence< string > files.
          * @since LibreOffice 4.0
          */
        def InstallCatalogs(xid: Double, files: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Installs fontconfig resources ( [in] usually fonts) from a configured software source.
          * @since LibreOffice 4.0
          */
        def InstallFontconfigResources(xid: Double, resources: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Installs GStreamer resources ( [in] usually codecs) from a configured software source.
          * @since LibreOffice 4.0
          */
        def InstallGStreamerResources(xid: Double, resources: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Installs mimetype handlers from a configured software source.
          * @since LibreOffice 4.0
          */
        def InstallMimeTypes(xid: Double, mimeTypes: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Installs local package sequence< string > files or service packs.
          * @since LibreOffice 4.0
          */
        def InstallPackageFiles(xid: Double, files: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Installs sequence< string > packages from a configured software source.
          * @since LibreOffice 4.0
          */
        def InstallPackageNames(xid: Double, packages: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Installs printer drivers from a configured software source.
          * @since LibreOffice 4.0
          */
        def InstallPrinterDrivers(xid: Double, files: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Installs sequence< string > packages to provide sequence< string > files.
          * @since LibreOffice 4.0
          */
        def InstallProvideFiles(xid: Double, files: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Installs resources of a given type from a configured software source.
          * @since LibreOffice 4.0
          */
        def InstallResources(xid: Double, types: SeqEquiv[String], resources: SeqEquiv[String], interaction: String): Unit
        
        /**
          * Removes sequence< string > packages that provide the given local sequence< string > files.
          * @since LibreOffice 4.0
          */
        def RemovePackageByFiles(xid: Double, files: SeqEquiv[String], interaction: String): Unit
      }
      object XModify {
        
        inline def apply(
          InstallCatalogs: (Double, SeqEquiv[String], String) => Callback,
          InstallFontconfigResources: (Double, SeqEquiv[String], String) => Callback,
          InstallGStreamerResources: (Double, SeqEquiv[String], String) => Callback,
          InstallMimeTypes: (Double, SeqEquiv[String], String) => Callback,
          InstallPackageFiles: (Double, SeqEquiv[String], String) => Callback,
          InstallPackageNames: (Double, SeqEquiv[String], String) => Callback,
          InstallPrinterDrivers: (Double, SeqEquiv[String], String) => Callback,
          InstallProvideFiles: (Double, SeqEquiv[String], String) => Callback,
          InstallResources: (Double, SeqEquiv[String], SeqEquiv[String], String) => Callback,
          RemovePackageByFiles: (Double, SeqEquiv[String], String) => Callback,
          acquire: Callback,
          queryInterface: `type` => Any,
          release: Callback
        ): XModify = {
          val __obj = js.Dynamic.literal(InstallCatalogs = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (InstallCatalogs(t0, t1, t2)).runNow()), InstallFontconfigResources = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (InstallFontconfigResources(t0, t1, t2)).runNow()), InstallGStreamerResources = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (InstallGStreamerResources(t0, t1, t2)).runNow()), InstallMimeTypes = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (InstallMimeTypes(t0, t1, t2)).runNow()), InstallPackageFiles = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (InstallPackageFiles(t0, t1, t2)).runNow()), InstallPackageNames = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (InstallPackageNames(t0, t1, t2)).runNow()), InstallPrinterDrivers = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (InstallPrinterDrivers(t0, t1, t2)).runNow()), InstallProvideFiles = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (InstallProvideFiles(t0, t1, t2)).runNow()), InstallResources = js.Any.fromFunction4((t0: Double, t1: SeqEquiv[String], t2: SeqEquiv[String], t3: String) => (InstallResources(t0, t1, t2, t3)).runNow()), RemovePackageByFiles = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (RemovePackageByFiles(t0, t1, t2)).runNow()), acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
          __obj.asInstanceOf[XModify]
        }
        
        extension [Self <: XModify](x: Self) {
          
          inline def setInstallCatalogs(value: (Double, SeqEquiv[String], String) => Callback): Self = StObject.set(x, "InstallCatalogs", js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (value(t0, t1, t2)).runNow()))
          
          inline def setInstallFontconfigResources(value: (Double, SeqEquiv[String], String) => Callback): Self = StObject.set(x, "InstallFontconfigResources", js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (value(t0, t1, t2)).runNow()))
          
          inline def setInstallGStreamerResources(value: (Double, SeqEquiv[String], String) => Callback): Self = StObject.set(x, "InstallGStreamerResources", js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (value(t0, t1, t2)).runNow()))
          
          inline def setInstallMimeTypes(value: (Double, SeqEquiv[String], String) => Callback): Self = StObject.set(x, "InstallMimeTypes", js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (value(t0, t1, t2)).runNow()))
          
          inline def setInstallPackageFiles(value: (Double, SeqEquiv[String], String) => Callback): Self = StObject.set(x, "InstallPackageFiles", js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (value(t0, t1, t2)).runNow()))
          
          inline def setInstallPackageNames(value: (Double, SeqEquiv[String], String) => Callback): Self = StObject.set(x, "InstallPackageNames", js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (value(t0, t1, t2)).runNow()))
          
          inline def setInstallPrinterDrivers(value: (Double, SeqEquiv[String], String) => Callback): Self = StObject.set(x, "InstallPrinterDrivers", js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (value(t0, t1, t2)).runNow()))
          
          inline def setInstallProvideFiles(value: (Double, SeqEquiv[String], String) => Callback): Self = StObject.set(x, "InstallProvideFiles", js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (value(t0, t1, t2)).runNow()))
          
          inline def setInstallResources(value: (Double, SeqEquiv[String], SeqEquiv[String], String) => Callback): Self = StObject.set(x, "InstallResources", js.Any.fromFunction4((t0: Double, t1: SeqEquiv[String], t2: SeqEquiv[String], t3: String) => (value(t0, t1, t2, t3)).runNow()))
          
          inline def setRemovePackageByFiles(value: (Double, SeqEquiv[String], String) => Callback): Self = StObject.set(x, "RemovePackageByFiles", js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (value(t0, t1, t2)).runNow()))
        }
      }
      
      /**
        * The interface used for quering the package database.
        * @see https://git.gnome.org/browse/gnome-software/tree/src/org.freedesktop.PackageKit.xml for documentation of the corresponding D-Bus interface
        */
      trait XQuery
        extends StObject
           with XInterface {
        
        /**
          * Installs local package files or service packs.
          * @since LibreOffice 4.0
          */
        def IsInstalled(packageName: String, interaction: String, installed: js.Array[Boolean]): Unit
        
        /**
          * Installs packages to provide files.
          * @since LibreOffice 4.0
          */
        def SearchFile(fileName: String, interaction: String, installed: js.Array[Boolean], packageName: js.Array[String]): Unit
      }
      object XQuery {
        
        inline def apply(
          IsInstalled: (String, String, js.Array[Boolean]) => Callback,
          SearchFile: (String, String, js.Array[Boolean], js.Array[String]) => Callback,
          acquire: Callback,
          queryInterface: `type` => Any,
          release: Callback
        ): XQuery = {
          val __obj = js.Dynamic.literal(IsInstalled = js.Any.fromFunction3((t0: String, t1: String, t2: js.Array[Boolean]) => (IsInstalled(t0, t1, t2)).runNow()), SearchFile = js.Any.fromFunction4((t0: String, t1: String, t2: js.Array[Boolean], t3: js.Array[String]) => (SearchFile(t0, t1, t2, t3)).runNow()), acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
          __obj.asInstanceOf[XQuery]
        }
        
        extension [Self <: XQuery](x: Self) {
          
          inline def setIsInstalled(value: (String, String, js.Array[Boolean]) => Callback): Self = StObject.set(x, "IsInstalled", js.Any.fromFunction3((t0: String, t1: String, t2: js.Array[Boolean]) => (value(t0, t1, t2)).runNow()))
          
          inline def setSearchFile(value: (String, String, js.Array[Boolean], js.Array[String]) => Callback): Self = StObject.set(x, "SearchFile", js.Any.fromFunction4((t0: String, t1: String, t2: js.Array[Boolean], t3: js.Array[String]) => (value(t0, t1, t2, t3)).runNow()))
        }
      }
      
      trait XSyncDbusSessionHelper
        extends StObject
           with XModify
           with XQuery
      object XSyncDbusSessionHelper {
        
        inline def apply(
          InstallCatalogs: (Double, SeqEquiv[String], String) => Callback,
          InstallFontconfigResources: (Double, SeqEquiv[String], String) => Callback,
          InstallGStreamerResources: (Double, SeqEquiv[String], String) => Callback,
          InstallMimeTypes: (Double, SeqEquiv[String], String) => Callback,
          InstallPackageFiles: (Double, SeqEquiv[String], String) => Callback,
          InstallPackageNames: (Double, SeqEquiv[String], String) => Callback,
          InstallPrinterDrivers: (Double, SeqEquiv[String], String) => Callback,
          InstallProvideFiles: (Double, SeqEquiv[String], String) => Callback,
          InstallResources: (Double, SeqEquiv[String], SeqEquiv[String], String) => Callback,
          IsInstalled: (String, String, js.Array[Boolean]) => Callback,
          RemovePackageByFiles: (Double, SeqEquiv[String], String) => Callback,
          SearchFile: (String, String, js.Array[Boolean], js.Array[String]) => Callback,
          acquire: Callback,
          queryInterface: `type` => Any,
          release: Callback
        ): XSyncDbusSessionHelper = {
          val __obj = js.Dynamic.literal(InstallCatalogs = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (InstallCatalogs(t0, t1, t2)).runNow()), InstallFontconfigResources = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (InstallFontconfigResources(t0, t1, t2)).runNow()), InstallGStreamerResources = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (InstallGStreamerResources(t0, t1, t2)).runNow()), InstallMimeTypes = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (InstallMimeTypes(t0, t1, t2)).runNow()), InstallPackageFiles = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (InstallPackageFiles(t0, t1, t2)).runNow()), InstallPackageNames = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (InstallPackageNames(t0, t1, t2)).runNow()), InstallPrinterDrivers = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (InstallPrinterDrivers(t0, t1, t2)).runNow()), InstallProvideFiles = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (InstallProvideFiles(t0, t1, t2)).runNow()), InstallResources = js.Any.fromFunction4((t0: Double, t1: SeqEquiv[String], t2: SeqEquiv[String], t3: String) => (InstallResources(t0, t1, t2, t3)).runNow()), IsInstalled = js.Any.fromFunction3((t0: String, t1: String, t2: js.Array[Boolean]) => (IsInstalled(t0, t1, t2)).runNow()), RemovePackageByFiles = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: String) => (RemovePackageByFiles(t0, t1, t2)).runNow()), SearchFile = js.Any.fromFunction4((t0: String, t1: String, t2: js.Array[Boolean], t3: js.Array[String]) => (SearchFile(t0, t1, t2, t3)).runNow()), acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
          __obj.asInstanceOf[XSyncDbusSessionHelper]
        }
      }
    }
  }
}
