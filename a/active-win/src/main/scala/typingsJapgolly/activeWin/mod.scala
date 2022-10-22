package typingsJapgolly.activeWin

import typingsJapgolly.activeWin.activeWinStrings.linux
import typingsJapgolly.activeWin.activeWinStrings.macos
import typingsJapgolly.activeWin.activeWinStrings.windows
import typingsJapgolly.activeWin.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get metadata about the [active window](https://en.wikipedia.org/wiki/Active_window) (title, id, bounds, owner, etc).
  	@returns The active window metadata.
  	@example
  	```
  	import activeWindow = require('active-win');
  	(async () => {
  		const result = await activeWindow();
  		if (!result) {
  			return;
  		}
  		if (result.platform === 'macos') {
  			// Among other fields, result.owner.bundleId is available on macOS.
  			console.log(`Process title is ${result.title} with bundle id ${result.owner.bundleId}.`);
  		} else if (result.platform === 'windows') {
  			console.log(`Process title is ${result.title} with path ${result.owner.path}.`);
  		} else {
  			console.log(`Process title is ${result.title} with path ${result.owner.path}.`);
  		}
  	})();
  	```
  	*/
  inline def apply(): js.Promise[js.UndefOr[Result]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[js.UndefOr[Result]]]
  inline def apply(options: Options): js.Promise[js.UndefOr[Result]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Result]]]
  
  @JSImport("active-win", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Synchronously get metadata about the [active window](https://en.wikipedia.org/wiki/Active_window) (title, id, bounds, owner, etc).
  	@returns The active window metadata.
  	@example
  	```
  	import activeWindow = require('active-win');
  	const result = activeWindow.sync();
  	if (result) {
  		if (result.platform === 'macos') {
  			// Among other fields, result.owner.bundleId is available on macOS.
  			console.log(`Process title is ${result.title} with bundle id ${result.owner.bundleId}.`);
  		} else if (result.platform === 'windows') {
  			console.log(`Process title is ${result.title} with path ${result.owner.path}.`);
  		} else {
  			console.log(`Process title is ${result.title} with path ${result.owner.path}.`);
  		}
  	}
  	```
  	*/
  inline def sync(): js.UndefOr[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[js.UndefOr[Result]]
  inline def sync(options: Options): js.UndefOr[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Result]]
  
  trait BaseOwner extends StObject {
    
    /**
    		Name of the app.
    		*/
    var name: String
    
    /**
    		Path to the app.
    		*/
    var path: String
    
    /**
    		Process identifier
    		*/
    var processId: Double
  }
  object BaseOwner {
    
    inline def apply(name: String, path: String, processId: Double): BaseOwner = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseOwner]
    }
    
    extension [Self <: BaseOwner](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseResult extends StObject {
    
    /**
    		Window position and size.
    		*/
    var bounds: Height
    
    /**
    		Window identifier.
    		On Windows, there isn't a clear notion of a "Window ID". Instead it returns the memory address of the window "handle" in the `id` property. That "handle" is unique per window, so it can be used to identify them. [Read more…](https://msdn.microsoft.com/en-us/library/windows/desktop/ms632597(v=vs.85).aspx#window_handle).
    		*/
    var id: Double
    
    /**
    		Memory usage by the window.
    		*/
    var memoryUsage: Double
    
    /**
    		App that owns the window.
    		*/
    var owner: BaseOwner
    
    /**
    		Window title.
    		*/
    var title: String
  }
  object BaseResult {
    
    inline def apply(bounds: Height, id: Double, memoryUsage: Double, owner: BaseOwner, title: String): BaseResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseResult]
    }
    
    extension [Self <: BaseResult](x: Self) {
      
      inline def setBounds(value: Height): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMemoryUsage(value: Double): Self = StObject.set(x, "memoryUsage", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: BaseOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait LinuxResult
    extends StObject
       with BaseResult
       with Result {
    
    var platform: linux
  }
  object LinuxResult {
    
    inline def apply(bounds: Height, id: Double, memoryUsage: Double, owner: BaseOwner, title: String): LinuxResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = "linux", title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinuxResult]
    }
    
    extension [Self <: LinuxResult](x: Self) {
      
      inline def setPlatform(value: linux): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  trait MacOSOwner
    extends StObject
       with BaseOwner {
    
    /**
    		Bundle identifier.
    		*/
    var bundleId: String
  }
  object MacOSOwner {
    
    inline def apply(bundleId: String, name: String, path: String, processId: Double): MacOSOwner = {
      val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MacOSOwner]
    }
    
    extension [Self <: MacOSOwner](x: Self) {
      
      inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    }
  }
  
  trait MacOSResult
    extends StObject
       with BaseResult
       with Result {
    
    @JSName("owner")
    var owner_MacOSResult: MacOSOwner
    
    var platform: macos
    
    /**
    		URL of the active browser tab if the active window is Safari (includes Technology Preview), Chrome (includes Beta, Dev, and Canary), Edge (includes Beta, Dev, and Canary), Brave (includes Beta and Nightly), Mighty, Ghost Browser, WaveBox, Sidekick, Opera (includes Beta and Developer), or Vivaldi.
    		*/
    var url: js.UndefOr[String] = js.undefined
  }
  object MacOSResult {
    
    inline def apply(bounds: Height, id: Double, memoryUsage: Double, owner: MacOSOwner, title: String): MacOSResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = "macos", title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MacOSResult]
    }
    
    extension [Self <: MacOSResult](x: Self) {
      
      inline def setOwner(value: MacOSOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: macos): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
    		Enable the screen recording permission check. _(macOS)_
    		Setting this to `false` will prevent the screen recording permission prompt on macOS versions 10.15 and newer. The `title` property in the result will always be set to an empty string.
    		@default true
    		*/
    val screenRecordingPermission: Boolean
  }
  object Options {
    
    inline def apply(screenRecordingPermission: Boolean): Options = {
      val __obj = js.Dynamic.literal(screenRecordingPermission = screenRecordingPermission.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setScreenRecordingPermission(value: Boolean): Self = StObject.set(x, "screenRecordingPermission", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activeWin.mod.MacOSResult
    - typingsJapgolly.activeWin.mod.LinuxResult
    - typingsJapgolly.activeWin.mod.WindowsResult
  */
  trait Result extends StObject
  object Result {
    
    inline def LinuxResult(bounds: Height, id: Double, memoryUsage: Double, owner: BaseOwner, title: String): typingsJapgolly.activeWin.mod.LinuxResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = "linux", title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.activeWin.mod.LinuxResult]
    }
    
    inline def MacOSResult(bounds: Height, id: Double, memoryUsage: Double, owner: MacOSOwner, title: String): typingsJapgolly.activeWin.mod.MacOSResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = "macos", title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.activeWin.mod.MacOSResult]
    }
    
    inline def WindowsResult(bounds: Height, id: Double, memoryUsage: Double, owner: BaseOwner, title: String): typingsJapgolly.activeWin.mod.WindowsResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = "windows", title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.activeWin.mod.WindowsResult]
    }
  }
  
  trait WindowsResult
    extends StObject
       with BaseResult
       with Result {
    
    var platform: windows
  }
  object WindowsResult {
    
    inline def apply(bounds: Height, id: Double, memoryUsage: Double, owner: BaseOwner, title: String): WindowsResult = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = "windows", title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowsResult]
    }
    
    extension [Self <: WindowsResult](x: Self) {
      
      inline def setPlatform(value: windows): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
}
