package typingsJapgolly.jsGit.JSGit

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repo extends js.Object {
  /**
  		 * Convenience wrapper that fetches from a remote instance and calls repo.unpack with the resulting packfile stream for you.
  		 */
  def fetch(remote: Remote, opts: js.Object, callback: js.Function1[/* err */ js.Any, Unit]): Unit
  /**
  		 * Read the current active branch.
  		 */
  def getHead(callback: js.Function2[/* err */ js.Any, /* ref_name */ String, Unit]): Unit
  /**
  		 * Load a git object from the database. You can pass in either a hash or a symbolic name like HEAD or refs/tags/v3.1.4.
  		 *
  		 * The object will be of the form:
  		 * {
  		 *   type: "commit", // Or "tag", "tree", or "blob"
  		 *   body: { ... } // Or an array for tree and a binary value for blob.
  		 * }
  		 */
  def load(hashish: String, callback: js.Function2[/* err */ js.Any, /* git_object */ GitObject, Unit]): Unit
  /**
  		 * This convenience wrapper will call repo.load for you and then check if the type is what you expected. If it is, it will return the body directly. If it's not, it will error.
  		 *
  		 * var commit = yield repo.loadAs("commit", "HEAD");
  		 * var tree = yield repo.loadAs("tree", commit.tree);
  		 *
  		 * I'm using yield syntax because it's simpler, you can use callbacks instead if you prefer.
  		 */
  def loadAs(`type`: String, hash: String, callback: js.Function2[/* err */ js.Any, /* body */ js.Any, Unit]): Unit
  /**
  		 * This convenience wrapper creates a readable stream of the history sorted by author date.
  		 * If you want full history, pass in HEAD for the hash.
  		 */
  def logWalk(hashish: String, callback: js.Function2[/* err */ js.Any, /* log_stream */ js.Any, Unit]): Unit
  /**
  		 * Remove an object.
  		 */
  def remove(hash: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit
  /**
  		 * Resolve a ref, branch, or tag to a real hash.
  		 */
  def resolveHashish(hashish: String, callback: js.Function2[/* err */ js.Any, /* hash */ String, Unit]): Unit
  /**
  		 * Save an object to the database. This will give you back the hash of the cotent by which you can retrieve the value back.
  		 */
  def save(git_object: GitObject, callback: js.Function2[/* err */ js.Any, /* hash */ String, Unit]): Unit
  /**
  		 * Another convenience wrapper, this time to save objects as a specefic type. The body must be in the right format.
  		 *
  		 * var blobHash = yield repo.saveAs("blob", binaryData);
  		 * var treeHash = yield repo.saveAs("tree", [
  		 *   { mode: 0100644, name: "file.dat", hash: blobHash }
  		 * ]);
  		 * var commitHash = yield repo.saveAs("commit", {
  		 *   tree: treeHash,
  		 *   author: { name: "Tim Caswell", email: "tim@creationix.com", date: new Date },
  		 *   message: "Save the blob"
  		 * });
  		 */
  def saveAs(`type`: String, body: js.Any, callback: js.Function2[/* err */ js.Any, /* hash */ String, Unit]): Unit
  /**
  		 * Set the current active branch.
  		 */
  def setHead(ref: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit
  /**
  		 * This helper will return a stream of files suitable for traversing a file tree as a linear stream. The hash can be a ref to a commit, a commit hash or a tree hash directly.
  		 */
  def treeWalk(hashish: String, callback: js.Function2[/* err */ js.Any, /* file_stream */ js.Any, Unit]): Unit
  /**
  		 * Import a packfile stream (simple-stream format) into the current database. This is used mostly for clone and fetch operations where the stream comes from a remote repo.
  		 *
  		 * opts is a hash of optional configs.
  		 *
  		 * opts.onProgress(progress) - listen to the git progress channel by passing in a event listener.
  		 * opts.onError(error) - same thing, but for the error channel.
  		 * opts.deline - If this is truthy, the progress and error messages will be rechunked to be whole lines. They usually come jumbled in the internal sidechannel.
  		 */
  def unpack(packFileStream: js.Any, opts: js.Object, callback: js.Function1[/* err */ js.Any, Unit]): Unit
  /**
  		 * Update whatever branch HEAD is pointing to so that it points to hash.
  		 * You'll usually want to do this after creating a new commint in the HEAD branch.
  		 */
  def updateHead(hash: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit
  /**
  		 * This is the generic helper that logWalk and treeWalk use. See js-git.js source for usage.
  		 */
  def walk(seed: js.Any, scan: js.Any, loadKey: js.Any, compare: js.Any): js.Any
}

object Repo {
  @scala.inline
  def apply(
    fetch: (Remote, js.Object, js.Function1[/* err */ js.Any, Unit]) => Callback,
    getHead: js.Function2[/* err */ js.Any, /* ref_name */ String, Unit] => Callback,
    load: (String, js.Function2[/* err */ js.Any, /* git_object */ GitObject, Unit]) => Callback,
    loadAs: (String, String, js.Function2[/* err */ js.Any, /* body */ js.Any, Unit]) => Callback,
    logWalk: (String, js.Function2[/* err */ js.Any, /* log_stream */ js.Any, Unit]) => Callback,
    remove: (String, js.Function1[/* err */ js.Any, Unit]) => Callback,
    resolveHashish: (String, js.Function2[/* err */ js.Any, /* hash */ String, Unit]) => Callback,
    save: (GitObject, js.Function2[/* err */ js.Any, /* hash */ String, Unit]) => Callback,
    saveAs: (String, js.Any, js.Function2[/* err */ js.Any, /* hash */ String, Unit]) => Callback,
    setHead: (String, js.Function1[/* err */ js.Any, Unit]) => Callback,
    treeWalk: (String, js.Function2[/* err */ js.Any, /* file_stream */ js.Any, Unit]) => Callback,
    unpack: (js.Any, js.Object, js.Function1[/* err */ js.Any, Unit]) => Callback,
    updateHead: (String, js.Function1[/* err */ js.Any, Unit]) => Callback,
    walk: (js.Any, js.Any, js.Any, js.Any) => CallbackTo[js.Any]
  ): Repo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fetch")(js.Any.fromFunction3((t0: typingsJapgolly.jsGit.JSGit.Remote, t1: js.Object, t2: js.Function1[/* err */ js.Any, scala.Unit]) => fetch(t0, t1, t2).runNow()))
    __obj.updateDynamic("getHead")(js.Any.fromFunction1((t0: js.Function2[/* err */ js.Any, /* ref_name */ java.lang.String, scala.Unit]) => getHead(t0).runNow()))
    __obj.updateDynamic("load")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[/* err */ js.Any, /* git_object */ typingsJapgolly.jsGit.JSGit.GitObject, scala.Unit]) => load(t0, t1).runNow()))
    __obj.updateDynamic("loadAs")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Function2[/* err */ js.Any, /* body */ js.Any, scala.Unit]) => loadAs(t0, t1, t2).runNow()))
    __obj.updateDynamic("logWalk")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[/* err */ js.Any, /* log_stream */ js.Any, scala.Unit]) => logWalk(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* err */ js.Any, scala.Unit]) => remove(t0, t1).runNow()))
    __obj.updateDynamic("resolveHashish")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[/* err */ js.Any, /* hash */ java.lang.String, scala.Unit]) => resolveHashish(t0, t1).runNow()))
    __obj.updateDynamic("save")(js.Any.fromFunction2((t0: typingsJapgolly.jsGit.JSGit.GitObject, t1: js.Function2[/* err */ js.Any, /* hash */ java.lang.String, scala.Unit]) => save(t0, t1).runNow()))
    __obj.updateDynamic("saveAs")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Function2[/* err */ js.Any, /* hash */ java.lang.String, scala.Unit]) => saveAs(t0, t1, t2).runNow()))
    __obj.updateDynamic("setHead")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* err */ js.Any, scala.Unit]) => setHead(t0, t1).runNow()))
    __obj.updateDynamic("treeWalk")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[/* err */ js.Any, /* file_stream */ js.Any, scala.Unit]) => treeWalk(t0, t1).runNow()))
    __obj.updateDynamic("unpack")(js.Any.fromFunction3((t0: js.Any, t1: js.Object, t2: js.Function1[/* err */ js.Any, scala.Unit]) => unpack(t0, t1, t2).runNow()))
    __obj.updateDynamic("updateHead")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* err */ js.Any, scala.Unit]) => updateHead(t0, t1).runNow()))
    __obj.updateDynamic("walk")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => walk(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Repo]
  }
}

