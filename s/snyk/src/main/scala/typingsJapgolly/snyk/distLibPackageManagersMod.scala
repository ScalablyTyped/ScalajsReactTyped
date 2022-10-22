package typingsJapgolly.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPackageManagersMod {
  
  @JSImport("snyk/dist/lib/package-managers", "GRAPH_SUPPORTED_PACKAGE_MANAGERS")
  @js.native
  val GRAPH_SUPPORTED_PACKAGE_MANAGERS: js.Array[SupportedPackageManagers] = js.native
  
  @JSImport("snyk/dist/lib/package-managers", "PINNING_SUPPORTED_PACKAGE_MANAGERS")
  @js.native
  val PINNING_SUPPORTED_PACKAGE_MANAGERS: js.Array[SupportedPackageManagers] = js.native
  
  @js.native
  sealed trait SUPPORTED_MANIFEST_FILES extends StObject
  @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_MANIFEST_FILES")
  @js.native
  object SUPPORTED_MANIFEST_FILES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SUPPORTED_MANIFEST_FILES & String] = js.native
    
    @js.native
    sealed trait BUILD_GRADLE
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "build.gradle" */ val BUILD_GRADLE: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.BUILD_GRADLE & String = js.native
    
    @js.native
    sealed trait BUILD_GRADLE_KTS
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "build.gradle.kts" */ val BUILD_GRADLE_KTS: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.BUILD_GRADLE_KTS & String = js.native
    
    @js.native
    sealed trait BUILD_SBT
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "build.sbt" */ val BUILD_SBT: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.BUILD_SBT & String = js.native
    
    @js.native
    sealed trait COCOAPODS_PODFILE
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "CocoaPods.podfile" */ val COCOAPODS_PODFILE: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.COCOAPODS_PODFILE & String = js.native
    
    @js.native
    sealed trait COCOAPODS_PODFILE_YAML
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "CocoaPods.podfile.yaml" */ val COCOAPODS_PODFILE_YAML: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.COCOAPODS_PODFILE_YAML & String = js.native
    
    @js.native
    sealed trait COMPOSER_LOCK
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "composer.lock" */ val COMPOSER_LOCK: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.COMPOSER_LOCK & String = js.native
    
    @js.native
    sealed trait GEMFILE
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "Gemfile" */ val GEMFILE: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.GEMFILE & String = js.native
    
    @js.native
    sealed trait GEMFILE_LOCK
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "Gemfile.lock" */ val GEMFILE_LOCK: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.GEMFILE_LOCK & String = js.native
    
    @js.native
    sealed trait GEMSPEC
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* ".gemspec" */ val GEMSPEC: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.GEMSPEC & String = js.native
    
    @js.native
    sealed trait GOPKG_LOCK
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "Gopkg.lock" */ val GOPKG_LOCK: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.GOPKG_LOCK & String = js.native
    
    @js.native
    sealed trait GO_MOD
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "go.mod" */ val GO_MOD: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.GO_MOD & String = js.native
    
    @js.native
    sealed trait JAR
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* ".jar" */ val JAR: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.JAR & String = js.native
    
    @js.native
    sealed trait MIX_EXS
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "mix.exs" */ val MIX_EXS: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.MIX_EXS & String = js.native
    
    @js.native
    sealed trait PACKAGES_CONFIG
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "packages.config" */ val PACKAGES_CONFIG: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PACKAGES_CONFIG & String = js.native
    
    @js.native
    sealed trait PACKAGE_JSON
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "package.json" */ val PACKAGE_JSON: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PACKAGE_JSON & String = js.native
    
    @js.native
    sealed trait PACKAGE_LOCK_JSON
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "package-lock.json" */ val PACKAGE_LOCK_JSON: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PACKAGE_LOCK_JSON & String = js.native
    
    @js.native
    sealed trait PAKET_DEPENDENCIES
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "paket.dependencies" */ val PAKET_DEPENDENCIES: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PAKET_DEPENDENCIES & String = js.native
    
    @js.native
    sealed trait PIPFILE
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "Pipfile" */ val PIPFILE: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PIPFILE & String = js.native
    
    @js.native
    sealed trait PODFILE
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "Podfile" */ val PODFILE: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PODFILE & String = js.native
    
    @js.native
    sealed trait PODFILE_LOCK
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "Podfile.lock" */ val PODFILE_LOCK: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PODFILE_LOCK & String = js.native
    
    @js.native
    sealed trait POETRY_LOCK
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "poetry.lock" */ val POETRY_LOCK: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.POETRY_LOCK & String = js.native
    
    @js.native
    sealed trait POM_XML
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "pom.xml" */ val POM_XML: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.POM_XML & String = js.native
    
    @js.native
    sealed trait PROJECT_ASSETS_JSON
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "project.assets.json" */ val PROJECT_ASSETS_JSON: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PROJECT_ASSETS_JSON & String = js.native
    
    @js.native
    sealed trait PROJECT_JSON
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "project.json" */ val PROJECT_JSON: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PROJECT_JSON & String = js.native
    
    @js.native
    sealed trait REQUIREMENTS_TXT
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "requirements.txt" */ val REQUIREMENTS_TXT: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.REQUIREMENTS_TXT & String = js.native
    
    @js.native
    sealed trait SETUP_PY
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "setup.py" */ val SETUP_PY: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.SETUP_PY & String = js.native
    
    @js.native
    sealed trait VENDOR_JSON
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "vendor.json" */ val VENDOR_JSON: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.VENDOR_JSON & String = js.native
    
    @js.native
    sealed trait WAR
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* ".war" */ val WAR: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.WAR & String = js.native
    
    @js.native
    sealed trait YARN_LOCK
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "yarn.lock" */ val YARN_LOCK: typingsJapgolly.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.YARN_LOCK & String = js.native
  }
  
  /* Inlined {readonly [ packageManager in snyk.snyk/dist/lib/package-managers.SupportedPackageManagers ]: string} */
  object SUPPORTED_PACKAGE_MANAGER_NAME {
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.Unmanaged (C/C++)")
    @js.native
    val UnmanagedCC: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.cocoapods")
    @js.native
    val cocoapods: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.composer")
    @js.native
    val composer: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.golangdep")
    @js.native
    val golangdep: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.gomodules")
    @js.native
    val gomodules: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.govendor")
    @js.native
    val govendor: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.gradle")
    @js.native
    val gradle: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.hex")
    @js.native
    val hex: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.maven")
    @js.native
    val maven: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.npm")
    @js.native
    val npm: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.nuget")
    @js.native
    val nuget: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.paket")
    @js.native
    val paket: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.pip")
    @js.native
    val pip: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.poetry")
    @js.native
    val poetry: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.rubygems")
    @js.native
    val rubygems: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.sbt")
    @js.native
    val sbt: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.yarn")
    @js.native
    val yarn: String = js.native
  }
  
  object SupportedPackageManagers {
    
    inline def `Unmanaged LeftparenthesisCSlashCPlussignPlussignRightparenthesis`: /* Unmanaged (C/C++) */ String = ("Unmanaged (C/C++)").asInstanceOf[/* Unmanaged (C/C++) */ String]
    
    inline def cocoapods: typingsJapgolly.snyk.snykStrings.cocoapods = "cocoapods".asInstanceOf[typingsJapgolly.snyk.snykStrings.cocoapods]
    
    inline def composer: typingsJapgolly.snyk.snykStrings.composer = "composer".asInstanceOf[typingsJapgolly.snyk.snykStrings.composer]
    
    inline def golangdep: typingsJapgolly.snyk.snykStrings.golangdep = "golangdep".asInstanceOf[typingsJapgolly.snyk.snykStrings.golangdep]
    
    inline def gomodules: typingsJapgolly.snyk.snykStrings.gomodules = "gomodules".asInstanceOf[typingsJapgolly.snyk.snykStrings.gomodules]
    
    inline def govendor: typingsJapgolly.snyk.snykStrings.govendor = "govendor".asInstanceOf[typingsJapgolly.snyk.snykStrings.govendor]
    
    inline def gradle: typingsJapgolly.snyk.snykStrings.gradle = "gradle".asInstanceOf[typingsJapgolly.snyk.snykStrings.gradle]
    
    inline def hex: typingsJapgolly.snyk.snykStrings.hex = "hex".asInstanceOf[typingsJapgolly.snyk.snykStrings.hex]
    
    inline def maven: typingsJapgolly.snyk.snykStrings.maven = "maven".asInstanceOf[typingsJapgolly.snyk.snykStrings.maven]
    
    inline def npm: typingsJapgolly.snyk.snykStrings.npm = "npm".asInstanceOf[typingsJapgolly.snyk.snykStrings.npm]
    
    inline def nuget: typingsJapgolly.snyk.snykStrings.nuget = "nuget".asInstanceOf[typingsJapgolly.snyk.snykStrings.nuget]
    
    inline def paket: typingsJapgolly.snyk.snykStrings.paket = "paket".asInstanceOf[typingsJapgolly.snyk.snykStrings.paket]
    
    inline def pip: typingsJapgolly.snyk.snykStrings.pip = "pip".asInstanceOf[typingsJapgolly.snyk.snykStrings.pip]
    
    inline def poetry: typingsJapgolly.snyk.snykStrings.poetry = "poetry".asInstanceOf[typingsJapgolly.snyk.snykStrings.poetry]
    
    inline def rubygems: typingsJapgolly.snyk.snykStrings.rubygems = "rubygems".asInstanceOf[typingsJapgolly.snyk.snykStrings.rubygems]
    
    inline def sbt: typingsJapgolly.snyk.snykStrings.sbt = "sbt".asInstanceOf[typingsJapgolly.snyk.snykStrings.sbt]
    
    inline def yarn: typingsJapgolly.snyk.snykStrings.yarn = "yarn".asInstanceOf[typingsJapgolly.snyk.snykStrings.yarn]
  }
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.snyk.snykStrings.rubygems
    - typingsJapgolly.snyk.snykStrings.npm
    - typingsJapgolly.snyk.snykStrings.yarn
    - typingsJapgolly.snyk.snykStrings.maven
    - typingsJapgolly.snyk.snykStrings.pip
    - typingsJapgolly.snyk.snykStrings.sbt
    - typingsJapgolly.snyk.snykStrings.gradle
    - typingsJapgolly.snyk.snykStrings.golangdep
    - typingsJapgolly.snyk.snykStrings.govendor
    - typingsJapgolly.snyk.snykStrings.gomodules
    - typingsJapgolly.snyk.snykStrings.nuget
    - typingsJapgolly.snyk.snykStrings.paket
    - typingsJapgolly.snyk.snykStrings.composer
    - typingsJapgolly.snyk.snykStrings.cocoapods
    - typingsJapgolly.snyk.snykStrings.poetry
    - typingsJapgolly.snyk.snykStrings.hex
    - / * Unmanaged (C/C++) * / java.lang.String
  */
  type SupportedPackageManagers = _SupportedPackageManagers | (/* Unmanaged (C/C++) */ String)
  
  trait _SupportedPackageManagers extends StObject
}
