package typingsJapgolly.electronPackager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // see https://github.com/electron-userland/electron-packager/blob/92d09bba34599283a794fd6f24b88470f0cb1074/src/mac.js#L372
  type ElectronNotarizeOptions = typingsJapgolly.electronPackager.mod.Omit[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NotarizeOptions */ js.Any, 
    typingsJapgolly.electronPackager.electronPackagerStrings.appBundleId | typingsJapgolly.electronPackager.electronPackagerStrings.appPath
  ]
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  /**
    * Callback which is called when electron-packager is done.
    *
    * @param err - Contains errors if any.
    * @param appPaths - Path(s) to the newly created application(s).
    */
  type finalCallback = js.Function2[
    /* err */ js.Error, 
    /* appPaths */ java.lang.String | js.Array[java.lang.String], 
    scala.Unit
  ]
  type ignoreFunction = js.Function1[/* path */ java.lang.String, scala.Boolean]
  type onCompleteFn = js.Function5[
    /* buildPath */ java.lang.String, 
    /* electronVersion */ java.lang.String, 
    /* platform */ java.lang.String, 
    /* arch */ java.lang.String, 
    /* callbackFn */ js.Function0[scala.Unit], 
    scala.Unit
  ]
}
