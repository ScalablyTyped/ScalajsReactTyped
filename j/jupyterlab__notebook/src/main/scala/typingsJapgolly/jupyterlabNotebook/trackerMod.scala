package typingsJapgolly.jupyterlabNotebook

import typingsJapgolly.jupyterlabApputils.mod.WidgetTracker
import typingsJapgolly.jupyterlabCells.mod.Cell
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IRestorable.IOptions
import typingsJapgolly.jupyterlabNotebook.panelMod.NotebookPanel
import typingsJapgolly.jupyterlabNotebook.tokensMod.INotebookTracker
import typingsJapgolly.phosphorSignaling.mod.ISignal
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/tracker", JSImport.Namespace)
@js.native
object trackerMod extends js.Object {
  @js.native
  class NotebookTracker ()
    extends WidgetTracker[NotebookPanel]
       with INotebookTracker {
    var _activeCell: js.Any = js.native
    var _activeCellChanged: js.Any = js.native
    var _onActiveCellChanged: js.Any = js.native
    var _onSelectionChanged: js.Any = js.native
    var _selectionChanged: js.Any = js.native
    /**
      * The currently focused cell.
      *
      * #### Notes
      * If there is no cell with the focus, then this value is `null`.
      */
    /* CompleteClass */
    override val activeCell: Cell = js.native
    /**
      * A signal emitted when the current active cell changes.
      *
      * #### Notes
      * If there is no cell with the focus, then `null` will be emitted.
      */
    /* CompleteClass */
    override val activeCellChanged: ISignal[this.type, Cell] = js.native
    /**
      * A signal emitted when the current instance changes.
      *
      * #### Notes
      * If the last instance being tracked is disposed, `null` will be emitted.
      */
    /* InferMemberOverrides */
    override val currentChanged: ISignal[this.type, NotebookPanel | Null] = js.native
    /**
      * The current widget is the most recently focused or added widget.
      *
      * #### Notes
      * It is the most recently focused widget, or the most recently added
      * widget if no widget has taken focus.
      */
    /* InferMemberOverrides */
    override val currentWidget: NotebookPanel | Null = js.native
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* InferMemberOverrides */
    override val isDisposed: Boolean = js.native
    /**
      * A promise that is resolved when the widget tracker has been
      * restored from a serialized state.
      *
      * #### Notes
      * Most client code will not need to use this, since they can wait
      * for the whole application to restore. However, if an extension
      * wants to perform actions during the application restoration, but
      * after the restoration of another widget tracker, they can use
      * this promise.
      */
    /* InferMemberOverrides */
    override val restored: js.Promise[Unit] with js.Promise[js.Any] = js.native
    /**
      * A signal emitted when the selection state changes.
      */
    /* CompleteClass */
    override val selectionChanged: ISignal[this.type, Unit] = js.native
    /**
      * The number of instances held by the tracker.
      */
    /* InferMemberOverrides */
    override val size: Double = js.native
    /**
      * A signal emitted when a widget is added.
      */
    /* InferMemberOverrides */
    override val widgetAdded: ISignal[this.type, NotebookPanel] = js.native
    /**
      * A signal emitted when a widget is updated.
      */
    /* InferMemberOverrides */
    override val widgetUpdated: ISignal[this.type, NotebookPanel] = js.native
    /**
      * Add a new widget to the tracker.
      *
      * @param widget - The widget being added.
      *
      * #### Notes
      * The widget passed into the tracker is added synchronously; its existence in
      * the tracker can be checked with the `has()` method. The promise this method
      * returns resolves after the widget has been added and saved to an underlying
      * restoration connector, if one is available.
      */
    /* InferMemberOverrides */
    override def add(widget: NotebookPanel): js.Promise[Unit] = js.native
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    /**
      * Filter the instances in the tracker based on a predicate.
      *
      * @param fn - The function by which to filter.
      */
    /* InferMemberOverrides */
    override def filter(fn: js.Function1[NotebookPanel, Boolean]): js.Array[NotebookPanel] = js.native
    /**
      * Find the first instance in the tracker that satisfies a filter function.
      *
      * @param - fn The filter function to call on each instance.
      *
      * #### Notes
      * If nothing is found, the value returned is `undefined`.
      */
    /* InferMemberOverrides */
    override def find(fn: js.Function1[NotebookPanel, Boolean]): js.UndefOr[NotebookPanel] = js.native
    /**
      * Iterate through each instance in the tracker.
      *
      * @param fn - The function to call on each instance.
      */
    /* InferMemberOverrides */
    override def forEach(fn: js.Function1[NotebookPanel, Unit]): Unit = js.native
    /**
      * Check if this tracker has the specified instance.
      *
      * @param obj - The object whose existence is being checked.
      */
    /* InferMemberOverrides */
    override def has(obj: Widget): Boolean = js.native
    /**
      * Inject an instance into the widget tracker without the tracker handling
      * its restoration lifecycle.
      *
      * @param obj - The instance to inject into the tracker.
      */
    /* InferMemberOverrides */
    override def inject(obj: NotebookPanel): Unit = js.native
    /* InferMemberOverrides */
    /* protected */ override def onCurrentChanged(): Unit = js.native
    /**
      * Handle the current change event.
      *
      * #### Notes
      * The default implementation is a no-op.
      */
    /* InferMemberOverrides */
    /* protected */ override def onCurrentChanged(value: NotebookPanel): Unit = js.native
    /**
      * Restore the objects in this restorable collection.
      *
      * @param options - The configuration options that describe restoration.
      *
      * @returns A promise that settles when restored with `any` results.
      *
      */
    /* InferMemberOverrides */
    override def restore(options: IOptions[NotebookPanel]): js.Promise[js.Any] = js.native
    /**
      * Save the restore data for a given widget.
      *
      * @param widget - The widget being saved.
      */
    /* InferMemberOverrides */
    override def save(widget: NotebookPanel): js.Promise[Unit] = js.native
  }
  
}

