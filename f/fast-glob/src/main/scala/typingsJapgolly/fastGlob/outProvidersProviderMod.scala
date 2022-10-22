package typingsJapgolly.fastGlob

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fastGlob.outManagersTasksMod.Task
import typingsJapgolly.fastGlob.outTypesMod.MicromatchOptions
import typingsJapgolly.fastGlob.outTypesMod.ReaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersProviderMod {
  
  /* note: abstract class */ @JSImport("fast-glob/out/providers/provider", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with Provider[T] {
    def this(_settings: typingsJapgolly.fastGlob.outSettingsMod.default) = this()
    
    /* protected */ /* CompleteClass */
    override def _getMicromatchOptions(): MicromatchOptions = js.native
    
    /* protected */ /* CompleteClass */
    override def _getReaderOptions(task: Task): ReaderOptions = js.native
    
    /* protected */ /* CompleteClass */
    override def _getRootDirectory(task: Task): String = js.native
    
    /* protected */ /* CompleteClass */
    override val _settings: typingsJapgolly.fastGlob.outSettingsMod.default = js.native
    
    /* CompleteClass */
    override val deepFilter: typingsJapgolly.fastGlob.outProvidersFiltersDeepMod.default = js.native
    
    /* CompleteClass */
    override val entryFilter: typingsJapgolly.fastGlob.outProvidersFiltersEntryMod.default = js.native
    
    /* CompleteClass */
    override val entryTransformer: typingsJapgolly.fastGlob.outProvidersTransformersEntryMod.default = js.native
    
    /* CompleteClass */
    override val errorFilter: typingsJapgolly.fastGlob.outProvidersFiltersErrorMod.default = js.native
    
    /* CompleteClass */
    override def read(_task: Task): T = js.native
  }
  
  trait Provider[T] extends StObject {
    
    /* protected */ def _getMicromatchOptions(): MicromatchOptions
    
    /* protected */ def _getReaderOptions(task: Task): ReaderOptions
    
    /* protected */ def _getRootDirectory(task: Task): String
    
    /* protected */ val _settings: typingsJapgolly.fastGlob.outSettingsMod.default
    
    val deepFilter: typingsJapgolly.fastGlob.outProvidersFiltersDeepMod.default
    
    val entryFilter: typingsJapgolly.fastGlob.outProvidersFiltersEntryMod.default
    
    val entryTransformer: typingsJapgolly.fastGlob.outProvidersTransformersEntryMod.default
    
    val errorFilter: typingsJapgolly.fastGlob.outProvidersFiltersErrorMod.default
    
    def read(_task: Task): T
  }
  object Provider {
    
    inline def apply[T](
      _getMicromatchOptions: CallbackTo[MicromatchOptions],
      _getReaderOptions: Task => ReaderOptions,
      _getRootDirectory: Task => String,
      _settings: typingsJapgolly.fastGlob.outSettingsMod.default,
      deepFilter: typingsJapgolly.fastGlob.outProvidersFiltersDeepMod.default,
      entryFilter: typingsJapgolly.fastGlob.outProvidersFiltersEntryMod.default,
      entryTransformer: typingsJapgolly.fastGlob.outProvidersTransformersEntryMod.default,
      errorFilter: typingsJapgolly.fastGlob.outProvidersFiltersErrorMod.default,
      read: Task => T
    ): Provider[T] = {
      val __obj = js.Dynamic.literal(_getMicromatchOptions = _getMicromatchOptions.toJsFn, _getReaderOptions = js.Any.fromFunction1(_getReaderOptions), _getRootDirectory = js.Any.fromFunction1(_getRootDirectory), _settings = _settings.asInstanceOf[js.Any], deepFilter = deepFilter.asInstanceOf[js.Any], entryFilter = entryFilter.asInstanceOf[js.Any], entryTransformer = entryTransformer.asInstanceOf[js.Any], errorFilter = errorFilter.asInstanceOf[js.Any], read = js.Any.fromFunction1(read))
      __obj.asInstanceOf[Provider[T]]
    }
    
    extension [Self <: Provider[?], T](x: Self & Provider[T]) {
      
      inline def setDeepFilter(value: typingsJapgolly.fastGlob.outProvidersFiltersDeepMod.default): Self = StObject.set(x, "deepFilter", value.asInstanceOf[js.Any])
      
      inline def setEntryFilter(value: typingsJapgolly.fastGlob.outProvidersFiltersEntryMod.default): Self = StObject.set(x, "entryFilter", value.asInstanceOf[js.Any])
      
      inline def setEntryTransformer(value: typingsJapgolly.fastGlob.outProvidersTransformersEntryMod.default): Self = StObject.set(x, "entryTransformer", value.asInstanceOf[js.Any])
      
      inline def setErrorFilter(value: typingsJapgolly.fastGlob.outProvidersFiltersErrorMod.default): Self = StObject.set(x, "errorFilter", value.asInstanceOf[js.Any])
      
      inline def setRead(value: Task => T): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def set_getMicromatchOptions(value: CallbackTo[MicromatchOptions]): Self = StObject.set(x, "_getMicromatchOptions", value.toJsFn)
      
      inline def set_getReaderOptions(value: Task => ReaderOptions): Self = StObject.set(x, "_getReaderOptions", js.Any.fromFunction1(value))
      
      inline def set_getRootDirectory(value: Task => String): Self = StObject.set(x, "_getRootDirectory", js.Any.fromFunction1(value))
      
      inline def set_settings(value: typingsJapgolly.fastGlob.outSettingsMod.default): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    }
  }
}
