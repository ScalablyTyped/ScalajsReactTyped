package typingsJapgolly.jsGit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JSGit {
  
  trait DB extends StObject {
    
    /**
      * This is for when the user wants to delete or otherwise reclaim your database's resources.
      */
    def clear(callback: js.Function1[/* err */ Any, Unit]): Unit
    
    /**
      * Remove an object or ref from the database.
      */
    def del(key: String, callback: js.Function1[/* err */ Any, Unit]): Unit
    
    /**
      * Load a ref or object from the database.
      * The database should assume that keys that are 40-character long hex strings are sha1 hashes. The value for these will always be binary (Buffer in node, Uint8Array in browser) All other keys are paths like refs/heads/master or HEAD and the value is a string.
      */
    def get(key: String, callback: js.Function2[/* err */ Any, /* value */ Any, Unit]): Unit
    
    /**
      * Check if a key is in the database
      */
    def has(key: String, callback: js.Function2[/* err */ Any, /* hasKey */ Boolean, Unit]): Unit
    
    /**
      * Initialize a database. This is where you db implementation can setup stuff.
      */
    def init(callback: js.Function1[/* err */ Any, Unit]): Unit
    
    /**
      * Given a path prefix, give all the keys. This is like a readdir if you treat the keys as paths.
      * For example, given the keys refs/heads/master, refs/heads/experimental, refs/tags/0.1.3 and the prefix refs/heads/, the output would be master and experimental.
      * A null prefix returns all non hash keys.
      */
    def keys(prefix: String, callback: js.Function2[/* err */ Any, /* keys */ js.Array[String], Unit]): Unit
    
    /**
      * Save a value to the database. Same rules apply about hash keys being binary values and other keys being string values.
      */
    def set(key: String, value: Any, callback: js.Function1[/* err */ Any, Unit]): Unit
  }
  object DB {
    
    inline def apply(
      clear: js.Function1[/* err */ Any, Unit] => Callback,
      del: (String, js.Function1[/* err */ Any, Unit]) => Callback,
      get: (String, js.Function2[/* err */ Any, /* value */ Any, Unit]) => Callback,
      has: (String, js.Function2[/* err */ Any, /* hasKey */ Boolean, Unit]) => Callback,
      init: js.Function1[/* err */ Any, Unit] => Callback,
      keys: (String, js.Function2[/* err */ Any, /* keys */ js.Array[String], Unit]) => Callback,
      set: (String, Any, js.Function1[/* err */ Any, Unit]) => Callback
    ): DB = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1((t0: js.Function1[/* err */ Any, Unit]) => clear(t0).runNow()), del = js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ Any, Unit]) => (del(t0, t1)).runNow()), get = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* value */ Any, Unit]) => (get(t0, t1)).runNow()), has = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* hasKey */ Boolean, Unit]) => (has(t0, t1)).runNow()), init = js.Any.fromFunction1((t0: js.Function1[/* err */ Any, Unit]) => init(t0).runNow()), keys = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* keys */ js.Array[String], Unit]) => (keys(t0, t1)).runNow()), set = js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function1[/* err */ Any, Unit]) => (set(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[DB]
    }
    
    extension [Self <: DB](x: Self) {
      
      inline def setClear(value: js.Function1[/* err */ Any, Unit] => Callback): Self = StObject.set(x, "clear", js.Any.fromFunction1((t0: js.Function1[/* err */ Any, Unit]) => value(t0).runNow()))
      
      inline def setDel(value: (String, js.Function1[/* err */ Any, Unit]) => Callback): Self = StObject.set(x, "del", js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setGet(value: (String, js.Function2[/* err */ Any, /* value */ Any, Unit]) => Callback): Self = StObject.set(x, "get", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* value */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setHas(value: (String, js.Function2[/* err */ Any, /* hasKey */ Boolean, Unit]) => Callback): Self = StObject.set(x, "has", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* hasKey */ Boolean, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setInit(value: js.Function1[/* err */ Any, Unit] => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: js.Function1[/* err */ Any, Unit]) => value(t0).runNow()))
      
      inline def setKeys(value: (String, js.Function2[/* err */ Any, /* keys */ js.Array[String], Unit]) => Callback): Self = StObject.set(x, "keys", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* keys */ js.Array[String], Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSet(value: (String, Any, js.Function1[/* err */ Any, Unit]) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function1[/* err */ Any, Unit]) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait GitAuthor extends StObject {
    
    var date: js.Date
    
    var email: String
    
    var name: String
  }
  object GitAuthor {
    
    inline def apply(date: js.Date, email: String, name: String): GitAuthor = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitAuthor]
    }
    
    extension [Self <: GitAuthor](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GitCommit extends StObject {
    
    var author: GitAuthor
    
    var message: String
    
    var tree: String
  }
  object GitCommit {
    
    inline def apply(author: GitAuthor, message: String, tree: String): GitCommit = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitCommit]
    }
    
    extension [Self <: GitCommit](x: Self) {
      
      inline def setAuthor(value: GitAuthor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTree(value: String): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    }
  }
  
  trait GitObject extends StObject {
    
    var body: Any
    
    var `type`: String
  }
  object GitObject {
    
    inline def apply(body: Any, `type`: String): GitObject = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitObject]
    }
    
    extension [Self <: GitObject](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GitTree = NumberDictionary[GitTreeElem]
  
  trait GitTreeElem extends StObject {
    
    var hash: String
    
    var mode: Double
    
    var name: String
  }
  object GitTreeElem {
    
    inline def apply(hash: String, mode: Double, name: String): GitTreeElem = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitTreeElem]
    }
    
    extension [Self <: GitTreeElem](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Remote extends StObject {
    
    def close(): Unit = js.native
    def close(callback: js.Function1[/* err */ Any, Unit]): Unit = js.native
    
    def discover(callback: js.Function2[/* err */ Any, /* refs */ StringMap, Unit]): Unit = js.native
    
    def fetch(repo: Repo, opts: js.Object, callback: js.Function1[/* err */ Any, Unit]): Unit = js.native
    
    var hostname: String = js.native
    
    var pathname: String = js.native
  }
  
  trait Repo extends StObject {
    
    /**
      * Convenience wrapper that fetches from a remote instance and calls repo.unpack with the resulting packfile stream for you.
      */
    def fetch(remote: Remote, opts: js.Object, callback: js.Function1[/* err */ Any, Unit]): Unit
    
    /**
      * Read the current active branch.
      */
    def getHead(callback: js.Function2[/* err */ Any, /* ref_name */ String, Unit]): Unit
    
    /**
      * Load a git object from the database. You can pass in either a hash or a symbolic name like HEAD or refs/tags/v3.1.4.
      *
      * The object will be of the form:
      * {
      *   type: "commit", // Or "tag", "tree", or "blob"
      *   body: { ... } // Or an array for tree and a binary value for blob.
      * }
      */
    def load(hashish: String, callback: js.Function2[/* err */ Any, /* git_object */ GitObject, Unit]): Unit
    
    /**
      * This convenience wrapper will call repo.load for you and then check if the type is what you expected. If it is, it will return the body directly. If it's not, it will error.
      *
      * var commit = yield repo.loadAs("commit", "HEAD");
      * var tree = yield repo.loadAs("tree", commit.tree);
      *
      * I'm using yield syntax because it's simpler, you can use callbacks instead if you prefer.
      */
    def loadAs(`type`: String, hash: String, callback: js.Function2[/* err */ Any, /* body */ Any, Unit]): Unit
    
    /**
      * This convenience wrapper creates a readable stream of the history sorted by author date.
      * If you want full history, pass in HEAD for the hash.
      */
    def logWalk(hashish: String, callback: js.Function2[/* err */ Any, /* log_stream */ Any, Unit]): Unit
    
    /**
      * Remove an object.
      */
    def remove(hash: String, callback: js.Function1[/* err */ Any, Unit]): Unit
    
    /**
      * Resolve a ref, branch, or tag to a real hash.
      */
    def resolveHashish(hashish: String, callback: js.Function2[/* err */ Any, /* hash */ String, Unit]): Unit
    
    /**
      * Save an object to the database. This will give you back the hash of the cotent by which you can retrieve the value back.
      */
    def save(git_object: GitObject, callback: js.Function2[/* err */ Any, /* hash */ String, Unit]): Unit
    
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
    def saveAs(`type`: String, body: Any, callback: js.Function2[/* err */ Any, /* hash */ String, Unit]): Unit
    
    /**
      * Set the current active branch.
      */
    def setHead(ref: String, callback: js.Function1[/* err */ Any, Unit]): Unit
    
    /**
      * This helper will return a stream of files suitable for traversing a file tree as a linear stream. The hash can be a ref to a commit, a commit hash or a tree hash directly.
      */
    def treeWalk(hashish: String, callback: js.Function2[/* err */ Any, /* file_stream */ Any, Unit]): Unit
    
    /**
      * Import a packfile stream (simple-stream format) into the current database. This is used mostly for clone and fetch operations where the stream comes from a remote repo.
      *
      * opts is a hash of optional configs.
      *
      * opts.onProgress(progress) - listen to the git progress channel by passing in a event listener.
      * opts.onError(error) - same thing, but for the error channel.
      * opts.deline - If this is truthy, the progress and error messages will be rechunked to be whole lines. They usually come jumbled in the internal sidechannel.
      */
    def unpack(packFileStream: Any, opts: js.Object, callback: js.Function1[/* err */ Any, Unit]): Unit
    
    /**
      * Update whatever branch HEAD is pointing to so that it points to hash.
      * You'll usually want to do this after creating a new commint in the HEAD branch.
      */
    def updateHead(hash: String, callback: js.Function1[/* err */ Any, Unit]): Unit
    
    /**
      * This is the generic helper that logWalk and treeWalk use. See js-git.js source for usage.
      */
    def walk(seed: Any, scan: Any, loadKey: Any, compare: Any): Any
  }
  object Repo {
    
    inline def apply(
      fetch: (Remote, js.Object, js.Function1[/* err */ Any, Unit]) => Callback,
      getHead: js.Function2[/* err */ Any, /* ref_name */ String, Unit] => Callback,
      load: (String, js.Function2[/* err */ Any, /* git_object */ GitObject, Unit]) => Callback,
      loadAs: (String, String, js.Function2[/* err */ Any, /* body */ Any, Unit]) => Callback,
      logWalk: (String, js.Function2[/* err */ Any, /* log_stream */ Any, Unit]) => Callback,
      remove: (String, js.Function1[/* err */ Any, Unit]) => Callback,
      resolveHashish: (String, js.Function2[/* err */ Any, /* hash */ String, Unit]) => Callback,
      save: (GitObject, js.Function2[/* err */ Any, /* hash */ String, Unit]) => Callback,
      saveAs: (String, Any, js.Function2[/* err */ Any, /* hash */ String, Unit]) => Callback,
      setHead: (String, js.Function1[/* err */ Any, Unit]) => Callback,
      treeWalk: (String, js.Function2[/* err */ Any, /* file_stream */ Any, Unit]) => Callback,
      unpack: (Any, js.Object, js.Function1[/* err */ Any, Unit]) => Callback,
      updateHead: (String, js.Function1[/* err */ Any, Unit]) => Callback,
      walk: (Any, Any, Any, Any) => Any
    ): Repo = {
      val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction3((t0: Remote, t1: js.Object, t2: js.Function1[/* err */ Any, Unit]) => (fetch(t0, t1, t2)).runNow()), getHead = js.Any.fromFunction1((t0: js.Function2[/* err */ Any, /* ref_name */ String, Unit]) => getHead(t0).runNow()), load = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* git_object */ GitObject, Unit]) => (load(t0, t1)).runNow()), loadAs = js.Any.fromFunction3((t0: String, t1: String, t2: js.Function2[/* err */ Any, /* body */ Any, Unit]) => (loadAs(t0, t1, t2)).runNow()), logWalk = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* log_stream */ Any, Unit]) => (logWalk(t0, t1)).runNow()), remove = js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ Any, Unit]) => (remove(t0, t1)).runNow()), resolveHashish = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* hash */ String, Unit]) => (resolveHashish(t0, t1)).runNow()), save = js.Any.fromFunction2((t0: GitObject, t1: js.Function2[/* err */ Any, /* hash */ String, Unit]) => (save(t0, t1)).runNow()), saveAs = js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function2[/* err */ Any, /* hash */ String, Unit]) => (saveAs(t0, t1, t2)).runNow()), setHead = js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ Any, Unit]) => (setHead(t0, t1)).runNow()), treeWalk = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* file_stream */ Any, Unit]) => (treeWalk(t0, t1)).runNow()), unpack = js.Any.fromFunction3((t0: Any, t1: js.Object, t2: js.Function1[/* err */ Any, Unit]) => (unpack(t0, t1, t2)).runNow()), updateHead = js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ Any, Unit]) => (updateHead(t0, t1)).runNow()), walk = js.Any.fromFunction4(walk))
      __obj.asInstanceOf[Repo]
    }
    
    extension [Self <: Repo](x: Self) {
      
      inline def setFetch(value: (Remote, js.Object, js.Function1[/* err */ Any, Unit]) => Callback): Self = StObject.set(x, "fetch", js.Any.fromFunction3((t0: Remote, t1: js.Object, t2: js.Function1[/* err */ Any, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGetHead(value: js.Function2[/* err */ Any, /* ref_name */ String, Unit] => Callback): Self = StObject.set(x, "getHead", js.Any.fromFunction1((t0: js.Function2[/* err */ Any, /* ref_name */ String, Unit]) => value(t0).runNow()))
      
      inline def setLoad(value: (String, js.Function2[/* err */ Any, /* git_object */ GitObject, Unit]) => Callback): Self = StObject.set(x, "load", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* git_object */ GitObject, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setLoadAs(value: (String, String, js.Function2[/* err */ Any, /* body */ Any, Unit]) => Callback): Self = StObject.set(x, "loadAs", js.Any.fromFunction3((t0: String, t1: String, t2: js.Function2[/* err */ Any, /* body */ Any, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setLogWalk(value: (String, js.Function2[/* err */ Any, /* log_stream */ Any, Unit]) => Callback): Self = StObject.set(x, "logWalk", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* log_stream */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setRemove(value: (String, js.Function1[/* err */ Any, Unit]) => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setResolveHashish(value: (String, js.Function2[/* err */ Any, /* hash */ String, Unit]) => Callback): Self = StObject.set(x, "resolveHashish", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* hash */ String, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSave(value: (GitObject, js.Function2[/* err */ Any, /* hash */ String, Unit]) => Callback): Self = StObject.set(x, "save", js.Any.fromFunction2((t0: GitObject, t1: js.Function2[/* err */ Any, /* hash */ String, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSaveAs(value: (String, Any, js.Function2[/* err */ Any, /* hash */ String, Unit]) => Callback): Self = StObject.set(x, "saveAs", js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function2[/* err */ Any, /* hash */ String, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setSetHead(value: (String, js.Function1[/* err */ Any, Unit]) => Callback): Self = StObject.set(x, "setHead", js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setTreeWalk(value: (String, js.Function2[/* err */ Any, /* file_stream */ Any, Unit]) => Callback): Self = StObject.set(x, "treeWalk", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* file_stream */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setUnpack(value: (Any, js.Object, js.Function1[/* err */ Any, Unit]) => Callback): Self = StObject.set(x, "unpack", js.Any.fromFunction3((t0: Any, t1: js.Object, t2: js.Function1[/* err */ Any, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setUpdateHead(value: (String, js.Function1[/* err */ Any, Unit]) => Callback): Self = StObject.set(x, "updateHead", js.Any.fromFunction2((t0: String, t1: js.Function1[/* err */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setWalk(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "walk", js.Any.fromFunction4(value))
    }
  }
  
  type StringMap = StringDictionary[String]
}
