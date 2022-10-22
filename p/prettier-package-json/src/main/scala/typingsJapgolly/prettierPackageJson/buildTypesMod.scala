package typingsJapgolly.prettierPackageJson

import typingsJapgolly.prettierPackageJson.prettierPackageJsonBooleans.`false`
import typingsJapgolly.prettierPackageJson.prettierPackageJsonInts.`-1`
import typingsJapgolly.prettierPackageJson.prettierPackageJsonInts.`0`
import typingsJapgolly.prettierPackageJson.prettierPackageJsonInts.`1`
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Dot
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkaix
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkarm
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkarm64
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkdarwin
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkfreebsd
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkia32
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarklinux
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkmips
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkmipsel
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkopenbsd
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkppc
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkppc64
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarks390
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarks390x
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarksunos
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkwin32
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkx32
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkx64
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.aix
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.arm
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.arm64
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.commonjs
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.darwin
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.freebsd
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.ia32
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.linux
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.mips
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.mipsel
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.module
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.openbsd
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.ppc
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.ppc64
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.s390
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.s390x
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.sunos
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.win32
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.x32
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.x64
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.typeFest.anon.DictmoduleName
import typingsJapgolly.typeFest.anon.Directory
import typingsJapgolly.typeFest.anon.Optional
import typingsJapgolly.typeFest.anon.Type
import typingsJapgolly.typeFest.anon.TypeUrl
import typingsJapgolly.typeFest.sourceBasicMod.JsonObject
import typingsJapgolly.typeFest.sourceLiteralUnionMod.LiteralUnion
import typingsJapgolly.typeFest.sourcePackageJsonMod.PackageJson.BugsLocation
import typingsJapgolly.typeFest.sourcePackageJsonMod.PackageJson.Dependency
import typingsJapgolly.typeFest.sourcePackageJsonMod.PackageJson.DirectoryLocations
import typingsJapgolly.typeFest.sourcePackageJsonMod.PackageJson.Exports
import typingsJapgolly.typeFest.sourcePackageJsonMod.PackageJson.Imports
import typingsJapgolly.typeFest.sourcePackageJsonMod.PackageJson.Person
import typingsJapgolly.typeFest.sourcePackageJsonMod.PackageJson.PublishConfig
import typingsJapgolly.typeFest.sourcePackageJsonMod.PackageJson.Scripts
import typingsJapgolly.typeFest.sourcePackageJsonMod.PackageJson.WorkspaceConfig
import typingsJapgolly.typeFest.sourcePackageJsonMod.PackageJson.WorkspacePattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesMod {
  
  /* Inlined std.Partial<{  useTabs :boolean,   tabWidth :number,   expandUsers :boolean,   enforceMultiple :boolean,   keyOrder :std.Array<prettier-package-json.prettier-package-json/build/types.PackageJsonKey> | (a : prettier-package-json.prettier-package-json/build/types.PackageJsonKey, b : prettier-package-json.prettier-package-json/build/types.PackageJsonKey): -1 | 0 | 1}> */
  trait Options extends StObject {
    
    var enforceMultiple: js.UndefOr[Boolean] = js.undefined
    
    var expandUsers: js.UndefOr[Boolean] = js.undefined
    
    var keyOrder: js.UndefOr[
        js.Array[PackageJsonKey] | (js.Function2[/* a */ PackageJsonKey, /* b */ PackageJsonKey, `-1` | `0` | `1`])
      ] = js.undefined
    
    var tabWidth: js.UndefOr[Double] = js.undefined
    
    var useTabs: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEnforceMultiple(value: Boolean): Self = StObject.set(x, "enforceMultiple", value.asInstanceOf[js.Any])
      
      inline def setEnforceMultipleUndefined: Self = StObject.set(x, "enforceMultiple", js.undefined)
      
      inline def setExpandUsers(value: Boolean): Self = StObject.set(x, "expandUsers", value.asInstanceOf[js.Any])
      
      inline def setExpandUsersUndefined: Self = StObject.set(x, "expandUsers", js.undefined)
      
      inline def setKeyOrder(
        value: js.Array[PackageJsonKey] | (js.Function2[/* a */ PackageJsonKey, /* b */ PackageJsonKey, `-1` | `0` | `1`])
      ): Self = StObject.set(x, "keyOrder", value.asInstanceOf[js.Any])
      
      inline def setKeyOrderFunction2(value: (/* a */ PackageJsonKey, /* b */ PackageJsonKey) => `-1` | `0` | `1`): Self = StObject.set(x, "keyOrder", js.Any.fromFunction2(value))
      
      inline def setKeyOrderUndefined: Self = StObject.set(x, "keyOrder", js.undefined)
      
      inline def setKeyOrderVarargs(value: PackageJsonKey*): Self = StObject.set(x, "keyOrder", js.Array(value*))
      
      inline def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      inline def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
      
      inline def setUseTabs(value: Boolean): Self = StObject.set(x, "useTabs", value.asInstanceOf[js.Any])
      
      inline def setUseTabsUndefined: Self = StObject.set(x, "useTabs", js.undefined)
    }
  }
  
  /* Inlined type-fest.type-fest.PackageJson & {  $schema :string | undefined} */
  @js.native
  trait PackageJson extends StObject {
    
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.native
    
    var author: js.UndefOr[Person] = js.native
    
    /**
    		The executable files that should be installed into the `PATH`.
    		*/
    var bin: js.UndefOr[String | (Partial[Record[String, String]])] = js.native
    
    /**
    		A hint to JavaScript bundlers or component tools when packaging modules for client side use.
    		*/
    var browser: js.UndefOr[String | (Partial[Record[String, String | `false`]])] = js.native
    
    /**
    		The URL to the package's issue tracker and/or the email address to which issues should be reported.
    		*/
    var bugs: js.UndefOr[BugsLocation] = js.native
    
    /**
    		Alias of `bundledDependencies`.
    		*/
    var bundleDependencies: js.UndefOr[js.Array[String]] = js.native
    
    /**
    		Package names that are bundled when the package is published.
    		*/
    var bundledDependencies: js.UndefOr[js.Array[String]] = js.native
    
    /**
    		Is used to set configuration parameters used in package scripts that persist across upgrades.
    		*/
    var config: js.UndefOr[JsonObject] = js.native
    
    /**
    		A list of people who contributed to the package.
    		*/
    var contributors: js.UndefOr[js.Array[Person]] = js.native
    
    /**
    		CPU architectures the module runs on.
    		*/
    var cpu: js.UndefOr[
        js.Array[
          LiteralUnion[
            arm | arm64 | ia32 | mips | mipsel | ppc | ppc64 | s390 | s390x | x32 | x64 | Exclamationmarkarm | Exclamationmarkarm64 | Exclamationmarkia32 | Exclamationmarkmips | Exclamationmarkmipsel | Exclamationmarkppc | Exclamationmarkppc64 | Exclamationmarks390 | Exclamationmarks390x | Exclamationmarkx32 | Exclamationmarkx64, 
            String
          ]
        ]
      ] = js.native
    
    /**
    		The dependencies of the package.
    		*/
    var dependencies: js.UndefOr[Dependency] = js.native
    
    /**
    		Package description, listed in `npm search`.
    		*/
    var description: js.UndefOr[String] = js.native
    
    /**
    		Additional tooling dependencies that are not required for the package to work. Usually test, build, or documentation tooling.
    		*/
    var devDependencies: js.UndefOr[Dependency] = js.native
    
    /**
    		Indicates the structure of the package.
    		*/
    var directories: js.UndefOr[DirectoryLocations] = js.native
    
    /**
    		@deprecated
    		*/
    var engineStrict: js.UndefOr[Boolean] = js.native
    
    /**
    		Engines that this package runs on.
    		*/
    var engines: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ EngineName in 'npm' | 'node' | string ]:? string} */ js.Any
      ] = js.native
    
    /**
    		A module ID with untranspiled code that is the primary entry point to the program.
    		*/
    var esnext: js.UndefOr[String | DictmoduleName] = js.native
    
    /**
    		Subpath exports to define entry points of the package.
    		[Read more.](https://nodejs.org/api/packages.html#subpath-exports)
    		*/
    var exports: js.UndefOr[Exports] = js.native
    
    /**
    		The files included in the package.
    		*/
    var files: js.UndefOr[js.Array[String]] = js.native
    
    /**
    		If your package only allows one version of a given dependency, and you’d like to enforce the same behavior as `yarn install --flat` on the command-line, set this to `true`.
    		Note that if your `package.json` contains `"flat": true` and other packages depend on yours (e.g. you are building a library rather than an app), those other packages will also need `"flat": true` in their `package.json` or be installed with `yarn install --flat` on the command-line.
    		*/
    var flat: js.UndefOr[Boolean] = js.native
    
    /**
    		Describes and notifies consumers of a package's monetary support information.
    		[Read more.](https://github.com/npm/rfcs/blob/latest/accepted/0017-add-funding-support.md)
    		*/
    var funding: js.UndefOr[String | TypeUrl] = js.native
    
    /**
    		The URL to the package's homepage.
    		*/
    var homepage: js.UndefOr[LiteralUnion[Dot, String]] = js.native
    
    /**
    		Subpath imports to define internal package import maps that only apply to import specifiers from within the package itself.
    		[Read more.](https://nodejs.org/api/packages.html#subpath-imports)
    		*/
    var imports: js.UndefOr[Imports] = js.native
    
    /**
    		JSPM configuration.
    		*/
    var jspm: js.UndefOr[typingsJapgolly.typeFest.sourcePackageJsonMod.PackageJson] = js.native
    
    /**
    		Keywords associated with package, listed in `npm search`.
    		*/
    var keywords: js.UndefOr[js.Array[String]] = js.native
    
    /**
    		The license for the package.
    		*/
    var license: js.UndefOr[String] = js.native
    
    /**
    		The licenses for the package.
    		*/
    var licenses: js.UndefOr[js.Array[Type]] = js.native
    
    /**
    		The module ID that is the primary entry point to the program.
    		*/
    var main: js.UndefOr[String] = js.native
    
    /**
    		A list of people who maintain the package.
    		*/
    var maintainers: js.UndefOr[js.Array[Person]] = js.native
    
    /**
    		Filenames to put in place for the `man` program to find.
    		*/
    var man: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
    		An ECMAScript module ID that is the primary entry point to the program.
    		*/
    var module: js.UndefOr[String] = js.native
    
    /**
    		The name of the package.
    		*/
    var name: js.UndefOr[String] = js.native
    
    /**
    		Dependencies that are skipped if they fail to install.
    		*/
    var optionalDependencies: js.UndefOr[Dependency] = js.native
    
    /**
    		Operating systems the module runs on.
    		*/
    var os: js.UndefOr[
        js.Array[
          LiteralUnion[
            aix | darwin | freebsd | linux | openbsd | sunos | win32 | Exclamationmarkaix | Exclamationmarkdarwin | Exclamationmarkfreebsd | Exclamationmarklinux | Exclamationmarkopenbsd | Exclamationmarksunos | Exclamationmarkwin32, 
            String
          ]
        ]
      ] = js.native
    
    /**
    		Defines which package manager is expected to be used when working on the current project. It can set to any of the [supported package managers](https://nodejs.org/api/corepack.html#supported-package-managers), and will ensure that your teams use the exact same package manager versions without having to install anything else than Node.js.
    		__This field is currently experimental and needs to be opted-in; check the [Corepack](https://nodejs.org/api/corepack.html) page for details about the procedure.__
    		@example
    		```json
    		{
    			"packageManager": "<package manager name>@<version>"
    		}
    		```
    		*/
    var packageManager: js.UndefOr[String] = js.native
    
    /**
    		Dependencies that will usually be required by the package user directly or via another dependency.
    		*/
    var peerDependencies: js.UndefOr[Dependency] = js.native
    
    /**
    		Indicate peer dependencies that are optional.
    		*/
    var peerDependenciesMeta: js.UndefOr[Partial[Record[String, Optional]]] = js.native
    
    /**
    		If set to `true`, a warning will be shown if package is installed locally. Useful if the package is primarily a command-line application that should be installed globally.
    		@deprecated
    		*/
    var preferGlobal: js.UndefOr[Boolean] = js.native
    
    /**
    		If set to `true`, then npm will refuse to publish it.
    		*/
    var `private`: js.UndefOr[Boolean] = js.native
    
    /**
    		A set of config values that will be used at publish-time. It's especially handy to set the tag, registry or access, to ensure that a given package is not tagged with 'latest', published to the global public registry or that a scoped module is private by default.
    		*/
    var publishConfig: js.UndefOr[PublishConfig] = js.native
    
    /**
    		Location for the code repository.
    		*/
    var repository: js.UndefOr[String | Directory] = js.native
    
    /**
    		Selective version resolutions. Allows the definition of custom package versions inside dependencies without manual edits in the `yarn.lock` file.
    		*/
    var resolutions: js.UndefOr[Dependency] = js.native
    
    /**
    		Script commands that are run at various times in the lifecycle of the package. The key is the lifecycle event, and the value is the command to run at that point.
    		*/
    var scripts: js.UndefOr[Scripts] = js.native
    
    /**
    		Denote which files in your project are "pure" and therefore safe for Webpack to prune if unused.
    		[Read more.](https://webpack.js.org/guides/tree-shaking/)
    		*/
    var sideEffects: js.UndefOr[Boolean | js.Array[String]] = js.native
    
    /**
    		Resolution algorithm for importing ".js" files from the package's scope.
    		[Read more.](https://nodejs.org/api/esm.html#esm_package_json_type_field)
    		*/
    var `type`: js.UndefOr[module | commonjs] = js.native
    
    /**
    		Location of the bundled TypeScript declaration file.
    		*/
    var types: js.UndefOr[String] = js.native
    
    /**
    		Version selection map of TypeScript.
    		*/
    var typesVersions: js.UndefOr[Partial[Record[String, Partial[Record[String, js.Array[String]]]]]] = js.native
    
    /**
    		Location of the bundled TypeScript declaration file. Alias of `types`.
    		*/
    var typings: js.UndefOr[String] = js.native
    
    /**
    		Package version, parseable by [`node-semver`](https://github.com/npm/node-semver).
    		*/
    var version: js.UndefOr[String] = js.native
    
    /**
    		Used to configure [Yarn workspaces](https://classic.yarnpkg.com/docs/workspaces/).
    		Workspaces allow you to manage multiple packages within the same repository in such a way that you only need to run `yarn install` once to install all of them in a single pass.
    		Please note that the top-level `private` property of `package.json` **must** be set to `true` in order to use workspaces.
    		*/
    var workspaces: js.UndefOr[js.Array[WorkspacePattern] | WorkspaceConfig] = js.native
  }
  
  /* Inlined keyof prettier-package-json.prettier-package-json/build/types.PackageJson */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.main
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.description
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.version
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.funding
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.typesVersions
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.directories
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.workspaces
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.exports
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.module
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.browser
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.engines
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.typings
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.cpu
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.bugs
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.contributors
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.`private`
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.author
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.config
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.bundleDependencies
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.devDependencies
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.flat
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.bin
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.maintainers
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.publishConfig
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.files
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.jspm
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.$schema
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.peerDependencies
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.license
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.sideEffects
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.types
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.homepage
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.packageManager
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.optionalDependencies
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.`type`
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.dependencies
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.bundledDependencies
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.scripts
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.name
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.esnext
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.peerDependenciesMeta
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.preferGlobal
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.resolutions
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.man
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.os
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.imports
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.keywords
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.repository
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.engineStrict
    - typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.licenses
  */
  trait PackageJsonKey extends StObject
  object PackageJsonKey {
    
    inline def $schema: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.$schema = "$schema".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.$schema]
    
    inline def author: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.author = "author".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.author]
    
    inline def bin: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.bin = "bin".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.bin]
    
    inline def browser: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.browser = "browser".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.browser]
    
    inline def bugs: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.bugs = "bugs".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.bugs]
    
    inline def bundleDependencies: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.bundleDependencies = "bundleDependencies".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.bundleDependencies]
    
    inline def bundledDependencies: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.bundledDependencies = "bundledDependencies".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.bundledDependencies]
    
    inline def config: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.config = "config".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.config]
    
    inline def contributors: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.contributors = "contributors".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.contributors]
    
    inline def cpu: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.cpu = "cpu".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.cpu]
    
    inline def dependencies: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.dependencies = "dependencies".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.dependencies]
    
    inline def description: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.description = "description".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.description]
    
    inline def devDependencies: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.devDependencies = "devDependencies".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.devDependencies]
    
    inline def directories: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.directories = "directories".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.directories]
    
    inline def engineStrict: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.engineStrict = "engineStrict".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.engineStrict]
    
    inline def engines: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.engines = "engines".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.engines]
    
    inline def esnext: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.esnext = "esnext".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.esnext]
    
    inline def exports: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.exports = "exports".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.exports]
    
    inline def files: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.files = "files".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.files]
    
    inline def flat: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.flat = "flat".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.flat]
    
    inline def funding: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.funding = "funding".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.funding]
    
    inline def homepage: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.homepage = "homepage".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.homepage]
    
    inline def imports: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.imports = "imports".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.imports]
    
    inline def jspm: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.jspm = "jspm".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.jspm]
    
    inline def keywords: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.keywords = "keywords".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.keywords]
    
    inline def license: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.license = "license".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.license]
    
    inline def licenses: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.licenses = "licenses".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.licenses]
    
    inline def main: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.main = "main".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.main]
    
    inline def maintainers: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.maintainers = "maintainers".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.maintainers]
    
    inline def man: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.man = "man".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.man]
    
    inline def module: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.module = "module".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.module]
    
    inline def name: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.name = "name".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.name]
    
    inline def optionalDependencies: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.optionalDependencies = "optionalDependencies".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.optionalDependencies]
    
    inline def os: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.os = "os".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.os]
    
    inline def packageManager: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.packageManager = "packageManager".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.packageManager]
    
    inline def peerDependencies: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.peerDependencies = "peerDependencies".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.peerDependencies]
    
    inline def peerDependenciesMeta: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.peerDependenciesMeta = "peerDependenciesMeta".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.peerDependenciesMeta]
    
    inline def preferGlobal: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.preferGlobal = "preferGlobal".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.preferGlobal]
    
    inline def `private`: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.`private` = "private".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.`private`]
    
    inline def publishConfig: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.publishConfig = "publishConfig".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.publishConfig]
    
    inline def repository: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.repository = "repository".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.repository]
    
    inline def resolutions: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.resolutions = "resolutions".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.resolutions]
    
    inline def scripts: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.scripts = "scripts".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.scripts]
    
    inline def sideEffects: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.sideEffects = "sideEffects".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.sideEffects]
    
    inline def `type`: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.`type` = "type".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.`type`]
    
    inline def types: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.types = "types".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.types]
    
    inline def typesVersions: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.typesVersions = "typesVersions".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.typesVersions]
    
    inline def typings: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.typings = "typings".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.typings]
    
    inline def version: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.version = "version".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.version]
    
    inline def workspaces: typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.workspaces = "workspaces".asInstanceOf[typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.workspaces]
  }
}
