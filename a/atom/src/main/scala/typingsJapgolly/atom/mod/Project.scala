package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Project extends js.Object {
  /** Add a path to the project's list of root paths. */
  def addPath(projectPath: String): Unit
  /**
    *  Determines whether the given path (real or symbolic) is inside the
    *  project's directory.
    */
  def contains(pathToCheck: String): Boolean
  /** Get an Array of Directorys associated with this project. */
  def getDirectories(): js.Array[Directory]
  // Managing Paths
  /** Get an Array of strings containing the paths of the project's directories. */
  def getPaths(): js.Array[String]
  // Accessing the Git Repository
  /**
    * Get an Array of GitRepositorys associated with the project's directories.
    *
    * This method will be removed in 2.0 because it does synchronous I/O.
    */
  def getRepositories(): js.Array[GitRepository]
  /**
    *  Access a promise that resolves when the filesystem watcher associated with a
    *  project root directory is ready to begin receiving events.
    */
  def getWatcherPromise(projectPath: String): js.Promise[PathWatcher]
  /**
    *  Invoke the given callback with all current and future text buffers in
    *  the project.
    */
  def observeBuffers(callback: js.Function1[/* buffer */ TextBuffer, Unit]): Disposable
  /** Invoke the given callback with all current and future repositories in the project. */
  def observeRepositories(callback: js.Function1[/* repository */ GitRepository, Unit]): Disposable
  /** Invoke the given callback when a text buffer is added to the project. */
  def onDidAddBuffer(callback: js.Function1[/* buffer */ TextBuffer, Unit]): Disposable
  /** Invoke the given callback when a repository is added to the project. */
  def onDidAddRepository(callback: js.Function1[/* repository */ GitRepository, Unit]): Disposable
  /** Invoke a callback when a filesystem change occurs within any open project path. */
  def onDidChangeFiles(callback: js.Function1[/* events */ FilesystemChangeEvent, Unit]): Disposable
  // Event Subscription
  /** Invoke the given callback when the project paths change. */
  def onDidChangePaths(callback: js.Function1[/* projectPaths */ js.Array[String], Unit]): Disposable
  /** Invoke a callback whenever the project's configuration has been replaced. */
  def onDidReplace(callback: js.Function1[/* projectSpec */ js.UndefOr[ProjectSpecification | Null], Unit]): Disposable
  /** Get the relative path from the project directory to the given path. */
  def relativize(fullPath: String): String
  /**
    *  Get the path to the project directory that contains the given path, and
    *  the relative path from that project directory to the given path.
    */
  def relativizePath(fullPath: String): js.Tuple2[String | Null, String]
  /** Remove a path from the project's list of root paths. */
  def removePath(projectPath: String): Unit
  /** Get the repository for a given directory asynchronously. */
  def repositoryForDirectory(directory: Directory): js.Promise[GitRepository | Null]
  /** Set the paths of the project's directories. */
  def setPaths(projectPaths: js.Array[String]): Unit
}

object Project {
  @scala.inline
  def apply(
    addPath: String => Callback,
    contains: String => CallbackTo[Boolean],
    getDirectories: CallbackTo[js.Array[Directory]],
    getPaths: CallbackTo[js.Array[String]],
    getRepositories: CallbackTo[js.Array[GitRepository]],
    getWatcherPromise: String => CallbackTo[js.Promise[PathWatcher]],
    observeBuffers: js.Function1[/* buffer */ TextBuffer, Unit] => CallbackTo[Disposable],
    observeRepositories: js.Function1[/* repository */ GitRepository, Unit] => CallbackTo[Disposable],
    onDidAddBuffer: js.Function1[/* buffer */ TextBuffer, Unit] => CallbackTo[Disposable],
    onDidAddRepository: js.Function1[/* repository */ GitRepository, Unit] => CallbackTo[Disposable],
    onDidChangeFiles: js.Function1[/* events */ FilesystemChangeEvent, Unit] => CallbackTo[Disposable],
    onDidChangePaths: js.Function1[/* projectPaths */ js.Array[String], Unit] => CallbackTo[Disposable],
    onDidReplace: js.Function1[/* projectSpec */ js.UndefOr[ProjectSpecification | Null], Unit] => CallbackTo[Disposable],
    relativize: String => CallbackTo[String],
    relativizePath: String => CallbackTo[js.Tuple2[String | Null, String]],
    removePath: String => Callback,
    repositoryForDirectory: Directory => CallbackTo[js.Promise[GitRepository | Null]],
    setPaths: js.Array[String] => Callback
  ): Project = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addPath")(js.Any.fromFunction1((t0: java.lang.String) => addPath(t0).runNow()))
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: java.lang.String) => contains(t0).runNow()))
    __obj.updateDynamic("getDirectories")(getDirectories.toJsFn)
    __obj.updateDynamic("getPaths")(getPaths.toJsFn)
    __obj.updateDynamic("getRepositories")(getRepositories.toJsFn)
    __obj.updateDynamic("getWatcherPromise")(js.Any.fromFunction1((t0: java.lang.String) => getWatcherPromise(t0).runNow()))
    __obj.updateDynamic("observeBuffers")(js.Any.fromFunction1((t0: js.Function1[/* buffer */ typingsJapgolly.atom.mod.TextBuffer, scala.Unit]) => observeBuffers(t0).runNow()))
    __obj.updateDynamic("observeRepositories")(js.Any.fromFunction1((t0: js.Function1[/* repository */ typingsJapgolly.atom.mod.GitRepository, scala.Unit]) => observeRepositories(t0).runNow()))
    __obj.updateDynamic("onDidAddBuffer")(js.Any.fromFunction1((t0: js.Function1[/* buffer */ typingsJapgolly.atom.mod.TextBuffer, scala.Unit]) => onDidAddBuffer(t0).runNow()))
    __obj.updateDynamic("onDidAddRepository")(js.Any.fromFunction1((t0: js.Function1[/* repository */ typingsJapgolly.atom.mod.GitRepository, scala.Unit]) => onDidAddRepository(t0).runNow()))
    __obj.updateDynamic("onDidChangeFiles")(js.Any.fromFunction1((t0: js.Function1[/* events */ typingsJapgolly.atom.mod.FilesystemChangeEvent, scala.Unit]) => onDidChangeFiles(t0).runNow()))
    __obj.updateDynamic("onDidChangePaths")(js.Any.fromFunction1((t0: js.Function1[/* projectPaths */ js.Array[java.lang.String], scala.Unit]) => onDidChangePaths(t0).runNow()))
    __obj.updateDynamic("onDidReplace")(js.Any.fromFunction1((t0: js.Function1[
  /* projectSpec */ js.UndefOr[typingsJapgolly.atom.mod.ProjectSpecification | scala.Null], 
  scala.Unit]) => onDidReplace(t0).runNow()))
    __obj.updateDynamic("relativize")(js.Any.fromFunction1((t0: java.lang.String) => relativize(t0).runNow()))
    __obj.updateDynamic("relativizePath")(js.Any.fromFunction1((t0: java.lang.String) => relativizePath(t0).runNow()))
    __obj.updateDynamic("removePath")(js.Any.fromFunction1((t0: java.lang.String) => removePath(t0).runNow()))
    __obj.updateDynamic("repositoryForDirectory")(js.Any.fromFunction1((t0: typingsJapgolly.atom.mod.Directory) => repositoryForDirectory(t0).runNow()))
    __obj.updateDynamic("setPaths")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => setPaths(t0).runNow()))
    __obj.asInstanceOf[Project]
  }
}

