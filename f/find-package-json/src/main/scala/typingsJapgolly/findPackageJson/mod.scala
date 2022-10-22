package typingsJapgolly.findPackageJson

import typingsJapgolly.findPackageJson.findPackageJsonBooleans.`false`
import typingsJapgolly.findPackageJson.findPackageJsonBooleans.`true`
import typingsJapgolly.node.NodeModule
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Find package.json files.
    *
    * @param root The root directory we should start searching in.
    * @returns Iterator interface.
    */
  inline def apply(): FinderIterator = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FinderIterator]
  inline def apply(root: String): FinderIterator = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[FinderIterator]
  inline def apply(root: NodeModule): FinderIterator = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[FinderIterator]
  
  @JSImport("find-package-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Done
    extends StObject
       with FindResult {
    
    var done: `true`
    
    var filename: Unit
    
    var value: Unit
  }
  object Done {
    
    inline def apply(filename: Unit, value: Unit): Done = {
      val __obj = js.Dynamic.literal(done = true, filename = filename.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done]
    }
    
    extension [Self <: Done](x: Self) {
      
      inline def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: Unit): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.findPackageJson.mod.FoundPackage
    - typingsJapgolly.findPackageJson.mod.Done
  */
  trait FindResult extends StObject
  object FindResult {
    
    inline def Done(filename: Unit, value: Unit): typingsJapgolly.findPackageJson.mod.Done = {
      val __obj = js.Dynamic.literal(done = true, filename = filename.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.findPackageJson.mod.Done]
    }
    
    inline def FoundPackage(filename: String, value: PackageWithPath): typingsJapgolly.findPackageJson.mod.FoundPackage = {
      val __obj = js.Dynamic.literal(done = false, filename = filename.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.findPackageJson.mod.FoundPackage]
    }
  }
  
  @js.native
  trait FinderIterator
    extends StObject
       with IterableIterator[PackageWithPath] {
    
    /**
      * Return the parsed package.json that we find in a parent folder.
      *
      * @returns Value, filename and indication if the iteration is done.
      */
    def next(): FindResult = js.native
  }
  
  trait FoundPackage
    extends StObject
       with FindResult {
    
    var done: `false`
    
    /**
      * Path to the found `package.json` file.
      */
    var filename: String
    
    var value: PackageWithPath
  }
  object FoundPackage {
    
    inline def apply(filename: String, value: PackageWithPath): FoundPackage = {
      val __obj = js.Dynamic.literal(done = false, filename = filename.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FoundPackage]
    }
    
    extension [Self <: FoundPackage](x: Self) {
      
      inline def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setValue(value: PackageWithPath): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Package = typingsJapgolly.findPackageJson.packageJsonMod.PackageJSON
  
  type PackageJSON = typingsJapgolly.findPackageJson.packageJsonMod.PackageJSON
  
  trait PackageWithPath
    extends StObject
       with typingsJapgolly.findPackageJson.packageJsonMod.PackageJSON {
    
    /**
      * Path to the found `package.json` file.
      */
    var __path: String
  }
  object PackageWithPath {
    
    inline def apply(__path: String): PackageWithPath = {
      val __obj = js.Dynamic.literal(__path = __path.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageWithPath]
    }
    
    extension [Self <: PackageWithPath](x: Self) {
      
      inline def set__path(value: String): Self = StObject.set(x, "__path", value.asInstanceOf[js.Any])
    }
  }
}
