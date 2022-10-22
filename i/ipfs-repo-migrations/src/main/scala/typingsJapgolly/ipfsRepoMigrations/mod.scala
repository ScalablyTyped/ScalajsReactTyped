package typingsJapgolly.ipfsRepoMigrations

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.ipfsRepoMigrations.anon.TypeofInvalidValueError
import typingsJapgolly.ipfsRepoMigrations.anon.TypeofMissingRepoOptionsE
import typingsJapgolly.ipfsRepoMigrations.anon.TypeofNonReversibleMigrat
import typingsJapgolly.ipfsRepoMigrations.anon.TypeofNotInitializedRepoE
import typingsJapgolly.ipfsRepoMigrations.anon.TypeofRequiredParameterEr
import typingsJapgolly.ipfsRepoMigrations.distSrcTypesMod.Backends
import typingsJapgolly.ipfsRepoMigrations.distSrcTypesMod.RepoOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-repo-migrations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object errors {
    
    @JSImport("ipfs-repo-migrations", "errors")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("ipfs-repo-migrations", "errors.InvalidValueError")
    @js.native
    open class InvalidValueError protected ()
      extends typingsJapgolly.ipfsRepoMigrations.distSrcErrorsMod.InvalidValueError {
      /**
        * @param {string} message
        */
      def this(message: String) = this()
    }
    @JSImport("ipfs-repo-migrations", "errors.InvalidValueError")
    @js.native
    def InvalidValueError: (Instantiable1[
        /* message */ String, 
        typingsJapgolly.ipfsRepoMigrations.distSrcErrorsMod.InvalidValueError
      ]) | TypeofInvalidValueError = js.native
    inline def InvalidValueError_=(
      x: (Instantiable1[
          /* message */ String, 
          typingsJapgolly.ipfsRepoMigrations.distSrcErrorsMod.InvalidValueError
        ]) | TypeofInvalidValueError
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InvalidValueError")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("ipfs-repo-migrations", "errors.MissingRepoOptionsError")
    @js.native
    open class MissingRepoOptionsError protected ()
      extends typingsJapgolly.ipfsRepoMigrations.distSrcErrorsMod.MissingRepoOptionsError {
      /**
        * @param {string} message
        */
      def this(message: String) = this()
    }
    @JSImport("ipfs-repo-migrations", "errors.MissingRepoOptionsError")
    @js.native
    def MissingRepoOptionsError: (Instantiable1[
        /* message */ String, 
        typingsJapgolly.ipfsRepoMigrations.distSrcErrorsMod.MissingRepoOptionsError
      ]) | TypeofMissingRepoOptionsE = js.native
    inline def MissingRepoOptionsError_=(
      x: (Instantiable1[
          /* message */ String, 
          typingsJapgolly.ipfsRepoMigrations.distSrcErrorsMod.MissingRepoOptionsError
        ]) | TypeofMissingRepoOptionsE
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MissingRepoOptionsError")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("ipfs-repo-migrations", "errors.NonReversibleMigrationError")
    @js.native
    open class NonReversibleMigrationError protected ()
      extends typingsJapgolly.ipfsRepoMigrations.distSrcErrorsMod.NonReversibleMigrationError {
      /**
        * @param {string} message
        */
      def this(message: String) = this()
    }
    @JSImport("ipfs-repo-migrations", "errors.NonReversibleMigrationError")
    @js.native
    def NonReversibleMigrationError: (Instantiable1[
        /* message */ String, 
        typingsJapgolly.ipfsRepoMigrations.distSrcErrorsMod.NonReversibleMigrationError
      ]) | TypeofNonReversibleMigrat = js.native
    inline def NonReversibleMigrationError_=(
      x: (Instantiable1[
          /* message */ String, 
          typingsJapgolly.ipfsRepoMigrations.distSrcErrorsMod.NonReversibleMigrationError
        ]) | TypeofNonReversibleMigrat
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NonReversibleMigrationError")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("ipfs-repo-migrations", "errors.NotInitializedRepoError")
    @js.native
    open class NotInitializedRepoError protected ()
      extends typingsJapgolly.ipfsRepoMigrations.distSrcErrorsMod.NotInitializedRepoError {
      /**
        * @param {string} message
        */
      def this(message: String) = this()
    }
    @JSImport("ipfs-repo-migrations", "errors.NotInitializedRepoError")
    @js.native
    def NotInitializedRepoError: (Instantiable1[
        /* message */ String, 
        typingsJapgolly.ipfsRepoMigrations.distSrcErrorsMod.NotInitializedRepoError
      ]) | TypeofNotInitializedRepoE = js.native
    inline def NotInitializedRepoError_=(
      x: (Instantiable1[
          /* message */ String, 
          typingsJapgolly.ipfsRepoMigrations.distSrcErrorsMod.NotInitializedRepoError
        ]) | TypeofNotInitializedRepoE
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NotInitializedRepoError")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("ipfs-repo-migrations", "errors.RequiredParameterError")
    @js.native
    open class RequiredParameterError protected ()
      extends typingsJapgolly.ipfsRepoMigrations.distSrcErrorsMod.RequiredParameterError {
      /**
        * @param {string} message
        */
      def this(message: String) = this()
    }
    @JSImport("ipfs-repo-migrations", "errors.RequiredParameterError")
    @js.native
    def RequiredParameterError: (Instantiable1[
        /* message */ String, 
        typingsJapgolly.ipfsRepoMigrations.distSrcErrorsMod.RequiredParameterError
      ]) | TypeofRequiredParameterEr = js.native
    inline def RequiredParameterError_=(
      x: (Instantiable1[
          /* message */ String, 
          typingsJapgolly.ipfsRepoMigrations.distSrcErrorsMod.RequiredParameterError
        ]) | TypeofRequiredParameterEr
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RequiredParameterError")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-repo-migrations", "getCurrentRepoVersion")
  @js.native
  val getCurrentRepoVersion: js.Function1[/* backends */ Backends, js.Promise[Double]] = js.native
  
  inline def getLatestMigrationVersion(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLatestMigrationVersion")().asInstanceOf[Double]
  inline def getLatestMigrationVersion(migrations: js.Array[typingsJapgolly.ipfsRepoMigrations.distSrcTypesMod.Migration]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLatestMigrationVersion")(migrations.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def migrate(path: String, backends: Backends, repoOptions: RepoOptions, toVersion: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("migrate")(path.asInstanceOf[js.Any], backends.asInstanceOf[js.Any], repoOptions.asInstanceOf[js.Any], toVersion.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def migrate(
    path: String,
    backends: Backends,
    repoOptions: RepoOptions,
    toVersion: Double,
    options: typingsJapgolly.ipfsRepoMigrations.distSrcTypesMod.MigrationOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("migrate")(path.asInstanceOf[js.Any], backends.asInstanceOf[js.Any], repoOptions.asInstanceOf[js.Any], toVersion.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("ipfs-repo-migrations", "migrations")
  @js.native
  val migrations: js.Array[typingsJapgolly.ipfsRepoMigrations.distSrcTypesMod.Migration] = js.native
  
  inline def revert(path: String, backends: Backends, repoOptions: RepoOptions, toVersion: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("revert")(path.asInstanceOf[js.Any], backends.asInstanceOf[js.Any], repoOptions.asInstanceOf[js.Any], toVersion.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def revert(
    path: String,
    backends: Backends,
    repoOptions: RepoOptions,
    toVersion: Double,
    options: typingsJapgolly.ipfsRepoMigrations.distSrcTypesMod.MigrationOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("revert")(path.asInstanceOf[js.Any], backends.asInstanceOf[js.Any], repoOptions.asInstanceOf[js.Any], toVersion.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  type Migration = typingsJapgolly.ipfsRepoMigrations.distSrcTypesMod.Migration
  
  type MigrationOptions = typingsJapgolly.ipfsRepoMigrations.distSrcTypesMod.MigrationOptions
  
  type MigrationProgressCallback = typingsJapgolly.ipfsRepoMigrations.distSrcTypesMod.MigrationProgressCallback
  
  type ProgressCallback = typingsJapgolly.ipfsRepoMigrations.distSrcTypesMod.ProgressCallback
}
