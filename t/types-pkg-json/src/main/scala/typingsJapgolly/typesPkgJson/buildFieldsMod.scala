package typingsJapgolly.typesPkgJson

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.typesPkgJson.anon.Directory
import typingsJapgolly.typesPkgJson.anon.Email
import typingsJapgolly.typesPkgJson.anon.Name
import typingsJapgolly.typesPkgJson.anon.Optional
import typingsJapgolly.typesPkgJson.anon.Type
import typingsJapgolly.typesPkgJson.buildUtilsMod.LiteralUnion
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarkaix
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarkarm
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarkarm64
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarkdarwin
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarkfreebsd
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarkia32
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarklinux
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarkmips
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarkmipsel
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarkopenbsd
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarkppc
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarkppc64
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarks390
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarks390x
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarksunos
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarkwin32
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarkx32
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.Exclamationmarkx64
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.ISC
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.MIT
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.aix
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.arm
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.arm64
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.darwin
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.freebsd
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.ia32
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.linux
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.mips
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.mipsel
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.openbsd
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.ppc
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.ppc64
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.s390
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.s390x
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.sunos
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.win32
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.x32
import typingsJapgolly.typesPkgJson.typesPkgJsonStrings.x64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFieldsMod {
  
  type Bin = String | StringDictionary[String]
  
  type BugsLocation = String | Email
  
  type CPU = LiteralUnion[
    arm | arm64 | ia32 | mips | mipsel | ppc | ppc64 | s390 | s390x | x32 | x64 | Exclamationmarkarm | Exclamationmarkarm64 | Exclamationmarkia32 | Exclamationmarkmips | Exclamationmarkmipsel | Exclamationmarkppc | Exclamationmarkppc64 | Exclamationmarks390 | Exclamationmarks390x | Exclamationmarkx32 | Exclamationmarkx64, 
    String
  ]
  
  type Dependencies = StringDictionary[String]
  
  trait DirectoryLocations extends StObject {
    
    /**
      * Location for executable scripts. Sugar to generate entries in the `bin` property by walking the folder.
      */
    var bin: js.UndefOr[String] = js.undefined
    
    /**
      * Location for Markdown files.
      */
    var doc: js.UndefOr[String] = js.undefined
    
    /**
      * Location for example scripts.
      */
    var example: js.UndefOr[String] = js.undefined
    
    /**
      * Location for the bulk of the library.
      */
    var lib: js.UndefOr[String] = js.undefined
    
    /**
      * Location for man pages. Sugar to generate a `man` array by walking the folder.
      */
    var man: js.UndefOr[String] = js.undefined
    
    /**
      * Location for test files.
      */
    var test: js.UndefOr[String] = js.undefined
  }
  object DirectoryLocations {
    
    inline def apply(): DirectoryLocations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryLocations]
    }
    
    extension [Self <: DirectoryLocations](x: Self) {
      
      inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      inline def setDoc(value: String): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
      
      inline def setExample(value: String): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
      
      inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
      
      inline def setLib(value: String): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      inline def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
      
      inline def setMan(value: String): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
      
      inline def setManUndefined: Self = StObject.set(x, "man", js.undefined)
      
      inline def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ EngineName in 'npm' | 'node' | string ]: string}
    }}}
    */
  @js.native
  trait Engines extends StObject
  
  type Funding = String | Type
  
  trait License extends StObject {
    
    var `type`: js.UndefOr[LicenseID] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object License {
    
    inline def apply(): License = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[License]
    }
    
    extension [Self <: License](x: Self) {
      
      inline def setType(value: LicenseID): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type LicenseID = LiteralUnion[MIT | ISC, String]
  
  type Licenses = js.Array[License]
  
  type OS = LiteralUnion[
    aix | darwin | freebsd | linux | openbsd | sunos | win32 | Exclamationmarkaix | Exclamationmarkdarwin | Exclamationmarkfreebsd | Exclamationmarklinux | Exclamationmarkopenbsd | Exclamationmarksunos | Exclamationmarkwin32, 
    String
  ]
  
  type PeerDependenciesMeta = StringDictionary[Optional]
  
  type Person = String | Name
  
  type Repository = String | Directory
}
