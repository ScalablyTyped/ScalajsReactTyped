package typingsJapgolly.browserfs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeCoreFileFlagMod {
  
  @js.native
  sealed trait ActionType extends StObject
  @JSImport("browserfs/dist/node/core/file_flag", "ActionType")
  @js.native
  object ActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ActionType & Double] = js.native
    
    @js.native
    sealed trait CREATE_FILE
      extends StObject
         with ActionType
    /* 3 */ val CREATE_FILE: typingsJapgolly.browserfs.distNodeCoreFileFlagMod.ActionType.CREATE_FILE & Double = js.native
    
    @js.native
    sealed trait NOP
      extends StObject
         with ActionType
    /* 0 */ val NOP: typingsJapgolly.browserfs.distNodeCoreFileFlagMod.ActionType.NOP & Double = js.native
    
    @js.native
    sealed trait THROW_EXCEPTION
      extends StObject
         with ActionType
    /* 1 */ val THROW_EXCEPTION: typingsJapgolly.browserfs.distNodeCoreFileFlagMod.ActionType.THROW_EXCEPTION & Double = js.native
    
    @js.native
    sealed trait TRUNCATE_FILE
      extends StObject
         with ActionType
    /* 2 */ val TRUNCATE_FILE: typingsJapgolly.browserfs.distNodeCoreFileFlagMod.ActionType.TRUNCATE_FILE & Double = js.native
  }
  
  @JSImport("browserfs/dist/node/core/file_flag", "FileFlag")
  @js.native
  open class FileFlag protected () extends StObject {
    /**
      * This should never be called directly.
      * @param modeStr The string representing the mode
      * @throw when the mode string is invalid
      */
    def this(flagStr: String) = this()
    
    /* private */ var flagStr: Any = js.native
    
    /**
      * Get the underlying flag string for this flag.
      */
    def getFlagString(): String = js.native
    
    /**
      * Returns true if the file is appendable.
      */
    def isAppendable(): Boolean = js.native
    
    /**
      * Returns true if the file is open in exclusive mode.
      */
    def isExclusive(): Boolean = js.native
    
    /**
      * Returns true if the file is readable.
      */
    def isReadable(): Boolean = js.native
    
    /**
      * Returns true if the file is open in synchronous mode.
      */
    def isSynchronous(): Boolean = js.native
    
    /**
      * Returns true if the file mode should truncate.
      */
    def isTruncating(): Boolean = js.native
    
    /**
      * Returns true if the file is writeable.
      */
    def isWriteable(): Boolean = js.native
    
    /**
      * Returns one of the static fields on this object that indicates the
      * appropriate response to the path existing.
      */
    def pathExistsAction(): ActionType = js.native
    
    /**
      * Returns one of the static fields on this object that indicates the
      * appropriate response to the path not existing.
      */
    def pathNotExistsAction(): ActionType = js.native
  }
  /* static members */
  object FileFlag {
    
    @JSImport("browserfs/dist/node/core/file_flag", "FileFlag")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("browserfs/dist/node/core/file_flag", "FileFlag.flagCache")
    @js.native
    def flagCache: Any = js.native
    inline def flagCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flagCache")(x.asInstanceOf[js.Any])
    
    /**
      * Get an object representing the given file flag.
      * @param modeStr The string representing the flag
      * @return The FileFlag object representing the flag
      * @throw when the flag string is invalid
      */
    inline def getFileFlag(flagStr: String): FileFlag = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileFlag")(flagStr.asInstanceOf[js.Any]).asInstanceOf[FileFlag]
    
    @JSImport("browserfs/dist/node/core/file_flag", "FileFlag.validFlagStrs")
    @js.native
    def validFlagStrs: Any = js.native
    inline def validFlagStrs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validFlagStrs")(x.asInstanceOf[js.Any])
  }
}
