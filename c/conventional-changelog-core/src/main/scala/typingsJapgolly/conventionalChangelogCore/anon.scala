package typingsJapgolly.conventionalChangelogCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.normalizePackageData.anon.Email
import typingsJapgolly.normalizePackageData.anon.Type
import typingsJapgolly.normalizePackageData.anon.Url
import typingsJapgolly.normalizePackageData.mod.Person
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<std.Partial<normalize-package-data.normalize-package-data.Package>> */
  trait ReadonlyPartialPackage extends StObject {
    
    val _id: js.UndefOr[String] = js.undefined
    
    val author: js.UndefOr[Person] = js.undefined
    
    val bin: js.UndefOr[StringDictionary[String]] = js.undefined
    
    val bugs: js.UndefOr[Email | Url] = js.undefined
    
    val bundleDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    val contributors: js.UndefOr[js.Array[Person]] = js.undefined
    
    val dependencies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    val description: js.UndefOr[String] = js.undefined
    
    val devDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    val engines: js.UndefOr[StringDictionary[String]] = js.undefined
    
    val files: js.UndefOr[js.Array[String]] = js.undefined
    
    val homepage: js.UndefOr[String] = js.undefined
    
    val keywords: js.UndefOr[js.Array[String]] = js.undefined
    
    val license: js.UndefOr[String] = js.undefined
    
    val maintainers: js.UndefOr[js.Array[Person]] = js.undefined
    
    val man: js.UndefOr[js.Array[String]] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
    
    val optionalDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    val readme: js.UndefOr[String] = js.undefined
    
    val repository: js.UndefOr[Type] = js.undefined
    
    val scripts: js.UndefOr[StringDictionary[String]] = js.undefined
    
    val version: js.UndefOr[String] = js.undefined
  }
  object ReadonlyPartialPackage {
    
    inline def apply(): ReadonlyPartialPackage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyPartialPackage]
    }
    
    extension [Self <: ReadonlyPartialPackage](x: Self) {
      
      inline def setAuthor(value: Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setBin(value: StringDictionary[String]): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      inline def setBugs(value: Email | Url): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
      
      inline def setBugsUndefined: Self = StObject.set(x, "bugs", js.undefined)
      
      inline def setBundleDependencies(value: StringDictionary[String]): Self = StObject.set(x, "bundleDependencies", value.asInstanceOf[js.Any])
      
      inline def setBundleDependenciesUndefined: Self = StObject.set(x, "bundleDependencies", js.undefined)
      
      inline def setContributors(value: js.Array[Person]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
      
      inline def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
      
      inline def setContributorsVarargs(value: Person*): Self = StObject.set(x, "contributors", js.Array(value*))
      
      inline def setDependencies(value: StringDictionary[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDevDependencies(value: StringDictionary[String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      inline def setEngines(value: StringDictionary[String]): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
      
      inline def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setMaintainers(value: js.Array[Person]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
      
      inline def setMaintainersUndefined: Self = StObject.set(x, "maintainers", js.undefined)
      
      inline def setMaintainersVarargs(value: Person*): Self = StObject.set(x, "maintainers", js.Array(value*))
      
      inline def setMan(value: js.Array[String]): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
      
      inline def setManUndefined: Self = StObject.set(x, "man", js.undefined)
      
      inline def setManVarargs(value: String*): Self = StObject.set(x, "man", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptionalDependencies(value: StringDictionary[String]): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
      
      inline def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
      
      inline def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
      
      inline def setReadmeUndefined: Self = StObject.set(x, "readme", js.undefined)
      
      inline def setRepository(value: Type): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      inline def setScripts(value: StringDictionary[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
    }
  }
}
